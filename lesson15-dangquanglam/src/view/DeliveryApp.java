package view;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import bean.Store;
import model.DataModel;

public class DeliveryApp {
	
	// Khi nào trong code trong dự án nếu comment ko dùng thì em có thể xóa luôn
	
	public static void main(String[] args) {
		// Step 1,2
		List<Store> stores77 = DataModel.mockStoresOfRefItemA55();
		List<Store> stores55 = DataModel.mockStoresOfRefItemA77();

		Map<Integer, BigDecimal> potentialMap = new HashMap<>();
		
		/*
		    Em chưa hiểu đề
		    PlanningAmount là số lượng cần được planning, cần được delivery là input có sẵn
		    chứ ko phải đi tính, nó ko liên quan gì đến store potential hết
		 */
		if (calculatePlanningAmount(stores55).compareTo(BigDecimal.valueOf(100)) <= 0) {
			System.out.println("Planning amount is less than or equal to 100. Stopping calculation.");
			return;
		}
		
		/*
		    Bước này chắc là bước 2 - filling gaps
		    Cách code từ đầu chưa hợp lý nên hơi khó khăn lúc code
		    --> E nên gộp stores77 và stores55 vào 1 List của List hoặc List tổng code sẽ đỡ cực hơn
		 */
		processStores(stores55, potentialMap);

		if (calculatePlanningAmount(stores55).compareTo(BigDecimal.valueOf(100)) <= 0) {
			System.out.println("Planning amount is less than or equal to 100. Stopping calculation.");
			return;
		}

		processStores(stores77, potentialMap);

		// Step 3: Calculate Store Demand of current Item
		Map<Integer, BigDecimal> calStoDemand = calStoDemandOfCurItem(DataModel.mockRefStore55(),
				DataModel.mockRefStore77(), DataModel.mockRefWeights(), DataModel.mockStoreTrendFactors());
		
		// Step 4: Sum up Demand to WH Level
		Map<Integer, BigDecimal> sumUpDemand = sumUpDemandToWHLevel(calStoDemand, DataModel.mockStoresOfRefItemA55());

		// Step 5: Calculate Shares
        Map<Integer, BigDecimal> calculateShares = calculateShares(sumUpDemand);
        
        calculateShares.forEach((k, v) -> System.out.println(k + ", " + v));
	}
	
	/*
	 Hàm này chưa đúng logic, như nếu có thể tính lại em nên dùng hàm reduce của stream để xử lý ví dụ như bên dưới
	 Tập áp dụng stream vào
	 */
	private static BigDecimal calculatePlanningAmount(List<Store> stores) {
		BigDecimal planningAmount = stores.stream()
			.map(Store::getStorePotential)
			.reduce(BigDecimal.ZERO, BigDecimal::add);
//		BigDecimal planningAmount = BigDecimal.ZERO;
//		for (Store store : stores) {
//			planningAmount = planningAmount.add(store.getStorePotential());
//		}
		return planningAmount;
	}

	private static void processStores(List<Store> stores, Map<Integer, BigDecimal> potentialMap) {
		for (Store store : stores) {
			if (store.getStorePotential() == null) {
				BigDecimal potential = calculatePotential(store, stores, potentialMap);
				store.setStorePotential(potential);
			}
		}
	}

	private static BigDecimal calculatePotential(Store store, List<Store> stores,
			Map<Integer, BigDecimal> potentialMap) {
		BigDecimal potential = potentialMap.get(store.getStoreId());

		if (potential != null) {
			return potential;
		}

		/*
		    Em thiếu bước kiểm tra rằng
		    Nếu store ko có potential thì phải kiểm tra nó có reference store không đã
		       Nếu có reference store và reference store có potential thì dùng potential đó
		       Nếu có reference store mà reference store ko có potential thì mới tính trung bình
		       Nếu ko có reference store tính trung bình
		 */
		BigDecimal sumPotential = BigDecimal.ZERO;
		int count = 0;
		for (Store s : stores) {
			if (s.getStorePotential() != null) {
				sumPotential = sumPotential.add(s.getStorePotential());
				count++;
			}
		}
		return count > 0 ? sumPotential.divide(BigDecimal.valueOf(count), RoundingMode.HALF_UP)
				: BigDecimal.ZERO;
	}

	public static Map<Integer, BigDecimal> calStoDemandOfCurItem(Map<Integer, BigDecimal> potentialRefA55,
			Map<Integer, BigDecimal> potentialRefA77, Map<Integer, BigDecimal> refWeight,
			Map<Integer, BigDecimal> storeTrendFactors) {
		Map<Integer, BigDecimal> res = new HashMap<>();

		for (Map.Entry<Integer, BigDecimal> entry : potentialRefA55.entrySet()) {
			int index = entry.getKey();
			// Công thức đúng nhưng bị hardcode
			// hardcode vì đang dùng code cứng cho giá trị 55 và 57
			// thay vì dùng 55 thì phải là entry.getKey()
			// còn 57 ko biết code sao là vì e phải gộp 2 danh sách lại với nhau xong duyệt 1 lần
			BigDecimal newCampaign = ((entry.getValue().multiply(refWeight.get(55)))
					.add(potentialRefA77.get(index).multiply(refWeight.get(77)))
					.divide(refWeight.get(55).add(refWeight.get(77))).multiply(storeTrendFactors.get(index)));

			res.put(index, newCampaign);
		}

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
        
        // chỗ này đang lỗi vì em chưa set số chữ số thập phân cũng như rounding mode cho nó
        // thêm như phần a sửa là được
        sumUpDemmand.entrySet().forEach(WH -> result.put(WH.getKey(), WH.getValue().divide(temp, RoundingMode.HALF_UP)));
        return result;
    }
	
	public static Map<Integer, BigDecimal> sumUpDemandToWHLevel(Map<Integer, BigDecimal> demandStore, List<Store> storesOfRefItem) {
	    return storesOfRefItem.stream()
	            .collect(Collectors.groupingBy(Store::getWhId, Collectors.reducing(BigDecimal.ZERO, store -> demandStore.getOrDefault(store.getStoreId(), BigDecimal.ZERO), BigDecimal::add)));
	}
}