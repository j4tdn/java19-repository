package view;

import java.awt.PageAttributes.OriginType;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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
		// Thiếu step 1
		
		List<Store> storeA55 = mockStoresOfRefItemA55();
		List<Store> storeA77 = mockStoresOfRefItemA77();
		Map<Integer, Integer> refStore = mockRefStores();
		Map<Integer, BigDecimal> refWeights = mockRefWeights();
		Map<Integer, BigDecimal> storeTrendFactors = mockStoreTrendFactors();
		Map<Integer, Integer> whOfStore = storeA55.stream().collect(Collectors.toMap(Store::getStoreId, Store::getWhId));
		
		// Step 2
		fillingGap(storeA77, refStore);
		
		// Step 3
		Map<Integer, BigDecimal> demands = calculateDemand(List.of(storeA55, storeA77), storeTrendFactors, refWeights);
		
		CollectionUtils.generate("demands", demands);
		
		// Step 4
		Map<Integer, BigDecimal> sumDemandOfWH = sumDemandOfWH(demands, whOfStore);
		CollectionUtils.generate("sumDemandOfWH", sumDemandOfWH);
	}
	
	/*
	 Code chạy được nhưng hơi nhớp
	 	+ Hàm này e viết xong e ko lấy kết quả làm gì cả ở chỗ gọi thì return làm gì ?
	 	+ Xử lý và cập nhật trực tiếp vào stores ban đầu luôn là được rồi
	 	+ Đặt tên biến số nhiều là phải có s phía sau e nha
	 */
	private static List<Store> fillingGap(List<Store> stores, Map<Integer, Integer> refStore){
		List<Store> filledStores = new ArrayList<>();
		
		List<Store> havePotentialStores = stores.stream().filter(t -> t.getStorePotential().compareTo(bd(0f)) > 0).collect(Collectors.toList());
		
		Map<Integer, BigDecimal> oldPotentialStoresMap = stores.stream().collect(Collectors.toMap(Store::getStoreId, Store::getStorePotential));
		
		BigDecimal averagePotential = calcAveragePotential(havePotentialStores);
		
		for (Store store : stores) {
			if(store.getStorePotential().compareTo(bd(0f)) != 0) {
				store.setStorePotential(store.getStorePotential().setScale(1, RoundingMode.HALF_UP));
				filledStores.add(store);
			}
			else {
				BigDecimal refStorePotential = oldPotentialStoresMap.get(refStore.get(store.getStoreId()));
				if(store.getStorePotential().compareTo(bd(0d)) == 0 && refStore.containsKey(store.getStoreId()) && (refStorePotential.compareTo(bd(0f)) > 0)) {
					store.setStorePotential(refStorePotential.setScale(1, RoundingMode.HALF_UP));
					filledStores.add(store);
				}
				else {
					store.setStorePotential(averagePotential.setScale(1, RoundingMode.HALF_UP));
					filledStores.add(store);
				}
			}
		}
			
		CollectionUtils.generate("filledStores", filledStores);
		
		return filledStores;
	}
	
	
	// dang bi sai o day
	private static Map<Integer, BigDecimal> calculateDemand(List<List<Store>> allStores, Map<Integer, BigDecimal> storeTrendFactors, Map<Integer, BigDecimal> refWeights) {
	    Map<Integer, BigDecimal> demands = new HashMap<>();
	    
	    // E tạo nhiều biến hơi bị thừa
	    // A hiểu là nếu weight of ref item bị null hoặc zero thì đề yêu cầu dùng 1
	    // if else chỗ dùng là được rồi chứ cũng k nhất thiết phải tạo cái map lưu giá trị 1 làm gì
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

	    BigDecimal sumRefWeight = fixRefWeights.values()
	            .stream()
	            .reduce(BigDecimal.ZERO, BigDecimal::add);
	    
	    // Thay vì phải for stores 2 lần lồng nhau
	    // E có thể dùng flatMap để biến List<List<T>> thành List<T>, học rồi
	    
	    // get(0) thì nó có thể get cho data của ref item 55 hoặc 77 còn thằng còn lại ko được tính
	    for (int i = 0; i < allStores.get(0).size(); i++) {
	        Integer storeId = allStores.get(0).get(i).getStoreId();

	        BigDecimal demand = BigDecimal.ZERO;
	        
	        
	        for (List<Store> stores : allStores) {
	            Store store = stores.get(i);
	            BigDecimal storePotential = store.getStorePotential();
	            
	            if (storePotential != null && fixRefWeights.containsKey(store.getStoreId())) {
	                BigDecimal refWeight = fixRefWeights.get(store.getStoreId());
	                demand = demand.add(storePotential.multiply(refWeight));
	            }
	        }
	        
	        if (sumRefWeight.compareTo(bd(0f)) != 0 && fixStoreTrendFactors.containsKey(storeId)) {
	            demand = demand.divide(sumRefWeight, 1, RoundingMode.HALF_UP)
	                          .multiply(fixStoreTrendFactors.get(storeId));
	        }
	        
	        // A chưa đọc kỹ e check 2 điều kiện trên cho tính demand làm gì nhưng cả 2 điều kiện trên
	        // ko có tỏe nào thỏa mãn nên demand luôn bằng ZERO
	        
	        demands.put(storeId, demand);
	    }
	    

	    return demands;
	}

	
	
	private static Map<Integer, BigDecimal> sumDemandOfWH(Map<Integer, BigDecimal> demands, Map<Integer, Integer> whOfStore){
		
	    Map<Integer, BigDecimal> sumByWH = new HashMap<>();

	    for (Map.Entry<Integer, BigDecimal> entry : demands.entrySet()) {
	        Integer storeId = entry.getKey();
	        BigDecimal demand = entry.getValue();

	        Integer whId = whOfStore.get(storeId);

            if (sumByWH.containsKey(whId)) {
                BigDecimal currentSum = sumByWH.get(whId);
                sumByWH.put(whId, currentSum.add(demand));
            }
            else {
                sumByWH.put(whId, demand);
            }
	    }

	    return sumByWH;
	}
	
	
	private Map<Integer, BigDecimal> calculateShares(Map<Integer, BigDecimal> sumDemandOfWH){
		Map<Integer, BigDecimal> sharesMap = new HashMap<>();
		return null;
	}
	
	
	private static BigDecimal calcAveragePotential(List<Store> stores) {
		BigDecimal sum = stores.stream().map(Store::getStorePotential).reduce(BigDecimal.ZERO, BigDecimal::add);
		return sum.divide(BigDecimal.valueOf(stores.size()), 1, RoundingMode.HALF_UP);
	}
}
