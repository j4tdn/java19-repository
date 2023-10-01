package view;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;

import bean.Store;
import model.DataModel;

public class DeliveryApp {

	public static void main(String[] args) {
		/*
		 Kết quả code của a Tín đang giống với kết quả trong excel cuối cùng
		 Nhưng có vẻ cách làm bị sai bắt đầu từ bước 2 khi a chỉ filling gaps cho stores của ref item 55
		 Idea ở bước 2 là tính store potential cho stores ở các ref items của item hiện tại
		 Qua bước 3 mới gộp lại để tính store potential cho từng store
		 */
		
		final Integer planningAmount = 10;
		List<Store> stores = DataModel.mockStoresOfRefItemA55();

		// Step 1: Check for manually added amounts
		if (planningAmount <= 0) {
			System.out.println("Planning amount should not be zero or negative");
			return;
		}

		// Step 2: Filling gaps
		fillGaps(stores);
		
		System.out.println("\nStep 2: Filling gaps");
		stores.forEach(store -> {
			System.out.println(store.getStoreId() + ", " + store.getStorePotential());
		});
		
		
		calculateDemand(stores);
		System.out.println("\nStep 3: Calculate store demands");
		stores.forEach(store -> {
			System.out.println(store.getStoreId() + ", " + store.getDemand());
		});

		Map<Integer, BigDecimal> warehouseDemand = sumDemandToWH(stores);
		
		System.out.println("\nStep 4: Calculate warehouse demands");
		warehouseDemand.forEach((whId, demand) -> {
			System.out.println(whId + ", " + demand);
		});
		
		Map<Integer, BigDecimal> warehouseShares = calculateShares(warehouseDemand);
		System.out.println("\nStep 5: Calculate shares");
		warehouseShares.forEach((whId, share) -> {
			System.out.println(whId + ", " + share);
		});
		
		Map<Integer, BigDecimal> warehouseAllocations = allocateByShares(warehouseShares, planningAmount);
		Map<Integer, BigDecimal> warehouseWithMinimum = applyMinimum(stores, warehouseAllocations);

		Map<Integer, BigDecimal> recalculatedShares = recalculateShare(warehouseWithMinimum, warehouseShares);
		Map<Integer, BigDecimal> reallocatedAllocations = reallocate(recalculatedShares, planningAmount);
		Map<Integer, BigDecimal> finalAllocations = fixRounding(planningAmount, warehouseShares, warehouseDemand,
				reallocatedAllocations);

		displayResults(finalAllocations);
	}

	// Step 2: Filling gaps by references or average
	private static void fillGaps(List<Store> stores) {
		// Đoạn code 'stores.stream().filter(store -> store.getStorePotential() != null' e thấy sử dụng khá nhiều lần
		// Có thể filter rồi lưu tạm vào 1 list riêng cũng được
		
		// Biến này chính xác hơn là ownStorePotentials, store có chưa giá trị store potential
		Map<Integer, BigDecimal> ownStorePotentials = stores.stream()
				.filter(store -> store.getStorePotential() != null)
				.collect(Collectors.toMap(Store::getStoreId, Store::getStorePotential));

		BigDecimal averagePotential = stores.stream().filter(store -> store.getStorePotential() != null)
				.map(Store::getStorePotential).reduce(BigDecimal.ZERO, BigDecimal::add)
				.divide(BigDecimal.valueOf(stores.stream().filter(store -> store.getStorePotential() != null).count()),
						1, RoundingMode.HALF_UP);
		
		stores.forEach(store -> {
			if (store.getStorePotential() == null) {
				Integer referenceStoreId = store.getReferenceStoreId();
				if (referenceStoreId != null) {
					BigDecimal referencePotential = ownStorePotentials.get(referenceStoreId);
					if (referencePotential != null) {
						store.setStorePotential(referencePotential);
					} else {
						store.setStorePotential(averagePotential);
					}
				} else {
					store.setStorePotential(averagePotential);
				}
			}
		});
	}

	// Step 3: Calculate Store Demand of the current Item
	private static void calculateDemand(List<Store> stores) {
		Map<Integer, BigDecimal> refWeights = DataModel.mockRefWeights();
		Map<Integer, BigDecimal> storeTrendFactors = DataModel.mockStoreTrendFactors();

		stores.forEach(store -> {
			BigDecimal storePotential = store.getStorePotential();
			Integer itemId = store.getItem().getItemId();
			BigDecimal weight = refWeights.get(itemId);
			BigDecimal storeTrend = storeTrendFactors.get(store.getStoreId());

			if (storePotential != null && weight != null && storeTrend != null) {
				BigDecimal weightedPotential = storePotential.multiply(weight);
				store.setDemand(weightedPotential.divide(storeTrend, 2, RoundingMode.HALF_UP));
			}
		});
	}

	// Step 4: Sum up Demand to WH Level
	private static Map<Integer, BigDecimal> sumDemandToWH(List<Store> stores) {
		Map<Integer, BigDecimal> warehouseDemand = new HashMap<>();

		stores.forEach(store -> {
			Integer whId = store.getWhId();
			BigDecimal demand = store.getDemand();

			if (whId != null && demand != null) {
				// Hàm này e cũng ít khi sử dụng, great job a ;)
				warehouseDemand.merge(whId, demand, BigDecimal::add);
			}
		});

		return warehouseDemand;
	}

	// Step 5: Calculate Shares
	private static Map<Integer, BigDecimal> calculateShares(Map<Integer, BigDecimal> warehouseDemand) {
		Map<Integer, BigDecimal> warehouseShares = new HashMap<>();

		BigDecimal totalDemandAllWarehouses = warehouseDemand.values().stream().reduce(BigDecimal.ZERO,
				BigDecimal::add);

		warehouseDemand.forEach((whId, demand) -> {
			if (totalDemandAllWarehouses.compareTo(BigDecimal.ZERO) != 0) {
				BigDecimal share = demand.divide(totalDemandAllWarehouses, 4, RoundingMode.HALF_UP)
						.multiply(BigDecimal.valueOf(100));
				warehouseShares.put(whId, share);
			}
		});

		return warehouseShares;
	}

	// Step 6: Allocate by Shares
	private static Map<Integer, BigDecimal> allocateByShares(Map<Integer, BigDecimal> warehouseShares,
			int planningAmount) {
		return warehouseShares.entrySet().stream()
				.collect(Collectors.toMap(Map.Entry::getKey,
						entry -> entry.getValue().multiply(BigDecimal.valueOf(planningAmount))
								.divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP)
								.setScale(2, RoundingMode.HALF_UP)));
	}

	// Step 7: Apply Minimum
	private static Map<Integer, BigDecimal> applyMinimum(List<Store> stores, Map<Integer, BigDecimal> allocations) {
		Map<Integer, BigDecimal> warehouseWithMinimum = new HashMap<>();

		Map<Integer, BigDecimal> warehouseSums = stores.stream()
				.collect(Collectors.groupingBy(Store::getWhId,
						Collectors.mapping(store -> allocations.getOrDefault(store.getWhId(), BigDecimal.ZERO),
								Collectors.toList())))
				.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey,
						entry -> entry.getValue().stream().reduce(BigDecimal.ZERO, BigDecimal::add), (a, b) -> a));

		for (Map.Entry<Integer, BigDecimal> entry : warehouseSums.entrySet()) {
			Integer whId = entry.getKey();
			BigDecimal sum = entry.getValue();
			if (sum.compareTo(BigDecimal.valueOf(2)) < 0) {
				BigDecimal difference = BigDecimal.valueOf(2).subtract(sum);
				warehouseWithMinimum.put(whId, difference);
			}
		}

		warehouseWithMinimum
				.forEach((whId, minAllocation) -> allocations.put(whId, allocations.get(whId).add(minAllocation)));

		return allocations;
	}

	// Step 8: Recalculate Share (if needed)
	private static Map<Integer, BigDecimal> recalculateShare(Map<Integer, BigDecimal> warehouseWithMinimum,
			Map<Integer, BigDecimal> warehouseShares) {
		Map<Integer, BigDecimal> recalculatedShares = new HashMap<>();

		BigDecimal sumOfSharesWithoutMinimum = warehouseShares.entrySet().stream()
				.filter(entry -> !warehouseWithMinimum.containsKey(entry.getKey())).map(Map.Entry::getValue)
				.reduce(BigDecimal.ZERO, BigDecimal::add);

		warehouseShares.forEach((whId, share) -> {
			if (!warehouseWithMinimum.containsKey(whId)) {
				BigDecimal recalculatedShare = share.divide(sumOfSharesWithoutMinimum, 4, RoundingMode.HALF_UP)
						.multiply(BigDecimal.valueOf(100));
				recalculatedShares.put(whId, recalculatedShare);
			}
		});

		warehouseWithMinimum.forEach((whId, minAllocation) -> recalculatedShares.put(whId, warehouseShares.get(whId)));

		return recalculatedShares;
	}

	// Step 9: Reallocate (if needed)
	private static Map<Integer, BigDecimal> reallocate(Map<Integer, BigDecimal> recalculatedShares,
			Integer planningAmount) {
		BigDecimal sumOfAppliedMinimum = recalculatedShares.values().stream()
				.map(share -> share.divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP)
						.multiply(BigDecimal.valueOf(planningAmount)).setScale(2, RoundingMode.HALF_UP))
				.reduce(BigDecimal.ZERO, BigDecimal::add);

		BigDecimal planningAmountAdjusted = BigDecimal.valueOf(planningAmount).subtract(sumOfAppliedMinimum);

		return recalculatedShares.entrySet().stream()
				.collect(Collectors.toMap(Map.Entry::getKey,
						entry -> entry.getValue().divide(BigDecimal.valueOf(100), 4, RoundingMode.HALF_UP)
								.multiply(planningAmountAdjusted).setScale(2, RoundingMode.HALF_UP)));
	}

	// Step 10: Round Up
	private static Map<Integer, BigDecimal> roundUp(Map<Integer, BigDecimal> reallocatedAllocations) {
		return reallocatedAllocations.entrySet().stream().collect(
				Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().setScale(0, RoundingMode.CEILING)));
	}
	
	// Step 11: fixRounding
	private static Map<Integer, BigDecimal> fixRounding(Integer planningAmount,
			Map<Integer, BigDecimal> warehouseShares, Map<Integer, BigDecimal> warehouseDemand,
			Map<Integer, BigDecimal> roundedAllocations) {
		Map<Integer, BigDecimal> finalAllocations = new HashMap<>(roundedAllocations);
		BigDecimal totalRoundedAllocation = BigDecimal.ZERO;

		for (BigDecimal allocation : roundedAllocations.values()) {
			totalRoundedAllocation = totalRoundedAllocation.add(allocation);
		}
		
		// Thường e sẽ dùng while để kiểm tra, trong khi totalRoundedAllocation != planningAmount
		// thì tiếp tục fixRounding, nhưng đệ quy cũng là 1 cách hay
		if (totalRoundedAllocation.compareTo(BigDecimal.valueOf(planningAmount)) == 0) {
			return finalAllocations;
		} else if (totalRoundedAllocation.compareTo(BigDecimal.valueOf(planningAmount)) < 0) {
			int warehouseToAdd = findWarehouseWithMaxDeviation(warehouseShares, finalAllocations);
			finalAllocations.put(warehouseToAdd, finalAllocations.get(warehouseToAdd).add(BigDecimal.ONE));
			return fixRounding(planningAmount, warehouseShares, warehouseDemand, finalAllocations);
		} else {
			int warehouseToSubtract = findWarehouseWithMaxDeviation(warehouseShares, finalAllocations);
			finalAllocations.put(warehouseToSubtract,
					finalAllocations.get(warehouseToSubtract).subtract(BigDecimal.ONE));
			return fixRounding(planningAmount, warehouseShares, warehouseDemand, finalAllocations);
		}
	}

	private static int findWarehouseWithMaxDeviation(Map<Integer, BigDecimal> warehouseShares,
			Map<Integer, BigDecimal> allocations) {
		int maxDeviationWarehouse = -1;
		BigDecimal maxDeviation = BigDecimal.ZERO;

		for (Map.Entry<Integer, BigDecimal> entry : warehouseShares.entrySet()) {
			Integer warehouseId = entry.getKey();
			BigDecimal share = entry.getValue();
			BigDecimal allocation = allocations.getOrDefault(warehouseId, BigDecimal.ZERO);
			BigDecimal deviation = share.divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP)
					.multiply(BigDecimal.valueOf(10)).setScale(0, RoundingMode.CEILING).subtract(allocation);

			if (deviation.compareTo(maxDeviation) > 0) {
				maxDeviation = deviation;
				maxDeviationWarehouse = warehouseId;
			}
		}

		return maxDeviationWarehouse;
	}
	
	// Display Results
	private static void displayResults(Map<Integer, BigDecimal> allocations) {
		System.out.println("Warehouse Allocation Results:");
		System.out.println("--------------------------------------");

		for (Map.Entry<Integer, BigDecimal> entry : allocations.entrySet()) {
			Integer warehouseId = entry.getKey();
			BigDecimal allocation = entry.getValue();

			System.out.println("Warehouse ID: " + warehouseId + " ==>  Allocation: " + allocation);
		}
	}
}
