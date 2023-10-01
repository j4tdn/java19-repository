package view;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Store;
import model.DataModel;

public class DeliveryApp {
	public static void main(String[] args) {
		List<Store> storesA55 = DataModel.mockStoresOfRefItemA55();
		List<Store> storesA77 = DataModel.mockStoresOfRefItemA77();

		List<Store> allStores = new ArrayList<>();
		allStores.addAll(storesA55);
		allStores.addAll(storesA77);

		Map<Integer, BigDecimal> potentialMap = new HashMap<>();

		// step1
		/*
		    Em chưa hiểu đề
		    PlanningAmount là số lượng cần được planning, cần được delivery là input có sẵn
		    chứ ko phải đi tính, nó ko liên quan gì đến store potential hết
		 */
		BigDecimal planningAmount = calculatePlanningAmount(allStores);
		if (planningAmount.compareTo(BigDecimal.valueOf(100)) <= 0) {
			System.out.println("Planning amount is less than or equal to 100. Stopping calculation.");
			return;
		}

		// step 2: filling gaps
		processStores(allStores, potentialMap);
		System.out.println("\nStep 2: Filling gaps");
		
		// A có chạy để in kết quả thử thì filling gaps chưa được e nha
		// Bước 2 sau thì các bước tiếp theo vô nghĩa
		allStores.forEach(store -> {
			System.out.println(store.getStoreId() + ", " + store.getStorePotential());
		});

		// step 3
		Map<Integer, BigDecimal> storeDemandMap = calculateStoreDemand(allStores);
		
		System.out.println("\nStep 3: Calculate store demands");
		storeDemandMap.forEach((storeId, demand) -> {
			System.out.println(storeId + ", " + demand);
		});

		// step4
		Map<Integer, BigDecimal> warehouseDemandMap = calculateWarehouseDemand(allStores, storeDemandMap);

		// step5
		Map<Integer, BigDecimal> sharesMap = calculateShares(warehouseDemandMap);

		// step6
		allocateByShares(sharesMap, planningAmount);
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
			// e thiếu trường hợp else cũng set scale cho potential = 1, làm tròn 1 chữ số
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
		// Quên bài hết Đạt ơi, Em dùng hàm reduce trong stream cho nhanh hi
		for (Store s : stores) {
			if (s.getStorePotential() != null) {
				sumPotential = sumPotential.add(s.getStorePotential());
				count++;
			}
		}
		return count > 0 ? sumPotential.divide(BigDecimal.valueOf(count), 1, RoundingMode.HALF_UP) : BigDecimal.ZERO;
	}

	private static Map<Integer, BigDecimal> calculateStoreDemand(List<Store> stores) {
		Map<Integer, BigDecimal> storeDemandMap = new HashMap<>();

		for (Store store : stores) {
			BigDecimal storeDemand = calculateStoreDemandForItem(store);
			storeDemandMap.put(store.getStoreId(), storeDemand);
		}

		return storeDemandMap;
	}

	private static BigDecimal calculateStoreDemandForItem(Store store) {
		BigDecimal storeDemand = BigDecimal.ZERO;
		BigDecimal potential = store.getStorePotential();
		BigDecimal weight = DataModel.mockRefWeights().get(store.getItem().getItemId());
		BigDecimal trend = DataModel.mockStoreTrendFactors().get(store.getStoreId());

		if (potential != null && weight != null && trend != null) {
			storeDemand = potential.multiply(weight).multiply(trend).setScale(1, RoundingMode.HALF_UP);
		}
		return storeDemand;
	}

	private static Map<Integer, BigDecimal> calculateWarehouseDemand(List<Store> stores,
			Map<Integer, BigDecimal> storeDemandMap) {
		Map<Integer, BigDecimal> warehouseDemandMap = new HashMap<>();

		for (Store store : stores) {
			BigDecimal storeDemand = storeDemandMap.get(store.getStoreId());
			Integer warehouseId = store.getWhId();

			if (storeDemand != null) {
				BigDecimal warehouseDemand = warehouseDemandMap.get(warehouseId);
				if (warehouseDemand == null) {
					warehouseDemand = BigDecimal.ZERO;
				}
				warehouseDemand = warehouseDemand.add(storeDemand);
				warehouseDemandMap.put(warehouseId, warehouseDemand);
			}
		}

		return warehouseDemandMap;
	}

	private static Map<Integer, BigDecimal> calculateShares(Map<Integer, BigDecimal> warehouseDemandMap) {
		BigDecimal totalDemand = BigDecimal.ZERO;
		for (BigDecimal demand : warehouseDemandMap.values()) {
			totalDemand = totalDemand.add(demand);
		}

		Map<Integer, BigDecimal> sharesMap = new HashMap<>();
		for (Map.Entry<Integer, BigDecimal> entry : warehouseDemandMap.entrySet()) {
			Integer warehouseId = entry.getKey();
			BigDecimal demand = entry.getValue();
			BigDecimal share = demand.divide(totalDemand, 2, RoundingMode.HALF_UP).multiply(BigDecimal.valueOf(100));
			sharesMap.put(warehouseId, share);
			System.out.println("Warehouse ID: " + warehouseId + ", Share WH: " + share);
		}

		return sharesMap;
	}

	private static void allocateByShares(Map<Integer, BigDecimal> sharesMap, BigDecimal planningAmount) {
		System.out.println("Allocation Amount per Warehouse:");
		BigDecimal planningAmountCountry = calculatePlanningAmountCountry(planningAmount, sharesMap);
		for (Map.Entry<Integer, BigDecimal> entry : sharesMap.entrySet()) {
			Integer warehouseId = entry.getKey();
			BigDecimal share = entry.getValue();
			BigDecimal allocationAmountWH = share.divide(BigDecimal.valueOf(100)).multiply(planningAmountCountry);
			System.out.println("Warehouse ID: " + warehouseId + ", Allocation Amount WH: " + allocationAmountWH);
		}
	}

	private static BigDecimal calculatePlanningAmountCountry(BigDecimal planningAmount,
			Map<Integer, BigDecimal> sharesMap) {
		BigDecimal planningAmountCountry = BigDecimal.ZERO;
		for (BigDecimal share : sharesMap.values()) {
			planningAmountCountry = planningAmountCountry
					.add(share.divide(BigDecimal.valueOf(100)).multiply(planningAmount));
		}
		return planningAmountCountry;
	}
}
