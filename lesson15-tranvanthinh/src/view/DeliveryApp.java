package view;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.xml.crypto.Data;

import bean.Store;
import model.DataModel;
import utils.CollectionUtils;
import utils.NumberUtils;

public class DeliveryApp {
	
	// Những biến không dùng nên xóa đi em nha
	private static final String List = null;

	public static void main(String[] args) {
		
		Integer planningAmountCountry = 10;
		
		// Code ko nên dùng handle e nha, hơi chung chung mơ hồ, tập cho quen để còn code trong project
		handle(planningAmountCountry);

		
	}
	
	private static void handle(Integer planningAmountCountry) {
		List<Store> storesA55 = fillingGaps(DataModel.mockStoresOfRefItemA55());
		List<Store> storesA77 = fillingGaps(DataModel.mockStoresOfRefItemA77());
		
		List<List<Store>> stores = new ArrayList<>();
		stores.add(storesA55);
		stores.add(storesA77);
		
		// Sao a ko thấy step tính store demand ?
		Map<Integer, BigDecimal> demandInWH = calcDemandInWH(stores);
		CollectionUtils.generate("demand", demandInWH);
		Map<Integer, BigDecimal> allocateByShare = calcAllocateByShare(demandInWH, planningAmountCountry );
		
		CollectionUtils.generate("allocateByShare", allocateByShare);
		
		applyMin(allocateByShare, planningAmountCountry) ;
		
		
	}
	
	private static BigDecimal getAveragePotential() {
		List<BigDecimal> potential = DataModel.mockStoresOfRefItemA77().stream()
												.filter(store -> !store.getStorePotential().equals(NumberUtils.bd(0)) )
												.map(Store::getStorePotential).collect(Collectors.toList());
		return potential.stream()
				.reduce(BigDecimal.ZERO, (a, b) -> a.add(b))
				.divide(new BigDecimal(potential.size()), 1, RoundingMode.HALF_EVEN);
	}
	
	private static BigDecimal caculateExpectSaleForStoresNoPotentialHasReferenceStore(Integer storeId) {
		// Có thể dùng hàm findFirst chứ get 0 hơi nguy hiểm lỡ list trả về ko có phần tử nào là exception
		Store storeReference = DataModel.mockStoresOfRefItemA77()
				.stream()
				.filter(storeCheck -> storeCheck.getStoreId().equals(storeId))
				.collect(Collectors.toList()).get(0);
		BigDecimal newExpectedSales = (storeReference.getStorePotential().equals(NumberUtils.bd(0)) ) ?
											  getAveragePotential() : storeReference.getStorePotential();
		return NumberUtils.bdround(newExpectedSales,1);
		
	}
	
	private static List<Store> fillingGaps(List<Store> stores){
		Map<Integer, Integer> refStores = DataModel.mockRefStores();
		
		return stores.stream().map(store -> {
			// BigDecimal thì nên dùng hàm compareTo thay vì equals
			// 0.00 sẽ khác 0.0
			
			// Hàm getAveragePotential e gọi 2 lần trong setStorePotential và caculateExpectSaleForStoresNoPotentialHasReferenceStore
			// Nên tạo 1 biến rồi truyền tham số qua hàm tránh gọi và tính toán nhiều lần
			if(store.getStorePotential().equals(NumberUtils.bd(0))) {
				if(refStores.containsKey(store.getStoreId())) {
					store.setStorePotential(caculateExpectSaleForStoresNoPotentialHasReferenceStore(refStores.get(store.getStoreId())));
				}
				else {
					store.setStorePotential(getAveragePotential());
				}
			}
			else
				store.setStorePotential(NumberUtils.bdround(store.getStorePotential(), 1));
			return store;
		}).collect(Collectors.toList());
	}
	
	private static Map<Integer, BigDecimal> calcDemandInWH(List<List<Store>> stores){
		Map<Integer, BigDecimal> demands = new HashMap<>();
		Map<Integer, BigDecimal> storeTrendFactors = DataModel.mockStoreTrendFactors();
		Map<Integer, BigDecimal> refWeight = DataModel.mockRefWeights();
		BigDecimal sumRefWeight = refWeight.values()
        .stream()
        .reduce(BigDecimal.ZERO, BigDecimal::add);
		
		// Em get(0) như này rồi get(1) cho ref item 77 stores đâu rồi
		// Dù sao đi nữa, học đến collection vs stream rồi mà code 2 vòng for i j như này a thấy ko phải là 1 cách hay
		// nhìn khó đọc code, e có thể dùng flat map để gộp stores lại
		for (int i = 0; i < stores.get(0).size(); i++) {
			// A chưa đọc hết logic nhưng nếu được e nên tách ra 1 hàm từ dòng 108 đến 112 cho dễ đọc
			BigDecimal demand = BigDecimal.ZERO;
            for (int j = 0; j < stores.size(); j++) {
    			 Integer itemId = stores.get(j).get(i).getItem().getItemId();
                 demand = demand.add(stores.get(j).get(i).getStorePotential().multiply(refWeight.get(itemId)));
            }
            Integer storeId = stores.get(0).get(i).getStoreId();
            demand = demand.divide(sumRefWeight, 1, RoundingMode.HALF_EVEN).multiply(storeTrendFactors.get(storeId));
            Integer whId = stores.get(0).get(i).getWhId();
            BigDecimal newDemand = demands.containsKey(whId) ? demands.get(whId).add(demand) : demand;
            
            demands.put(whId, NumberUtils.bdround(newDemand,1));
        }
		return demands;
	}
	
	private static Map<Integer, BigDecimal> calcAllocateByShare(Map<Integer, BigDecimal> demandInWH, Integer planningAmountCountry){
		Map<Integer, BigDecimal> allocateByShare = new HashMap<>();
		
		BigDecimal sumdemandWH = demandInWH.values().stream().reduce(BigDecimal.ZERO, BigDecimal::add);
		
		for(Integer key : demandInWH.keySet()) {
			allocateByShare.put(key, demandInWH.get(key)
					.divide(sumdemandWH, 10, RoundingMode.HALF_EVEN)
					.multiply(NumberUtils.bd(planningAmountCountry)));
		}
		return allocateByShare;
	}

	// Vì sao step apply min mà tính luôn cả các step 8 9 10 11
	private static void applyMin(Map<Integer, BigDecimal> allocateByShare, Integer planningAmountCountry) {
		boolean checkApplyMin = false;
		BigDecimal sumAlocateStep7 = BigDecimal.ZERO;
		Integer remain = planningAmountCountry;
		for(Integer key : allocateByShare.keySet()) {
			if (allocateByShare.get(key).compareTo(NumberUtils.bd(2)) < 0) {
				allocateByShare.put(key, NumberUtils.bd(2));
				checkApplyMin = true;
				// hard code, nên lấy từ 1 biến nào đó chứ k phải luôn luôn 2
				remain -= 2;
			}
			else {
				sumAlocateStep7 = sumAlocateStep7.add(allocateByShare.get(key));
			}
		}
		Map<Integer, BigDecimal> step10 = new HashMap<>();
		if(checkApplyMin) {
			for(Integer key : allocateByShare.keySet()) {
				if (!allocateByShare.get(key).equals(NumberUtils.bd(2))) {
					BigDecimal allocationStep10 = allocateByShare.get(key).divide(sumAlocateStep7, 10, RoundingMode.HALF_EVEN).multiply(NumberUtils.bd(remain)).setScale(0, RoundingMode.UP);
					step10.put(key,allocationStep10);
				}
				else {
					step10.put(key,allocateByShare.get(key).setScale(0, RoundingMode.UP));
				}
			}
			// Step 11 not done
//			if(!step10.values().stream().reduce(BigDecimal.ZERO, BigDecimal::add).equals(NumberUtils.bd(planningAmountCountry))) {
//				
//			}
		}
		CollectionUtils.generate("step10", step10);
		
	}
}































