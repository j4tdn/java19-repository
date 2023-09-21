package utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import bean.Store;
import model.DataModel;

public class StoreUtils {
	private static List<Store> mockStoresOfRefItemA77 = DataModel.mockStoresOfRefItemA77();
	public static Integer planningAmountCountry = 10;
	public static Integer minPerWH = 2;

	private StoreUtils() {

	}

	public static List<Store> nonZeroPotentialStores() {
		return mockStoresOfRefItemA77.stream()
				.filter(store -> store.getStorePotential().compareTo(BigDecimal.ZERO) != 0)
				.collect(Collectors.toList());
	}

	public static BigDecimal caculatorAverage() {
		BigDecimal totalPotential = mockStoresOfRefItemA77.stream().map(Store::getStorePotential)
				.reduce(BigDecimal.ZERO, BigDecimal::add);
		BigDecimal averagePotential = totalPotential
				.divide(BigDecimal.valueOf(StoreUtils.nonZeroPotentialStores().size()), 1, RoundingMode.HALF_UP);
		return averagePotential;
	}

	public static void printMap(Map<Integer, BigDecimal> map, String prefix) {
		System.out.println("=================" + prefix + "======================");
		for (Map.Entry<Integer, BigDecimal> entry : map.entrySet()) {
			Integer key = entry.getKey();
			BigDecimal value = entry.getValue();
			System.out.println("whId " + key + ": " + value);
		}
	}

}
