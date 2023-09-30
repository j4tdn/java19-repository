package view;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static utils.NumberUtils.bd;
import bean.Store;
import model.DataModel;
import utils.StoreUtils;

public class DeliveryApp {

	public static void main(String[] args) {
		// Step 1:Check for planning amount
		if (StoreUtils.planningAmountCountry < 10) {
			System.exit(0);
		}

		List<Store> mockStoresOfRefItemA77 = DataModel.mockStoresOfRefItemA77();
		List<Store> mockStoresOfRefItemA55 = DataModel.mockStoresOfRefItemA55();
		Map<Integer, Integer> refStores = DataModel.mockRefStores();
		/*
		 Đúng là hiện tại trong test data a đưa không có trường hợp missing store potential cho 
		 thằng ref item 55, nhưng đúng thực tế code là e phải gộp 2 cái mock ref item 55, 77 lại thì 1 list tổng
		 sau đó duyệt tất cả và tính toán thì tính riêng từng ref item mới đúng
		 */
		for (Store store : mockStoresOfRefItemA77) {
			// Nên check thêm null cho an toàn
			if (store.getStorePotential().compareTo(BigDecimal.ZERO) == 0) {
				Integer refStoreId = refStores.get(store.getStoreId());
				if (refStoreId != null) {
					BigDecimal refStorePotential = mockStoresOfRefItemA77.stream()
							.filter(s -> s.getStoreId().equals(refStoreId)).map(Store::getStorePotential).findFirst()
							.orElse(BigDecimal.ZERO);
					refStorePotential = refStorePotential.setScale(1, RoundingMode.HALF_UP);
					store.setStorePotential(refStorePotential);
				} else {
					store.setStorePotential(StoreUtils.caculatorAverage());
				}
			}
		}
		System.out.println("===========Step 2:Filling gaps by references or average=============");
		System.out.println(mockStoresOfRefItemA77);

		List<Store> demandStore = new ArrayList<>();
		for (int i = 0; i < mockStoresOfRefItemA77.size(); i++) {
			BigDecimal storePotential77 = mockStoresOfRefItemA77.get(i).getStorePotential();
			BigDecimal storePotential55 = mockStoresOfRefItemA55.get(i).getStorePotential();
			BigDecimal sum = storePotential77.multiply(bd(1.5)).add(storePotential55.multiply(bd(2.5)));
			BigDecimal divide = sum.divide(bd(4));
			BigDecimal average = divide.multiply(DataModel.mockStoreTrendFactors().get(i + 1));
			average = average.setScale(1, RoundingMode.HALF_UP);
			Store store = mockStoresOfRefItemA77.get(i);
			store.setStorePotential(average);
			demandStore.add(store);
		}
		System.out.println("===========Step 3: Calculate Store Demand of current Item=============");
		System.out.println(demandStore);

		Map<Integer, BigDecimal> totalPotentialByWhId = new HashMap<>();
		for (Store store : demandStore) {
			Integer whId = store.getWhId();
			BigDecimal storePotential = store.getStorePotential();
			BigDecimal currentTotal = totalPotentialByWhId.getOrDefault(whId, BigDecimal.ZERO);
			BigDecimal newTotal = currentTotal.add(storePotential);

			totalPotentialByWhId.put(whId, newTotal);
		}
		StoreUtils.printMap(totalPotentialByWhId, "Step 4:Sum up Demand to WH Level");

		Map<Integer, BigDecimal> percentagesByWhId = new HashMap<>();
		BigDecimal totalSum = BigDecimal.ZERO;
		for (BigDecimal value : totalPotentialByWhId.values()) {
			totalSum = totalSum.add(value);
		}
		for (Map.Entry<Integer, BigDecimal> entry : totalPotentialByWhId.entrySet()) {
			Integer whId = entry.getKey();
			BigDecimal value = entry.getValue();
			BigDecimal percentage = value.divide(totalSum, 4, RoundingMode.HALF_UP).multiply(new BigDecimal("100.0"));
			percentagesByWhId.put(whId, percentage);
		}
		StoreUtils.printMap(percentagesByWhId, " Step 5 Calculate Shares");

		Map<Integer, BigDecimal> shares = new HashMap<>();
		for (Map.Entry<Integer, BigDecimal> entry : percentagesByWhId.entrySet()) {
			Integer key = entry.getKey();
			BigDecimal value = entry.getValue();

			BigDecimal newValue = value.divide(new BigDecimal("100"))
					.multiply(BigDecimal.valueOf(StoreUtils.planningAmountCountry));

			shares.put(key, newValue);
		}
		StoreUtils.printMap(shares, "Step 6 Allocate by Shares");

		for (Map.Entry<Integer, BigDecimal> entry : shares.entrySet()) {
			Integer key = entry.getKey();
			BigDecimal value = entry.getValue();
			// Hmm ?
			if (value.compareTo(new BigDecimal("2")) < 0) {
				shares.put(key, new BigDecimal("2"));
			}
		}
		StoreUtils.printMap(shares, "Step 7 Apply Minimum");

		Map<Integer, BigDecimal> recalculateShare = new HashMap<>();
		BigDecimal sumStep8 = BigDecimal.ZERO;
		for (BigDecimal value : shares.values()) {
			if (value.compareTo(bd(2)) != 0) {
				sumStep8 = sumStep8.add(value);
			}
		}
		for (Map.Entry<Integer, BigDecimal> entry : shares.entrySet()) {
			Integer whId = entry.getKey();
			BigDecimal value = entry.getValue();
			BigDecimal percentage = value.divide(sumStep8, 4, RoundingMode.HALF_UP).multiply(new BigDecimal("100.0"));
			recalculateShare.put(whId, percentage);
		}
		StoreUtils.printMap(recalculateShare, "Step 8 Recalculate Share");

		Map<Integer, BigDecimal> reallocate = new HashMap<>();
		int count = 0;
		for (Map.Entry<Integer, BigDecimal> entry : shares.entrySet()) {
			BigDecimal value = entry.getValue();
			if (value.compareTo(bd(2)) == 0) {
				count++;
			}
		}
		for (Map.Entry<Integer, BigDecimal> entry : recalculateShare.entrySet()) {
			Integer key = entry.getKey();
			BigDecimal value = entry.getValue();
			if (value.compareTo(bd(2)) != 0) {
				BigDecimal newValue = value.divide(new BigDecimal("100"))
						.multiply(BigDecimal.valueOf(StoreUtils.planningAmountCountry - count * 2));
				reallocate.put(key, newValue);
			} else {
				reallocate.put(key, bd(2));
			}
		}
		StoreUtils.printMap(reallocate, "Step 9 Reallocate");

		Map<Integer, BigDecimal> roundUp = new HashMap<>();
		for (Map.Entry<Integer, BigDecimal> entry : reallocate.entrySet()) {
			Integer key = entry.getKey();
			BigDecimal value = entry.getValue();
			BigDecimal roundedValue = value.setScale(0, RoundingMode.CEILING);
			roundUp.put(key, roundedValue);
		}
		StoreUtils.printMap(roundUp, "Step 10 Round Up");
		// Step 11 Fix Rounding

	}
}