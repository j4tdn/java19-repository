package view;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

import org.w3c.dom.ls.LSOutput;

import bean.Store;
import utils.CollectionUtils;

public class WarehouseAllocation {
	public static void main(String[] args) {
		Integer whAllocationAmount = 299;
		List<Store> stores = mockData();

		List<Store> selectedStore = stores.stream().filter(t -> t.getIsSelected() == true).collect(Collectors.toList());

		if (selectedStore.size() != 0) {
			if (selectedStore.stream().allMatch(t -> t.getExpectedSales() == null && t.getReferenceStoreId() == null)) {
				System.out.println("Expected sales cannot be calculated. Please add a\r\n"
						+ "reference store or include stores with expected sales for interpolation\"");
				return;
			}
		}

		List<Store> filledStore = fillingMissingExpectedSales(selectedStore);
		CollectionUtils.generate("filledStore", filledStore);

		Map<Integer, BigDecimal> allocationKeyMap = calcAllocationKey(filledStore);
		CollectionUtils.generate("allocationKeyMap", allocationKeyMap);

		Map<Integer, BigDecimal> amountAllocatedMap = calcAmountAllocated(whAllocationAmount, allocationKeyMap,
				filledStore);
		CollectionUtils.generate("amountAllocatedMap", amountAllocatedMap);

		Map<Integer, BigDecimal> fixedAmountAllocated = fixRoundingIssue(whAllocationAmount, amountAllocatedMap,
				selectedStore);
		CollectionUtils.generate("fixedAmountAllocated", fixedAmountAllocated);

	}

	private static Map<Long, Integer> warehouseAllocationAmount(List<Store> stores, Integer amountAllocate) {

		return null;
	}

	private static List<Store> fillingMissingExpectedSales(List<Store> stores) {
		List<Store> result = new ArrayList<Store>();

		List<Store> haveExpectedSales = stores.stream().filter(t -> t.getExpectedSales() != null)
				.collect(Collectors.toList());
		Map<Integer, BigDecimal> oldExpectedSales = haveExpectedSales.stream()
				.collect(Collectors.toMap(Store::getStoreId, Store::getExpectedSales));

		BigDecimal averageExpectedSales = averageExpectedSales(haveExpectedSales);

		for (Store store : stores) {
			if (store.getExpectedSales() != null) {
				result.add(store);
			} else {
				Integer referenceStoreId = store.getReferenceStoreId();
				BigDecimal referenceStoreExpectedSales = oldExpectedSales.get(referenceStoreId);

				if (referenceStoreId != null && referenceStoreExpectedSales != null) {
					store.setExpectedSales(referenceStoreExpectedSales);
					result.add(store);
				} else {
					store.setExpectedSales(averageExpectedSales);
					result.add(store);
				}
			}
		}
		return result;
	}

	private static Map<Integer, BigDecimal> calcAllocationKey(List<Store> stores) {
		Map<Integer, BigDecimal> allocationKeyMap = new TreeMap<Integer, BigDecimal>();
		BigDecimal sumExpectedSales = stores.stream().map(Store::getExpectedSales)
				.reduce(BigDecimal.ZERO, (a, b) -> a.add(b)).setScale(0, RoundingMode.HALF_UP);
//		System.out.println("sumExpectedSales --> " + sumExpectedSales);
		for (Store store : stores) {
			BigDecimal allocationKey = store.getExpectedSales().divide(sumExpectedSales, 10, RoundingMode.HALF_UP);
//			System.out.println(
//					"allocationKey " + store.getExpectedSales() + "/ " + sumExpectedSales + " = 	" + allocationKey);
			allocationKeyMap.put(store.getStoreId(), allocationKey);
		}
		return allocationKeyMap;
	}

	private static Map<Integer, BigDecimal> calcAmountAllocated(Integer whAllocationAmount,
			Map<Integer, BigDecimal> allocationKeyMap, List<Store> stores) {

		Map<Integer, BigDecimal> AmountAllocatedMap = new TreeMap<Integer, BigDecimal>();

		BigDecimal sumPreviousDayStore = stores.stream().map(Store::getStockPreviousDay).reduce(BigDecimal.ZERO,
				BigDecimal::add);
//		System.out.println("sumPreviousDayStore --> " + sumPreviousDayStore);

		BigDecimal sumAmountAllocated = BigDecimal.ZERO;

		for (Store store : stores) {
			BigDecimal allocationKeyStore = allocationKeyMap.get(store.getStoreId());
			BigDecimal stockPreviousDayStore = store.getStockPreviousDay();
			BigDecimal amountAllocatedStore = (allocationKeyStore
					.multiply(BigDecimal.valueOf(whAllocationAmount).add(sumPreviousDayStore)))
					.subtract(stockPreviousDayStore).setScale(0, RoundingMode.HALF_UP);

			if (amountAllocatedStore.compareTo(BigDecimal.ZERO) < 0) {
				amountAllocatedStore = BigDecimal.ZERO;
			}

			sumAmountAllocated.add(sumAmountAllocated);

			AmountAllocatedMap.put(store.getStoreId(), amountAllocatedStore);
		}
		return AmountAllocatedMap;
	}

	@SuppressWarnings("unchecked")
	private static Map<Integer, BigDecimal> fixRoundingIssue(Integer whAllocationAmount,
			Map<Integer, BigDecimal> amountAllocatedMap, List<Store> stores) {

		// calc demand
		Map<Integer, BigDecimal> demand = new TreeMap<Integer, BigDecimal>();
		for (Store store : stores) {
			BigDecimal eachDemand = store.getExpectedSales().subtract(store.getStockPreviousDay()).setScale(0,
					RoundingMode.HALF_UP);
			if (eachDemand.compareTo(BigDecimal.ZERO) < 0) {
				eachDemand = BigDecimal.ZERO;
			}
			demand.put(store.getStoreId(), eachDemand);
		}

		// fix rounding
		Map<Integer, BigDecimal> expectedSalesMap = stores.stream()
				.collect(Collectors.toMap(Store::getStoreId, Store::getExpectedSales));

		BigDecimal sumAmountAllocated = amountAllocatedMap.entrySet().stream().map(t -> t.getValue())
				.reduce(BigDecimal.ZERO, BigDecimal::add).setScale(0, RoundingMode.HALF_UP);
		System.out.println("sumAmountAllocated --> " + sumAmountAllocated);
		System.out.println("whAllocationAmount --> " + whAllocationAmount);

		Map<Integer, BigDecimal> fixedAmountAllocatedMap = new LinkedHashMap<Integer, BigDecimal>();
		if (sumAmountAllocated.equals(BigDecimal.valueOf(whAllocationAmount))) {
			return amountAllocatedMap;
			
		} else if (sumAmountAllocated.compareTo(BigDecimal.valueOf(whAllocationAmount)) > 0) {
			// handle sum amound allocated > whAllocationAmount
			while (!sumAmountAllocated.equals(BigDecimal.valueOf(whAllocationAmount))) {

				fixedAmountAllocatedMap = amountAllocatedMap.entrySet().stream().sorted(Comparator.comparing(t -> {
					return amountAllocatedMap.get(((Entry<Integer, BigDecimal>) t).getKey())
							.subtract(demand.get(((Entry<Integer, BigDecimal>) t).getKey()));
				}, Collections.reverseOrder()).thenComparing(s -> demand.get(((Entry<Integer, BigDecimal>) s).getKey()))
						.thenComparing(k -> expectedSalesMap.get(((Entry<Integer, BigDecimal>) k).getKey()))
						.thenComparing(n -> ((Entry<Integer, BigDecimal>) n).getKey()))
						.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (v1, v2) -> v1, LinkedHashMap::new));

//				
//				Map<Integer, BigDecimal> diffmap= fixedAmountAllocatedMap.entrySet().stream().collect(Collectors.toMap(Entry::getKey, t -> amountAllocatedMap.get(((Entry<Integer, BigDecimal>) t).getKey())
//										.subtract(demand.get(((Entry<Integer, BigDecimal>) t).getKey()))));
//				//
//				CollectionUtils.generate("diffmap", diffmap);

				Integer idStoreNeedToChangeamountAllocated = amountAllocatedMap.entrySet().stream().findFirst()
						.map(Entry::getKey).get();
				if (fixedAmountAllocatedMap.containsKey(idStoreNeedToChangeamountAllocated)) {
					BigDecimal newAmountAllocated = fixedAmountAllocatedMap.get(idStoreNeedToChangeamountAllocated)
							.subtract(BigDecimal.ONE);
					fixedAmountAllocatedMap.put(idStoreNeedToChangeamountAllocated, newAmountAllocated);
				}

				sumAmountAllocated = sumAmountAllocated.subtract(BigDecimal.ONE);
				System.out.println("- ->sumAmountAllocated " + sumAmountAllocated);
			}
			
		} else {
			// handle sum amound allocated < whAllocationAmount
			while (!sumAmountAllocated.equals(BigDecimal.valueOf(whAllocationAmount))) {

				fixedAmountAllocatedMap = amountAllocatedMap.entrySet().stream().sorted(Comparator.comparing(t -> {
					return amountAllocatedMap.get(((Entry<Integer, BigDecimal>) t).getKey())
							.subtract(demand.get(((Entry<Integer, BigDecimal>) t).getKey()));
				}).thenComparing(s -> demand.get(((Entry<Integer, BigDecimal>) s).getKey()), Collections.reverseOrder())
						.thenComparing(k -> expectedSalesMap.get(((Entry<Integer, BigDecimal>) k).getKey()),
								Collections.reverseOrder())
						.thenComparing(n -> ((Entry<Integer, BigDecimal>) n).getKey(), Collections.reverseOrder()))
						.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (v1, v2) -> v1, LinkedHashMap::new));

				Integer idStoreNeedToChangeamountAllocated = amountAllocatedMap.entrySet().stream().findFirst()
						.map(Entry::getKey).get();
				if (fixedAmountAllocatedMap.containsKey(idStoreNeedToChangeamountAllocated)) {
					BigDecimal newAmountAllocated = fixedAmountAllocatedMap.get(idStoreNeedToChangeamountAllocated)
							.add(BigDecimal.ONE);
					fixedAmountAllocatedMap.put(idStoreNeedToChangeamountAllocated, newAmountAllocated);
				}
				sumAmountAllocated = sumAmountAllocated.add(BigDecimal.ONE);
				System.out.println("+ ->sumAmountAllocated " + sumAmountAllocated);
			}
		}
		
		
		CollectionUtils.generate("demand", demand);
		return fixedAmountAllocatedMap.entrySet().stream().sorted(Comparator.comparing(t -> t.getKey()))
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue));
	}

	private static BigDecimal averageExpectedSales(List<Store> stores) {
		BigDecimal sum = stores.stream().map(Store::getExpectedSales).reduce(BigDecimal.ZERO, BigDecimal::add);
		return sum.divide(BigDecimal.valueOf(stores.size()), 1, RoundingMode.HALF_UP);
	}

	private static List<Store> mockData() {
		return List.of(new Store(1, null, bd(18d), bd(40d), true), new Store(2, null, bd(19d), bd(20d), true),
				new Store(3, null, bd(21d), bd(17d), true), new Store(4, null, bd(14d), bd(31d), true),
				new Store(5, null, bd(14d), bd(10d), true), new Store(6, null, bd(15d), bd(30d), true),
				new Store(7, 2, bd(15d), null, true), new Store(8, null, bd(12d), bd(19d), true),
				new Store(9, null, bd(17d), bd(26d), true), new Store(10, 7, bd(18d), null, true));
	}

	public static BigDecimal bd(Double number) {
		return BigDecimal.valueOf(number);
	}
}
