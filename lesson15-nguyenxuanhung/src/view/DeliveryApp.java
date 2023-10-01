package view;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import bean.Store;
import utils.CollectionUtils;
import static utils.NumberUtils.*;

import static model.DataModel.*;

public class DeliveryApp {

	public static void main(String[] args) {

		Integer planningAmountCountry = 10;

		// step 1
		if (planningAmountCountry <= 0) {
			System.out.println("Planning amount should be bigger than 0");
			return;
		}

		List<Store> storeA55 = mockStoresOfRefItemA55();
		List<Store> storeA77 = mockStoresOfRefItemA77();

		Map<Integer, Integer> refStore = mockRefStores();
		Map<Integer, BigDecimal> refWeights = mockRefWeights();
		Map<Integer, BigDecimal> storeTrendFactors = mockStoreTrendFactors();
		Map<Integer, Integer> whOfStore = storeA55.stream()
				.collect(Collectors.toMap(Store::getStoreId, Store::getWhId));

		List<Store> storeA77Filled = fillingGap(storeA77, refStore);
		List<Store> storeA55Filled = fillingGap(storeA55, refStore);

		Map<Integer, BigDecimal> demands = calculateDemands(List.of(storeA55Filled, storeA77Filled), storeTrendFactors,
				refWeights);

		CollectionUtils.generate("demands", demands);

		Map<Integer, BigDecimal> sumDemandOfWH = sumDemandOfWH(demands, whOfStore);
		CollectionUtils.generate("sumDemandOfWH", sumDemandOfWH);

		Map<Integer, BigDecimal> calculateShares = calculateShares(sumDemandOfWH);
		CollectionUtils.generate("calculateShares", calculateShares);

		Map<Integer, BigDecimal> allocateByShares = allocateByShares(calculateShares, planningAmountCountry);
		CollectionUtils.generate("allocateByShares", allocateByShares);

		Map<Integer, BigDecimal> allocateBySharesOfMinimum = applyMinimun(allocateByShares);
		CollectionUtils.generate("applyMinimun", allocateBySharesOfMinimum);

		Map<Integer, BigDecimal> recalculateShares = reCalculateShares(allocateBySharesOfMinimum);
		CollectionUtils.generate("recalculateShares", recalculateShares);

		Map<Integer, BigDecimal> reAllocate = reAllocate(recalculateShares, planningAmountCountry);
		CollectionUtils.generate("reAllocate", reAllocate);

		Map<Integer, BigDecimal> roundUpMap = roundUp(reAllocate);
		CollectionUtils.generate("roundUpMap", roundUpMap);

		Map<Integer, BigDecimal> fixRounding = fixRounding(reAllocate, roundUpMap, planningAmountCountry);
		CollectionUtils.generate("fixRounding", fixRounding);

	}

	// step 2
	private static List<Store> fillingGap(List<Store> stores, Map<Integer, Integer> refStore) {
		List<Store> filledStores = new ArrayList<>();

		List<Store> havePotentialStores = stores.stream().filter(t -> t.getStorePotential().compareTo(bd(0f)) > 0)
				.collect(Collectors.toList());

		Map<Integer, BigDecimal> oldPotentialStoresMap = stores.stream()
				.collect(Collectors.toMap(Store::getStoreId, Store::getStorePotential));

		BigDecimal averagePotential = calcAveragePotential(havePotentialStores);

		for (Store store : stores) {
			if (store.getStorePotential().compareTo(bd(0f)) != 0) {
				store.setStorePotential(store.getStorePotential().setScale(1, RoundingMode.HALF_UP));
				filledStores.add(store);
			} else {
				BigDecimal refStorePotential = oldPotentialStoresMap.get(refStore.get(store.getStoreId()));
				if (store.getStorePotential().compareTo(bd(0d)) == 0 && refStore.containsKey(store.getStoreId())
						&& (refStorePotential.compareTo(bd(0f)) > 0)) {

					store.setStorePotential(refStorePotential.setScale(1, RoundingMode.HALF_UP));
					filledStores.add(store);
				} else {
					store.setStorePotential(averagePotential.setScale(1, RoundingMode.HALF_UP));
					filledStores.add(store);
				}
			}
		}

		CollectionUtils.generate("filledStores", filledStores);

		return filledStores;
	}

	// step 3
	private static Map<Integer, BigDecimal> calculateDemands(List<List<Store>> allStores,
			Map<Integer, BigDecimal> storeTrendFactors, Map<Integer, BigDecimal> refWeights) {
		Map<Integer, BigDecimal> demands = new HashMap<>();

		Map<Integer, BigDecimal> fixRefWeights = refWeights.entrySet().stream().map(t -> {
			if (t.getValue().compareTo(bd(0)) == 0) {
				t.setValue(bd(1));
			}
			return t;
		}).collect(Collectors.toMap(Entry::getKey, Entry::getValue));

		Map<Integer, BigDecimal> fixStoreTrendFactors = storeTrendFactors.entrySet().stream().map(t -> {
			if (t.getValue().compareTo(bd(0)) == 0) {
				t.setValue(bd(1));
			}
			return t;
		}).collect(Collectors.toMap(Entry::getKey, Entry::getValue));

		BigDecimal sumRefWeight = fixRefWeights.values().stream().reduce(BigDecimal.ZERO, BigDecimal::add);

		for (int i = 0; i < allStores.get(0).size(); i++) {
			Integer storeId = allStores.get(0).get(i).getStoreId();

			BigDecimal demand = BigDecimal.ZERO;

			for (List<Store> stores : allStores) {
				Store store = stores.get(i);
				BigDecimal storePotential = store.getStorePotential();

				if (storePotential != null && fixRefWeights.containsKey(store.getItem().getItemId())) {
					BigDecimal refWeight = fixRefWeights.get(store.getItem().getItemId());
					demand = demand.add(storePotential.multiply(refWeight));
				}
			}

			if (sumRefWeight.compareTo(bd(0f)) != 0 && fixStoreTrendFactors.containsKey(storeId)) {
				demand = demand.divide(sumRefWeight, 1, RoundingMode.HALF_UP)
						.multiply(fixStoreTrendFactors.get(storeId));
			}

			demands.put(storeId, demand.setScale(1, RoundingMode.HALF_UP));
		}

		return demands;
	}

	// step 4
	private static Map<Integer, BigDecimal> sumDemandOfWH(Map<Integer, BigDecimal> demands,
			Map<Integer, Integer> whOfStore) {

		Map<Integer, BigDecimal> sumByWH = new HashMap<>();

		for (Map.Entry<Integer, BigDecimal> entry : demands.entrySet()) {
			Integer storeId = entry.getKey();
			BigDecimal demand = entry.getValue();

			Integer whId = whOfStore.get(storeId);

			if (sumByWH.containsKey(whId)) {
				BigDecimal currentSum = sumByWH.get(whId);
				sumByWH.put(whId, currentSum.add(demand));
			} else {
				sumByWH.put(whId, demand);
			}
		}
		return sumByWH;
	}

	// step 5
	private static Map<Integer, BigDecimal> calculateShares(Map<Integer, BigDecimal> sumDemandOfWH) {
		Map<Integer, BigDecimal> sharesMap = new HashMap<>();
		BigDecimal sum = sumDemandOfWH.values().stream().reduce(BigDecimal.ZERO, BigDecimal::add);

		sumDemandOfWH.forEach((key, value) -> {
			BigDecimal newValue = value.divide(sum, 9, RoundingMode.HALF_UP).multiply(bd(100d));
			sharesMap.put(key, newValue.setScale(9, RoundingMode.HALF_UP));
		});

		return sharesMap;
	}

	// step 6
	private static Map<Integer, BigDecimal> allocateByShares(Map<Integer, BigDecimal> shareOfWH,
			Integer planningAmountCountry) {
		Map<Integer, BigDecimal> allocateByShares = new HashMap<Integer, BigDecimal>();

		shareOfWH.forEach((key, value) -> {
			BigDecimal valueAllocate = value.divide(bd(100d)).multiply(BigDecimal.valueOf(planningAmountCountry));
			allocateByShares.put(key, valueAllocate);
		});

		return allocateByShares;
	}

	// step 7
	private static Map<Integer, BigDecimal> applyMinimun(Map<Integer, BigDecimal> allocateByShares) {

		Map<Integer, BigDecimal> allocateBySharesOfMinimum = new HashMap<Integer, BigDecimal>();

		for (Map.Entry<Integer, BigDecimal> entry : allocateByShares.entrySet()) {
			if (entry.getValue().compareTo(bd(2f)) < 0) {
				allocateBySharesOfMinimum.put(entry.getKey(), bd(2));
			} else {
				allocateBySharesOfMinimum.put(entry.getKey(), entry.getValue());
			}
		}

		return allocateBySharesOfMinimum;
	}

	// step 8
	private static Map<Integer, BigDecimal> reCalculateShares(Map<Integer, BigDecimal> allocateBySharesOfMinimum) {
		Map<Integer, BigDecimal> recalculateShares = new HashMap<Integer, BigDecimal>();

		BigDecimal sumSharesWithoutMinimum = allocateBySharesOfMinimum.entrySet().stream()
				.filter(t -> t.getValue().compareTo(bd(2d)) > 0).map(Entry::getValue)
				.reduce(BigDecimal.ZERO, BigDecimal::add);

		recalculateShares = allocateBySharesOfMinimum.entrySet().stream()
				.collect(Collectors.toMap(Map.Entry::getKey, entry -> {
					if (entry.getValue().compareTo(BigDecimal.valueOf(2)) > 0) {
						return entry.getValue().divide(sumSharesWithoutMinimum, 9, RoundingMode.HALF_UP);
					} else {
						return BigDecimal.ZERO;
					}
				}));

		return recalculateShares;
	}

	// step 9
	private static Map<Integer, BigDecimal> reAllocate(Map<Integer, BigDecimal> recalculateShares,
			Integer planningAmount) {
		Map<Integer, BigDecimal> reAllocateMap = new HashMap<Integer, BigDecimal>();
		Integer sumApplyMinimun = (int) recalculateShares.entrySet().stream()
				.filter(t -> t.getValue().compareTo(bd(0f)) == 0).count() * 2;

		Integer planningAmountAdjustedNew = planningAmount - sumApplyMinimun;

		reAllocateMap = recalculateShares.entrySet().stream().collect(Collectors.toMap(Entry::getKey, entry -> {
			if (entry.getValue().compareTo(bd(0)) > 0) {
				return entry.getValue().divide(bd(100d), 9, RoundingMode.HALF_UP)
						.multiply(BigDecimal.valueOf(planningAmountAdjustedNew)).multiply(bd(100))
						.setScale(9, RoundingMode.HALF_UP);
			} else {
				return BigDecimal.valueOf(2);
			}
		}));

		return reAllocateMap;
	}

	// step 10
	private static Map<Integer, BigDecimal> roundUp(Map<Integer, BigDecimal> reAllocateMap) {
		Map<Integer, BigDecimal> roundUpMap = reAllocateMap.entrySet().stream()
				.collect(Collectors.toMap(Entry::getKey, entry -> {
					BigDecimal value = entry.getValue();
					if (value.compareTo(BigDecimal.valueOf(2)) > 0) {
						value = value.setScale(0, RoundingMode.UP);
					}
					return value;
				}));
		return roundUpMap;
	}

	// step 11
	private static Map<Integer, BigDecimal> fixRounding(Map<Integer, BigDecimal> reAllocateMap,
			Map<Integer, BigDecimal> roundUpMap, Integer planningAmountCountry) {

		Map<Integer, BigDecimal> finalAllocateMap = new HashMap<Integer, BigDecimal>(roundUpMap);

		Integer sumAmountRounded = roundUpMap.entrySet().stream().map(Entry::getValue)
				.reduce(BigDecimal.ZERO, BigDecimal::add).intValue();

		if (sumAmountRounded.equals(planningAmountCountry)) {
			return roundUpMap;
		} else if (sumAmountRounded > planningAmountCountry) {
			while (sumAmountRounded != planningAmountCountry) {
				Integer idHighestDeviationWH = findHighestDeviationWH(reAllocateMap, roundUpMap);
				BigDecimal newValue = finalAllocateMap.get(idHighestDeviationWH).subtract(BigDecimal.ONE);
				finalAllocateMap.put(idHighestDeviationWH, newValue);
				sumAmountRounded = sumAmountRounded - 1;
			}
		}

		return finalAllocateMap;
	}

	private static Integer findHighestDeviationWH(Map<Integer, BigDecimal> reAllocationMap,
			Map<Integer, BigDecimal> roundUpMap) {
		Integer idHighestDeviationWH = 0;
		;
		BigDecimal maxDeviation = bd(Double.MIN_VALUE);
		for (Map.Entry<Integer, BigDecimal> entry : reAllocationMap.entrySet()) {
			BigDecimal deviation = roundUpMap.get(entry.getKey()).subtract(entry.getValue());
			if (deviation.compareTo(maxDeviation) >= 0) {
				maxDeviation = deviation;
				idHighestDeviationWH = entry.getKey();
			}
		}
		return idHighestDeviationWH;
	}

	private static BigDecimal calcAveragePotential(List<Store> stores) {
		BigDecimal sum = stores.stream().map(Store::getStorePotential).reduce(BigDecimal.ZERO, BigDecimal::add);
		return sum.divide(BigDecimal.valueOf(stores.size()), 1, RoundingMode.HALF_UP);
	}
}
