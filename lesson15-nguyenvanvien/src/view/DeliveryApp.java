package view;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import bean.Store;
import model.DataModel;
import utils.NumberUtils;

public class DeliveryApp {
	
	/*
	 
	 Em đặt sai tên dự án lesson15.. ko phải lession15..
	 Code của em bị trùng với bạn Kiên
	 
	 + Commit của Viên: https://github.com/j4tdn/java19-repository/commit/9a4b060ac639fb4e667438a9bb6654d2e3181045#diff-c3026d8d582a4ed463664813fe236a536e98aa4ad4bc7ef85e8de021ba85c68a
	 + Commit của Kiên: https://github.com/j4tdn/java19-repository/commit/d1a83626bd0ab9f93a23f17c84115d03e2ca447a#diff-4ad78dcb7f72b2beb7f4c7a664542322877ef4f256f11d42f76c6ac094cfeadc
	 
	 Em có thể xem phần review tại đây nha: https://github.com/j4tdn/java19-repository/commit/5b33377c52943e12231634a22d55e713d172335d
	 */
	
	public static void main(String[] args) {
		int planningAmount = enterPlanningAmount();
		List<Store> storesOfRefItemA55 = DataModel.mockStoresOfRefItemA55();
		List<Store> storesOfRefItemA77 = DataModel.mockStoresOfRefItemA77();

		System.out.println("Reference Item after Gaps of A55");
		fillingGaps(storesOfRefItemA55);
		printStore(storesOfRefItemA55);

		System.out.println("\nReference Item after Gaps of A77");
		fillingGaps(storesOfRefItemA77);
		printStore(storesOfRefItemA77);

		// Calculate Store Demand of curent Item
		List<BigDecimal> storeDemand = new ArrayList<>();
		Map<Integer, BigDecimal> storeTrendFactors = DataModel.mockStoreTrendFactors();
		for (int i = 0; i < storesOfRefItemA55.size(); i++) {
			Integer key = i + 1; // Tính toán khóa dựa trên giá trị i
		    BigDecimal trendFactor = storeTrendFactors.get(key);
			storeDemand.add(calculateStoreDemand(storesOfRefItemA55.get(i).getStorePotential(),
					storesOfRefItemA77.get(i).getStorePotential()).multiply(trendFactor)
					);
		}
		
		System.out.println("\nCalculate store demand of curent Item");
		printStore(storeDemand);
		System.out.println("\nShare percent : ");
		
		List<String> nameWhs = List.of(
				"WH 1",
				"WH 2",
				"WH 3"
				);
		Map<String, BigDecimal>  demandNewCampainInWHLevel = getDemandNewCampainInWHLevel(storesOfRefItemA55,storeDemand,nameWhs);
		
		List<BigDecimal> sharePercent = new ArrayList<>();
		BigDecimal sum = demandNewCampainInWHLevel.values().stream()
		        .reduce(BigDecimal.ZERO, BigDecimal::add);

		for (int i = 0; i < nameWhs.size(); i++) {
		    BigDecimal divisor = demandNewCampainInWHLevel.get(nameWhs.get(i));
		    BigDecimal result = BigDecimal.ZERO;

		    if (sum.compareTo(BigDecimal.ZERO) != 0) { // Kiểm tra tránh chia cho 0
		        result = divisor.divide(sum, 4, RoundingMode.HALF_UP);
		    }

		    sharePercent.add(result);
		}

		printStore(sharePercent);
		
		System.out.println("\nAllocate : ");
		List<BigDecimal> allocate = new ArrayList<>();
		for (int i = 0; i < sharePercent.size(); i++) {
		    BigDecimal percent = sharePercent.get(i);
		    BigDecimal allocation = percent.multiply(BigDecimal.valueOf(planningAmount));
		    allocate.add(allocation);
		}
		printStore(allocate);
		BigDecimal sumAllocate = allocate.stream()
		        .reduce(BigDecimal.ZERO, BigDecimal::add);
		if(sumAllocate.compareTo(BigDecimal.valueOf(planningAmount))==0) {
			List<Integer> roundedAllocate = new ArrayList<>();
	        for (BigDecimal value : allocate) {
	            BigDecimal roundedValue = value.setScale(0, RoundingMode.CEILING);
	            roundedAllocate.add(roundedValue.intValue());
	        }
	        System.out.println("\nRound up : ");
	        printStore(roundedAllocate);
		}
		else {
			
		}
	}
	
	private static Map<String, BigDecimal> getDemandNewCampainInWHLevel(List<Store> storesOfRefItem,List<BigDecimal> storeDemand, List<String> nameWhs){
		Map<String, BigDecimal> demandNewCampainInWHLevel = new HashMap<>();
		for(int i=0; i<nameWhs.size();i++) {
			BigDecimal sum = BigDecimal.ZERO;
			for(int j =0; j< storesOfRefItem.size();j++) {
				if(storesOfRefItem.get(j).getWhId().equals(i+1)) {
					sum = sum.add(storeDemand.get(j));
				}
			}
			demandNewCampainInWHLevel.put(nameWhs.get(i), sum);
		}
		return demandNewCampainInWHLevel;
	}

	private static BigDecimal calculateStoreDemand(BigDecimal potentialRef1, BigDecimal potentialRef2) {
		Map<Integer, BigDecimal> refsWeight = DataModel.mockRefWeights();
		Iterator<BigDecimal> iterator = refsWeight.values().iterator();
		BigDecimal weightRef1 = iterator.next();
		if (weightRef1.equals(BigDecimal.ZERO)) {
			weightRef1 = NumberUtils.bd(1);
		}
		BigDecimal weightRef2 = iterator.next();
		if (weightRef2.equals(BigDecimal.ZERO)) {
			weightRef2 = NumberUtils.bd(1);
		}

		BigDecimal numerator = potentialRef1.multiply(weightRef1).add(potentialRef2.multiply(weightRef2));

		BigDecimal denominator = weightRef1.add(weightRef2);

		if (denominator.compareTo(BigDecimal.ZERO) != 0) {
			return numerator.divide(denominator, 2, RoundingMode.HALF_UP);
		} else {
			return BigDecimal.ZERO; // Hoặc xử lý khác tùy ý
		}
	}

	private static <E> void printStore(List<E> elements) {
		for (E e : elements) {
			System.out.println(e.toString());
		}
	}

	private static void fillingGaps(List<Store> storesOfRefItem) {
		Map<Integer, Integer> refstore = DataModel.mockRefStores();
		BigDecimal medium = callCulateMedium(storesOfRefItem);
		for (Store store : storesOfRefItem) {
			if (store.getStorePotential().equals(NumberUtils.bd(0))) {
				if (refstore.containsKey(store.getStoreId())) {
					if (getStoreByStoreId(refstore.get(store.getStoreId()), storesOfRefItem).getStorePotential()
							.equals(NumberUtils.bd(0))) {
						store.setStorePotential(medium);
					} else {
						store.setStorePotential(getStoreByStoreId(refstore.get(store.getStoreId()), storesOfRefItem)
								.getStorePotential());
					}
				} else {
					store.setStorePotential(medium);
				}
			}
		}
	}

	private static BigDecimal callCulateMedium(List<Store> storesOfRefItem) {
		BigDecimal sum = storesOfRefItem.stream().map(Store::getStorePotential).reduce(BigDecimal.ZERO,
				BigDecimal::add);

		long countNonZero = storesOfRefItem.stream().map(Store::getStorePotential)
				.filter(value -> value.compareTo(BigDecimal.ZERO) != 0).count();

		if (countNonZero == 0) {
			return BigDecimal.ZERO;
		} else {
			return sum.divide(BigDecimal.valueOf(countNonZero), 2, RoundingMode.HALF_UP);
		}
	}

	private static Store getStoreByStoreId(Integer storeId, List<Store> storesOfRefItem) {
		return storesOfRefItem.stream().filter(it -> it.getStoreId().equals(storeId)).findFirst().orElse(null);
	}

	private static int enterPlanningAmount() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter Planning amount : ");
		int planningAmount = scanner.nextInt();
		if (planningAmount < 0) {
			System.exit(1);
		}
		return planningAmount;
	}
}