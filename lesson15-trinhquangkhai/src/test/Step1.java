package test;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import bean.Store;
import model.DataModel;

// Tên class không được đặt như này
// A có giải thích là code trong class DeliveryApp như trong code a rồi
public class Step1 {
	public static void main(String[] args) {
		
		// step 1: Check for manually added amounts 
		int PlanningAmount = 10;
		if (PlanningAmount <= 0) {
			System.out.println("Planning amount must be greater than 0. ");
			return;
		}
		// Sao học đến giờ rồi mà code ko format vậy em ?
		List<Store> storesA55 = DataModel.mockStoresOfRefItemA55();
		List<Store> storesA77 = DataModel.mockStoresOfRefItemA77();

		Map<Integer, Integer> refStores = DataModel.mockRefStores();
		Map<Integer, BigDecimal> refWeights = DataModel.mockRefWeights();
		Map<Integer, BigDecimal> storeTrendFactors = DataModel.mockStoreTrendFactors();

		// Code chưa tốt nơi Khải nghe :/
		allocateProducts(storesA55, refStores, refWeights, storeTrendFactors);

		for (Store store : storesA55) {
			System.out.println("Store " + store.getStoreId() + ": " + store.getItem().getItenName()
					+ " - Allocated Quantity: " + store.getStorePotential());
		}
	}

	private static void allocateProducts(List<Store> stores, Map<Integer, Integer> refStores,
			Map<Integer, BigDecimal> refWeights, Map<Integer, BigDecimal> storeTrendFactors) {
		for (Store store : stores) {
			int refStoreId = refStores.get(store.getStoreId());
			BigDecimal refWeight = refWeights.get(store.getItem().getItemId());
			BigDecimal trendFactor = storeTrendFactors.get(store.getStoreId());

			BigDecimal allocationQuantity = calculateAllocationQuantity(refStoreId, refWeight, trendFactor);
			allocationQuantity = allocateWithinStoreLimit(allocationQuantity);

			store.setStorePotential(allocationQuantity);
		}
	}

	private static BigDecimal calculateAllocationQuantity(int refStoreId, BigDecimal refWeight,
			BigDecimal trendFactor) {
		BigDecimal allocationQuantity = refWeight.multiply(trendFactor);
		if (refStoreId == 10) {
			allocationQuantity = allocationQuantity.multiply(BigDecimal.valueOf(0.8));
		}
		return allocationQuantity;
	}

	private static BigDecimal allocateWithinStoreLimit(BigDecimal allocationQuantity) {
		// BigDecimal.valueOf() cần truyền tham số vào
		// Ví dụ BigDecimal.valueOf(20) chứ e để vậy là lỗi compile rồi
		if (allocationQuantity.compareTo(BigDecimal.valueOf()) > 0) {
			return BigDecimal.valueOf();
		}
		return allocationQuantity;
	}

	{
	}
}
