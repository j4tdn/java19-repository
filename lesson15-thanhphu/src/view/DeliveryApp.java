package view;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

import bean.Item;
import bean.Store;
import static model.DataModel.*;
import static utils.CollectionUtils.*;

public class DeliveryApp {
	
	public static void main(String[] args) {
		
		var storeOfRefItemA55 = mockStoresOfRefItemA55();
		var storeOfRefItemA77 = mockStoresOfRefItemA77();
		var refStore = mockRefStores();
		var mockStoreOfRes55 = mockStoreOfRes55();
		var mockStoreOfRes77 = mockStoreOfRes77();
		
		
		Scanner ip = new Scanner(System.in);
		
		int planningAmoutCountry = Integer.parseInt(ip.nextLine());
		//step 1
		
		checkForPlanningAmount(planningAmoutCountry);
		
		//step 2
		Map<Integer, BigDecimal> fillingGapsStore55 = fillingGapsByReferencesOrAverage(refStore, mockStoreOfRes55);
		generate("fillingGapsStore55", fillingGapsStore55);
        Map<Integer, BigDecimal> fillingGapsStore77 = fillingGapsByReferencesOrAverage(refStore, mockStoreOfRes77);
        generate("fillingGapsStore77", fillingGapsStore77);
		//step 3
        
        Map<Integer, BigDecimal> demmandStore = calStoreDemand(mockStoreOfRes55, mockStoreOfRes77, mockRefWeights(), mockStoreTrendFactors());
        generate("demmandStore", demmandStore);
		//step 4
        
        
		
		
		
	}
	
	public static int checkForPlanningAmount(int n) {
		
		if( n <= 100) {
			System.out.println("Stop Calculation");
		}else {
			System.out.println("Continue with step 2");
		}
		
		return n;
	}
	
	/*
	 Kết quả chưa filling gap được cho store 10 và store 12 của ref item 77
	 Các bước khác sẽ bị sai nếu bước 2 chưa hoàn thành
	 */
	public static Map<Integer, BigDecimal> fillingGapsByReferencesOrAverage(Map<Integer, Integer> refStore, Map<Integer, BigDecimal> potentialStore) {
        Map<Integer, BigDecimal> filledMap = new HashMap<>();

        for (Map.Entry<Integer, BigDecimal> entry : potentialStore.entrySet()) {
            Integer key = entry.getKey();
            BigDecimal value = entry.getValue();

            if (value != null) {
                filledMap.put(key, value);
            } else if (BigDecimal.ZERO.equals(value) && refStore.containsKey(key) && !BigDecimal.ZERO.equals(potentialStore.get(refStore.get(key)))) {
                filledMap.put(key, potentialStore.get(refStore.get(key)));
            }
        }

        BigDecimal sum = BigDecimal.ZERO;
        for (BigDecimal value : filledMap.values()) {
            sum = sum.add(value);
        }
        BigDecimal average = sum.divide(new BigDecimal(filledMap.size()), RoundingMode.HALF_UP);

        for (Map.Entry<Integer, BigDecimal> entry : potentialStore.entrySet()) {
            Integer key = entry.getKey();
            BigDecimal value = entry.getValue();

            if ((BigDecimal.ZERO.equals(value) && refStore.containsKey(key) && BigDecimal.ZERO.equals(potentialStore.get(refStore.get(key))))
                    || (BigDecimal.ZERO.equals(value) && !refStore.containsKey(key))) {
                filledMap.put(key, average);
            }
        }

        return filledMap;
    }
	    
	
	public static Map<Integer, BigDecimal> calStoreDemand(Map<Integer, BigDecimal> potentialRefA55,
			Map<Integer, BigDecimal> potentialRefA77, Map<Integer, BigDecimal> refWeight,
			Map<Integer, BigDecimal> storeTrendFactors) {
		Map<Integer, BigDecimal> demandMap = new HashMap<>();

		potentialRefA55.forEach((key, value) -> {
			BigDecimal weight55 = refWeight.get(55);
			BigDecimal weight77 = refWeight.get(77);
			BigDecimal trendFactor = storeTrendFactors.get(key);

			BigDecimal demand = value.multiply(weight55).add(potentialRefA77.get(key).multiply(weight77))
					.divide(weight55.add(weight77), BigDecimal.ROUND_HALF_UP).multiply(trendFactor);

			demandMap.put(key, demand);
		});

		return demandMap;
	}
	
	
	
}