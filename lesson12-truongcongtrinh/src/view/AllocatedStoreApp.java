package view;

import static java.math.BigDecimal.valueOf;
import static utils.StoreUtils.total;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

import bean.Store;
import model.DataModel;

public class AllocatedStoreApp {
	
	public static void main(String[] args) {
		final Integer whAllocationAmount = 300;
		// Step 1: Input
		List<Store> stores = DataModel.mockStores();

		// Step 2: Do calculation
		Map<Long, Integer> storeAllocatedAmounts = doAllocation(whAllocationAmount, stores);

		// Step 3: Print out result
		System.out.println("StoreID = Allocated Amount");
		storeAllocatedAmounts.entrySet().stream().forEach(System.out::println);
	}
	
	/**
	 * Do Allocation.
	 *
	 * return map of -> Key: storeId with Long type
	 *               -> Value: storeAllocatedAmount after calculation with 4 steps
	 *
	 * @return map of storeId, storeAllocatedAmount
	 */
	
	private static Map<Long, Integer> doAllocation(Integer whAllocationAmount, List<Store> stores) {
        Map<Long, Integer> fixedAllocatedAmountMap = new HashMap<>();

        // Step 1: Filling in missing expected sales
       fillingMissingExpectedSales(stores);

       // Step 2: Calculate Allocation Key
      		Map<Store, BigDecimal> keyAllocatedMap = keyAllocated(stores);
      		
        // Step 3: Calculate Allocated Amount
      		Map<Store, Integer> amountAllocatedMap = amountAllocated(whAllocationAmount, keyAllocatedMap, stores);

      		amountAllocatedMap.entrySet().forEach(entry -> {
      			fixedAllocatedAmountMap.put(entry.getKey().getStoreId(),entry.getValue());
      		});
      		
      	// Step 4: Fix rounding issue

        return fixedAllocatedAmountMap;
    }

	
	
	/*
	 * boolean isEnough to know which case of fix issues have been choosen
	 * 	false --> not enough capacity --> need to remove one unit
	 * 	true  --> redunt space capacity --> need to add one unit
	 */
	private static Store adjustedStore(Map<Store,Integer> amountAllocatedMap,List<Store> selectedStores, boolean isEnough) {
		Map<Store, Integer> demandStoresMap = new HashMap<>();

		for (Store store : selectedStores) {
			if (store.isSelected()) {
				Integer demandValue = store.getExpectedSales().subtract(store.getStockPreviousDay()).intValue();
				demandValue = demandValue < 0 ? 0 : demandValue;
				demandStoresMap.put(store, demandValue);
			}
		}

		Map<Store,Integer> differentStoresMap = new TreeMap<>();
		for(Entry<Store,Integer> entry:amountAllocatedMap.entrySet()) {
			if(entry.getValue().equals(0)) continue;
			Integer diffValue = entry.getValue() - demandStoresMap.get(entry.getKey());
			differentStoresMap.put(entry.getKey(),diffValue);
		}
		
		selectedStores.sort(new Comparator<Store>() {
			@Override
			public int compare(Store o1, Store o2) {
				if(differentStoresMap.get(o1).equals(differentStoresMap.get(o2))) {
					if(demandStoresMap.get(o1).equals(demandStoresMap.get(o1))) {
						if(o1.getExpectedSales().equals(o2.getExpectedSales())) {
							return o2.getStoreId().compareTo(o1.getStoreId());
						} return o2.getExpectedSales().compareTo(o1.getExpectedSales());
					} return demandStoresMap.get(o2).compareTo(demandStoresMap.get(o1));
				} else return differentStoresMap.get(o1).compareTo(differentStoresMap.get(o2));
			}
		});
		
		return isEnough ? selectedStores.get(0) : selectedStores.get(selectedStores.size()-1);
	}	
	
	private static Map<Store, Integer> fixRoundingIssues(Integer whAllocationAmount,Integer amountAllocatedTotal
															, Map<Store,Integer> amountAllocatedMap,List<Store> stores) {
		
		List<Store> selectedStore = stores.stream().filter(Store::isSelected).collect(Collectors.toList());
		do {
			Integer newAllocated = 0;
			if(amountAllocatedTotal > whAllocationAmount) {
				Store storeAdjusted = adjustedStore(amountAllocatedMap,selectedStore, false);
				newAllocated = amountAllocatedMap.get(storeAdjusted);
				amountAllocatedMap.put(storeAdjusted, newAllocated-1);
				amountAllocatedTotal--;
			} else {
				Store storeAdjusted = adjustedStore(amountAllocatedMap,selectedStore, true);
				newAllocated = amountAllocatedMap.get(storeAdjusted);
				amountAllocatedMap.put(storeAdjusted, newAllocated+1);
				amountAllocatedTotal++;
			}
		} while (!amountAllocatedTotal.equals(whAllocationAmount));
		
		return amountAllocatedMap;
	}
	
	public static Map<Store, Integer> amountAllocated(Integer whAllocationAmount, Map<Store, BigDecimal> storesKeyMap,
			List<Store> stores) {

		Integer amountAllocatedTotal = 0;
		BigDecimal stockPreviousTotal = total(stores, Store::isSelected, Store::getStockPreviousDay);
		Map<Store, Integer> amountAllocatedMap = new HashMap<>();

		for (Store store : stores) {
			Integer amountAllocated = 0;
			if (store.isSelected()) {
				BigDecimal keyAllocated = storesKeyMap.get(store);
				amountAllocated = keyAllocated.multiply(stockPreviousTotal.add(new BigDecimal(whAllocationAmount)))
						.subtract(store.getStockPreviousDay()).setScale(0, RoundingMode.HALF_UP).intValue();
				amountAllocated = amountAllocated < 0 ? 0 : amountAllocated;
				amountAllocatedTotal += amountAllocated;
				amountAllocatedMap.put(store, amountAllocated);
			}
		}
		
		amountAllocatedMap = amountAllocatedTotal.equals(whAllocationAmount) ? amountAllocatedMap
											: fixRoundingIssues(whAllocationAmount, amountAllocatedTotal, amountAllocatedMap, stores);
		return amountAllocatedMap;
	}

	public static Map<Store, BigDecimal> keyAllocated(List<Store> stores) {
		Map<Store, BigDecimal> keyAllocatedMap = new HashMap<>();

		stores.stream().filter(Store::isSelected).forEach(store -> {
			BigDecimal keyAllocatedValue = store.getExpectedSales()
												.divide(
													total(stores,Store::isSelected,Store::getExpectedSales)
													.setScale(0, RoundingMode.HALF_UP)
															, 10, RoundingMode.HALF_UP);
			keyAllocatedMap.put(store, keyAllocatedValue);
		});
		
		return keyAllocatedMap;
	}
	
	
	
	public static void fillingMissingExpectedSales(List<Store> stores) {
		
		List<Store> missingExpectedSales = stores.stream()
				.filter(store -> store.getExpectedSales() == null)
				.collect(Collectors.toList());
		
		BigDecimal totalExpectedSales  = stores.stream()
										.filter(store -> store.getExpectedSales() != null)
										.map(Store::getExpectedSales)
										.reduce(BigDecimal.ZERO, BigDecimal::add);
		BigDecimal averageExpectedSales = totalExpectedSales
											.divide(valueOf(stores.size()-missingExpectedSales.size()), 1, RoundingMode.HALF_UP);
		
		
		missingExpectedSales.stream().filter(Store::isSelected).forEach(s -> {
			s.setExpectedSales(s.getReferenceStoreId() != 0 
					? stores.stream()
							.filter(rs -> rs.getStoreId() == s.getReferenceStoreId())
							.filter(rs -> !missingExpectedSales.contains(rs))
							.findFirst()
							.map(Store::getExpectedSales)
							.orElse(averageExpectedSales)
							
					: averageExpectedSales

			);
		});
	}
}
