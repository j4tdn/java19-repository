package view;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import bean.Store;
import model.DataModel;

public class DeliveryApp {

	public static BigDecimal main(String[] args) {

		// Step 1:
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your planning amount:");
		int planningAmount = scanner.nextInt();

		System.out.print("The planning amount is: " + planningAmount);

		scanner.close();

		// Trong đề a đang yêu cầu min là 100 Thư ơi
		// if planning amount <= 100, stop calculation else continute with step 2
		// Còn cái 10 đó là a giải lập cho planning amount ban đầu

		if (planningAmount <= 10) {
			System.out.println("Amount should be at least 11");
			// Ví dụ e in ra lỗi là em nên dừng chương trình hoặc cho nhập lại hay sao đó
			// Chứ như này thì e in lỗi nó vẫn tiếp tục step 2 là ko hợp lệ
			// Có thể tại đây thêm chữ return ; hoặc System.exit(0)
		}

		// Step 2:
		Map<Integer, Integer> referenceStores = DataModel.mockRefStores();
		Map<Integer, BigDecimal> referenceWeights = DataModel.mockRefWeights();
		List<Store> stores = DataModel.mockStoresOfRefItemA55();

		// Iterate through stores and calculate potential, if not maintained
		for (Store store : stores) {
			if (store.getStorePotential() != null) {
				// Nếu store có potential thì ko làm gì mà chỉ rounding 1 chữ số thập phân thôi
				// e nha
				// Ko return ở đây được
				return store.getStorePotential();
			} else {
				Integer refStoreId = referenceStores.get(store.getStoreId());
				if (refStoreId != null) {
					BigDecimal totalPotential = calculatePotential(stores, refStoreId);
					store.setStorePotential(totalPotential);
				} else {
					BigDecimal avgPotential = calculateAveragePotential(stores);
					store.setStorePotential(avgPotential);
				}
			}
		}

		// step 3
		/*
		 
		 Thư chưa thật sự hiểu bài à em ?
		 
		 */

	}

	public BigDecimal calculatePotential(List<Store> stores, Store currentStore) {
	    if (currentStore.getStorePotential() != null) {
	        return currentStore.getStorePotential();
	    }
	    else if (currentStore. != null && currentStore.getReferenceStore().getPotential() != null) {
	        return currentStore.getReferenceStore().getPotential();
	    }
	    else {
	        double sum = 0.0;
	        int count = 0;
	        for (Store store : stores) {
	            if (store.getStorePotential() != null) {
	                sum += store.getStorePotential();
	                count++;
	            }
	        }
	        return sum / count;
	    }
	}

}
