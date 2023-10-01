package view;

import bean.Store;

import static model.DataModel.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;

public class DeliveryApp {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    	
    	/*
    	   Tổng quan
    	   + Code còn hơi nhớp Hưng nghe
    	   + Có những hàm e gọi rất nhiều lần ví dụ mockRefStores() .. sao ko tạo 1 biến rồi passing qua hàm, vì gọi hàm mà
    	     nó thực hiện logic hay truy vấn database là chết
    	     
    	   --> Code chưa tốt như kì vọng Hưng nghe  
    	 */
        
    	// Step 1
        int planningAmountCountry = sc.nextInt();
        if (planningAmountCountry <= 0) return;
        
        // Step 2
        Map<Integer, BigDecimal> fillingGapsStore55 = fillingGaps(mockRefStores(), mockRefStore55());
        Map<Integer, BigDecimal> fillingGapsStore77 = fillingGaps(mockRefStores(), mockRefStore77());
        System.out.println("\nStep 2: Filling gaps");
        fillingGapsStore77.forEach((k, v) -> {
        	System.out.println(k + ", " + v);
        });
        
        // Step 3
        Map<Integer, BigDecimal> demmandStore = storeDemand(mockRefStore55(), mockRefStore77(), mockRefWeights(), mockStoreTrendFactors());
        
        // Step 4
        Map<Integer, BigDecimal> sumUpDemmand = sumUpDemmand(demmandStore, mockStoresOfRefItemA55());
        
        // Step 5
        Map<Integer, BigDecimal> calculateShares = calculateShares(sumUpDemmand);
        
        // Step 6
        Map<Integer, BigDecimal> allocateByShare = allocateByShare(calculateShares, planningAmountCountry);
        
        // Step 7


    }

    public static Map<Integer, BigDecimal> fillingGaps(Map<Integer, Integer> refStore, Map<Integer, BigDecimal> potentialMap) {
        // Đọc code hơi rồi Hưng ơi
    	// A có test thử thì cũng chưa filling gap được nữa
    	Map<Integer, BigDecimal> fillingRes = new HashMap<>();
        Map<Integer, BigDecimal> fillingRefRes = new HashMap<>();
        potentialMap.entrySet().forEach(store -> {
            if (store.getValue() != null) {
                fillingRes.put(store.getKey(), store.getValue());
            } else if (store.getValue().equals(BigDecimal.ZERO) && refStore.containsKey(store.getKey()) && !potentialMap.get(refStore.get(store.getKey())).equals(BigDecimal.ZERO)) {
                fillingRefRes.put(store.getKey(), potentialMap.get(refStore.get(store.getKey())));
            }
        });
        BigDecimal temp = BigDecimal.ZERO;
        Collection<BigDecimal> c = fillingRes.values();
        for (BigDecimal bd : c) {
            temp = temp.add(bd);
        }
        BigDecimal finalTemp = temp;
        potentialMap.entrySet().forEach(store -> {
            if ((store.getValue().equals(BigDecimal.ZERO)
                    && refStore.containsKey(store.getKey())
                    && potentialMap.get(refStore.get(store.getKey())).equals(BigDecimal.ZERO))
                    || ((store.getValue().equals(BigDecimal.ZERO)
                    && !refStore.containsKey(store.getKey())))) {
                BigDecimal avg = finalTemp.divide(new BigDecimal(fillingRes.size()));
                fillingRes.put(store.getKey(), avg);
            }
        });
        fillingRes.putAll(fillingRefRes);
        return fillingRes;
    }

    public static Map<Integer, BigDecimal> storeDemand(Map<Integer, BigDecimal> potentialRefA55,
                                                       Map<Integer, BigDecimal> potentialRefA77,
                                                       Map<Integer, BigDecimal> refWeight,
                                                       Map<Integer, BigDecimal> storeTrendFactors) {
        Map<Integer, BigDecimal> res = new HashMap<>();
        BigDecimal newCampaign;
        for (int i = 1; i <= potentialRefA55.size(); i++) {
            newCampaign = ((potentialRefA55.get(i)
                    .multiply(refWeight.get(55)))
                    .add(potentialRefA77.get(i).multiply(refWeight.get(77)))
                    .divide(refWeight.get(55).add(refWeight.get(77)))
                    .multiply(storeTrendFactors.get(i)));
            res.put(i, newCampaign);
        }
        return res;
    }

    public static Map<Integer, BigDecimal> sumUpDemmand(Map<Integer, BigDecimal> demmandStore, List<Store> storesOfRefItem) {
        Map<Integer, BigDecimal> res = new HashMap<>();
        storesOfRefItem.forEach(store -> {
            res.put(store.getWhId(), res.getOrDefault(store.getWhId(), BigDecimal.ZERO).add(demmandStore.get(store.getStoreId())));
        });
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
        // Em lỗi ở đây là vì thiếu phần rounding model khi gọi hàm divide
        sumUpDemmand.entrySet().forEach(WH -> result.put(WH.getKey(), WH.getValue().divide(temp, RoundingMode.HALF_UP)));
        return result;
    }

    public static Map<Integer, BigDecimal> allocateByShare(Map<Integer, BigDecimal> shareWH, int planningAmountCountry) {
        Map<Integer, BigDecimal> result = new HashMap<>();

        shareWH.entrySet().forEach(WH -> result.put(WH.getKey(), (WH.getValue().divide(new BigDecimal(100))
                                                                    .multiply(new BigDecimal(planningAmountCountry)))));
        return result;
    }
}
