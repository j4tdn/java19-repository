package streamadv.view;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import streamadv.bean.Store;
import static utils.CollectionUtils.*;

public class ManageSystem {
	
	static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		Integer n = enterAllocationAmount();
		List<Store> storesChoosed = chooseStore(mockData());
		generate("Init", storesChoosed);
		handleAllocation(storesChoosed, n);
		
	}
	
	private static Integer enterAllocationAmount() {
		System.out.print("Enter Allocation Amount: ");
		Integer n = Integer.parseInt(ip.nextLine());
		return n;
	}
	
	private static List<Store> chooseStore(List<Store> stores){
		System.out.print("Enter store id you choose: ");
		String storesChoosed = ip.nextLine();
		List<String> storeIds = Arrays.asList(storesChoosed.split(" "));
		return stores.stream()
				.filter(store -> storeIds.contains(store.getStoreId().toString()))
				.map(store -> {store.setIsSelected(true);
								return store;} )
				.collect(Collectors.toList());
	}
	
	private static BigDecimal getAverageExpectSale() {
		List<BigDecimal> expectSale = mockData().stream()
												.filter(store -> store.getExpectedSales() != null)
												.map(Store::getExpectedSales).collect(Collectors.toList());
		return expectSale.stream()
				.reduce(BigDecimal.ZERO, (a, b) -> a.add(b))
				.divide(new BigDecimal(expectSale.size()), 1, RoundingMode.HALF_EVEN);
	}

	private static BigDecimal caculateExpectSaleForStoresNoExpectSaleHasReferenceStore(Store store) {
		Store storeReference = mockData()
				.stream()
				.filter(storeCheck -> storeCheck.getStoreId().equals(store.getReferenceStoreId()))
				.collect(Collectors.toList()).get(0);
		BigDecimal newExpectedSales = (storeReference.getExpectedSales() != null ) ?
											 storeReference.getExpectedSales() : getAverageExpectSale();
		return newExpectedSales;
		
	}
	
	private static List<Store> handleStepOne(List<Store> stores) {
		Boolean useCase1 = stores.stream().anyMatch(store -> store.getExpectedSales() == null);
		if(useCase1) {
			List<Store> storesNoExpectSaleNoReferenceStore = stores.stream()
					.filter(store -> (store.getExpectedSales() == null && store.getReferenceStoreId() == null))
					.collect(Collectors.toList());
			if(stores.size() > storesNoExpectSaleNoReferenceStore.size()) {
				BigDecimal averageExpectSale = getAverageExpectSale();
				storesNoExpectSaleNoReferenceStore.forEach(store -> store.setExpectedSales(averageExpectSale));
				
				List<Store> storesNoExpectSaleHasReferenceStore = stores.stream()
						.filter(store -> (store.getExpectedSales() == null && store.getReferenceStoreId() != null) )
						.collect(Collectors.toList());
				if(storesNoExpectSaleHasReferenceStore.size() > 0) {
					storesNoExpectSaleHasReferenceStore.forEach(store -> store.setExpectedSales(caculateExpectSaleForStoresNoExpectSaleHasReferenceStore(store)));
				}
				stores.addAll(storesNoExpectSaleHasReferenceStore);
				stores.addAll(storesNoExpectSaleNoReferenceStore);
				return stores.stream().distinct().collect(Collectors.toList());				
			}
			else {
				return Collections.emptyList();
			}
		}
		return stores;
	}

	private static Map<Integer, Long> handleStepTwoAndThree(List<Store> stores, Integer amountAllocate) {
		BigDecimal sumExpectedSales = BigDecimal.ZERO;
		BigDecimal sumStockPreviousDay = BigDecimal.ZERO; 
		for(Store store: stores) {
			sumExpectedSales = sumExpectedSales.add(store.getExpectedSales());
			sumStockPreviousDay = sumStockPreviousDay.add(store.getStockPreviousDay());
		}
		/*
		 calculation formula:
		 Amount Allocated Store = Allocation Key Store * (Allocation Amount + Σ Stock Previous Day Store ) - Stock Previous Day Store
		 */
		Map<Integer, Long> allocatioAmountsByStoreId = new HashMap<>();
		for(Store store: stores) {
			BigDecimal allocationKey = store.getExpectedSales()
										.divide(bdround(sumExpectedSales,0), 10, RoundingMode.HALF_EVEN);
			Long newAllocationAmount = allocationKey.multiply(sumStockPreviousDay.add(bd(amountAllocate)))
										.subtract(store.getStockPreviousDay()).setScale(0, RoundingMode.HALF_EVEN)
										.longValue();
			newAllocationAmount = newAllocationAmount > 0 ? newAllocationAmount : 0;
			allocatioAmountsByStoreId.put(store.getStoreId(), newAllocationAmount);
		}
		return allocatioAmountsByStoreId;
	}
	
	private static Map<Integer, Long> handleStepFour(List<Store> stores, Map<Integer, Long> allocatioAmountsByStoreId, Integer amountAllocate) {
		Map<Integer,Long> demandStores = new HashMap<>();
		Map<Integer,Long> differencesMap = new HashMap<>();
		Long sumAllocationAmount = 0L;
		for(Store store: stores) {
			Long newDemand = store.getExpectedSales()
							.subtract(store.getStockPreviousDay())
							.setScale(0, RoundingMode.HALF_EVEN)
							.longValue();
			newDemand = newDemand > 0 ?  newDemand : 0L;
			demandStores.put(store.getStoreId(),newDemand);
			Long differenceValue = allocatioAmountsByStoreId.get(store.getStoreId()) - newDemand;
			differencesMap.put(store.getStoreId(),differenceValue);
			sumAllocationAmount += allocatioAmountsByStoreId.get(store.getStoreId());
		}	
		/*
		 If sum of rounded Amounts Allocated over all stores checked via checkbox matches Allocation Amount added in field above the table:
		 */
		if(!sumAllocationAmount.equals(amountAllocate.longValue())) {
			stores.sort(new Comparator<Store>() {
				@Override
				public int compare(Store s1, Store s2) {
					// sorting by differenceValue DESC, demand ASC, Expected Sales ASC, StoreId ASC
					if (differencesMap.get(s1.getStoreId()).equals(differencesMap.get(s2.getStoreId()))) {
						if (demandStores.get(s1.getStoreId()).equals(demandStores.get(s2.getStoreId()))) {
							if (s1.getExpectedSales().equals(s2.getExpectedSales())) {
								return s1.getStoreId().compareTo(s2.getStoreId());
							}
							return s1.getExpectedSales().compareTo(s2.getExpectedSales());
						}
						return demandStores.get(s1.getStoreId()).compareTo(demandStores.get(s2.getStoreId()));
					}
					return differencesMap.get(s2.getStoreId()).compareTo(differencesMap.get(s1.getStoreId()));
				}
			});
			Store storeChoosed = null;
			Integer caseDetermined = null;
			if(sumAllocationAmount > amountAllocate) {
				storeChoosed = stores.get(0);
				caseDetermined = -1;
			}
			if(sumAllocationAmount < amountAllocate) {
				storeChoosed = stores.get(stores.size() - 1);
				caseDetermined = 1;
			}
			if(storeChoosed.getExpectedSales().compareTo(bd(0)) == 1) {
				Long newAllocationAmount = allocatioAmountsByStoreId.get(storeChoosed.getStoreId());
				do {
					newAllocationAmount += caseDetermined;
					sumAllocationAmount -= 1;
				} while (sumAllocationAmount.intValue() != amountAllocate);
				allocatioAmountsByStoreId.put(storeChoosed.getStoreId(), newAllocationAmount);
			}
		}
		return allocatioAmountsByStoreId;
	}
	
	private static void handleAllocation(List<Store> stores, Integer amountAllocate) {
		// Step one
		List<Store> storesStepOne = handleStepOne(stores);
		if(storesStepOne.isEmpty()) {
			System.out.println("Expected sales cannot be calculated. Please add a reference store or include stores with expected sales for interpolation");
		}
		else {
			// Step two and three
			Map<Integer,Long> allocatioAmountsByStoreId = handleStepTwoAndThree(storesStepOne, amountAllocate);
			generate("Step 2-3", allocatioAmountsByStoreId);
			// Step four
			Map<Integer,Long> finalResult = handleStepFour(storesStepOne, allocatioAmountsByStoreId, amountAllocate);
			generate("Step 4", finalResult);
		}
	}
	
	public static List<Store> mockData(){
		List<Store> stores = new ArrayList<>();
		stores.add(new Store(1, null, bd(18d), bd(40d), false));
		stores.add(new Store(2, null, bd(19d), bd(20d), false));
		stores.add(new Store(3, null, bd(21d), bd(17d), false));
		stores.add(new Store(4, null, bd(14d), bd(31d), false));
		stores.add(new Store(5, null, bd(14d), bd(10d), false));
		stores.add(new Store(6, null, bd(15d), bd(30d), false));
		stores.add(new Store(7, 2   , bd(15d), null,    false));
		stores.add(new Store(8, null, bd(12d), bd(19d), false));
		stores.add(new Store(9, null, bd(17d), bd(26d), false));
		stores.add(new Store(10, null  , bd(18d), null, false));
		return stores;
	}
	
	private static BigDecimal bd(Number number) {
		return new BigDecimal(number.toString());
	}
	
	private static BigDecimal bdround(BigDecimal number, int scale) {
		return number.setScale(scale, RoundingMode.HALF_EVEN);
	}
}
