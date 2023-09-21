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
		
		if (planningAmount <= 10) {
			 System.out.println("Amount should be at least 11");
		}
		
		// Step 2: 
        Map<Integer, Integer> referenceStores = DataModel.mockRefStores(); 
        Map<Integer, BigDecimal> referenceWeights = DataModel.mockRefWeights(); 
        List<Store> stores = DataModel.mockStoresOfRefItemA55(); 

        // Iterate through stores and calculate potential, if not maintained
        for (Store store : stores) {
        	
            if (store.getStorePotential() != null) {
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
