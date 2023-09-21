package view;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

import bean.Store;
import model.DataModel;

public class DeliveryApp {
	public static void main(String[] args) {
		// Step 1,2
		List<Store> stores77 = DataModel.mockStoresOfRefItemA55();
		List<Store> stores55 = DataModel.mockStoresOfRefItemA77();

		Map<Integer, BigDecimal> potentialMap = new HashMap<>();

		// BigDecimal planningAmount = calculatePlanningAmount(stores55);
		if (calculatePlanningAmount(stores55).compareTo(BigDecimal.valueOf(100)) <= 0) {
			System.out.println("Planning amount is less than or equal to 100. Stopping calculation.");
			return;
		}

		processStores(stores55, potentialMap);

//		BigDecimal planningAmount2 = calculatePlanningAmount(stores77);
		if (calculatePlanningAmount(stores55).compareTo(BigDecimal.valueOf(100)) <= 0) {
			System.out.println("Planning amount is less than or equal to 100. Stopping calculation.");
			return;
		}

		processStores(stores77, potentialMap);

		// Step 3: Calculate Store Demand of current Item
		Map<Integer, BigDecimal> calStoDemand = calStoDemandOfCurItem(DataModel.mockRefStore55(),
				DataModel.mockRefStore77(), DataModel.mockRefWeights(), DataModel.mockStoreTrendFactors());
		// Step 4: Sum up Demand to WH Level
		Map<Integer, BigDecimal> sumUpDemand = sumUpDemandToWHLevel(calStoDemand, DataModel.mockStoresOfRefItemA55());

		// Step 5: Calculate Shares
        Map<Integer, BigDecimal> calculateShares = calculateShares(sumUpDemand);
	}

	private static BigDecimal calculatePlanningAmount(List<Store> stores) {
		BigDecimal planningAmount = BigDecimal.ZERO;
		for (Store store : stores) {
			planningAmount = planningAmount.add(store.getStorePotential());
		}
		return planningAmount;
	}

	private static void processStores(List<Store> stores, Map<Integer, BigDecimal> potentialMap) {
		for (Store store : stores) {
			if (store.getStorePotential() == null) {
				BigDecimal potential = calculatePotential(store, stores, potentialMap);
				store.setStorePotential(potential);
			}
		}
	}

	private static BigDecimal calculatePotential(Store store, List<Store> stores,
			Map<Integer, BigDecimal> potentialMap) {
		BigDecimal potential = potentialMap.get(store.getStoreId());

		if (potential != null) {
			return potential;
		}

		BigDecimal sumPotential = BigDecimal.ZERO;
		int count = 0;
		for (Store s : stores) {
			if (s.getStorePotential() != null) {
				sumPotential = sumPotential.add(s.getStorePotential());
				count++;
			}
		}
		return count > 0 ? sumPotential.divide(BigDecimal.valueOf(count), 1, BigDecimal.ROUND_HALF_UP)
				: BigDecimal.ZERO;
	}

	public static Map<Integer, BigDecimal> calStoDemandOfCurItem(Map<Integer, BigDecimal> potentialRefA55,
			Map<Integer, BigDecimal> potentialRefA77, Map<Integer, BigDecimal> refWeight,
			Map<Integer, BigDecimal> storeTrendFactors) {
		Map<Integer, BigDecimal> res = new HashMap<>();

		for (Map.Entry<Integer, BigDecimal> entry : potentialRefA55.entrySet()) {
			int index = entry.getKey();
			BigDecimal newCampaign = ((entry.getValue().multiply(refWeight.get(55)))
					.add(potentialRefA77.get(index).multiply(refWeight.get(77)))
					.divide(refWeight.get(55).add(refWeight.get(77))).multiply(storeTrendFactors.get(index)));

			res.put(index, newCampaign);
		}

		return res;
	}
	
	public static Map<Integer, BigDecimal> calculateShares(Map<Integer, BigDecimal> sumUpDemmand) {
        Map<Integer, BigDecimal> result = new HashMap<>();
        List<BigDecimal> list = sumUpDemmand.values()
                .stream()
                .collect(Collectors.toList());
        BigDecimal cal = BigDecimal.ZERO;
        for (BigDecimal bd : list) {
            cal = cal.add(bd);
        }
        BigDecimal temp = cal;
        sumUpDemmand.entrySet().forEach(WH -> result.put(WH.getKey(), WH.getValue().divide(temp)));
        return result;
    }
	
	public static Map<Integer, BigDecimal> sumUpDemandToWHLevel(Map<Integer, BigDecimal> demandStore, List<Store> storesOfRefItem) {
	    return storesOfRefItem.stream()
	            .collect(Collectors.groupingBy(Store::getWhId, Collectors.reducing(BigDecimal.ZERO, store -> demandStore.getOrDefault(store.getStoreId(), BigDecimal.ZERO), BigDecimal::add)));
	}
}