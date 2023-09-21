package view;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


import model.DataModel;
import bean.Store;

public class DeliveryApp {
	
	public static void main(String[] args) {
		
		//Step1:
		List<Store> lsa55 = DataModel.mockStoresOfRefItemA55();
		List<Store> lsa77 = DataModel.mockStoresOfRefItemA77();
		Map<Integer, Integer> mapRefStores = DataModel.mockRefStores();
		Map<Integer, BigDecimal> mapRefweights = DataModel.mockRefWeights();
		Map<Integer, BigDecimal> mapStoreTrendFactors = DataModel.mockStoreTrendFactors();
	
		System.err.println("Enter planning amount:");
		Scanner ip = new Scanner(System.in);
		int planningAmount = ip.nextInt();
		if (planningAmount <= 100) {
		  System.out.println("Stop calculation");
		  return;
		}
		else {
		  System.out.println("Continue to step 2");
		}
		
		//Step2:
		
		fillEmptyPotentials(lsa77,mapRefStores);
		System.out.println("Store after filled:");
		System.out.println(lsa77);
		
		//Step3:
		 for (Store store : lsa55) {
	            BigDecimal demand = calculateDemand(store, lsa55, mapRefweights, mapStoreTrendFactors);
	            System.out.println("Demand for Store " + store.getStoreId() + ": " + demand);
	        }

	        for (Store store : lsa77) {
	            BigDecimal demand = calculateDemand(store, lsa77, mapRefweights, mapStoreTrendFactors);
	            System.out.println("Demand for Store " + store.getStoreId() + ": " + demand);
	        }
	        
	     //step4:
	
    }

	public static BigDecimal calculateAvgPotential(List<Store> stores) {
		  BigDecimal sum = BigDecimal.ZERO;
		  int count = 0;

		  for (Store store : stores) {
		    if (store.getStorePotential() != null) {
		      sum = sum.add(store.getStorePotential());
		      count++;
		    }
		  }

		  return sum.divide(new BigDecimal(count), 2, RoundingMode.HALF_UP); 
		}
	public static void fillEmptyPotentials(List<Store> stores,Map<Integer, Integer> maps) {
		  for (Store store : stores) {
			  
		    if (store.getStorePotential().compareTo(BigDecimal.ZERO)==0) {
		    	Integer refStoreId =store.getStoreId();
		    	 // Có ref store
		    	Store refStore = getRefStoreById(refStoreId,stores,maps);
		        store.setStorePotential(refStore.getStorePotential());
		      }
		     else {
		        // Không có ref store
		        BigDecimal avgPotential = calculateAvgPotential(stores);
		        store.setStorePotential(avgPotential);
		      }
		      
		    }

		  }
	
	public static Store getRefStoreById(Integer id, List<Store> stores, Map<Integer, Integer> maps) {
			Store resutl  = new Store();
			Integer refId = null;
			List<Entry<Integer, Integer>> entries = new ArrayList<>();

	        for (Entry<Integer, Integer> entry : maps.entrySet()) {
	            entries.add(entry);
	        }

	        for (Entry<Integer, Integer> entry : entries) {
	            Integer key = entry.getKey();
	            Integer value = entry.getValue();
	            
	      }
	        for (Entry<Integer, Integer> entry : entries) {
	        	if(entry.getKey()==id) {
	        		refId=entry.getValue();
	        	}
	        }
		  // Lấy từ danh sách stores
		  for(Store store : stores) {
			  if(store.getStoreId()==refId)
				  resutl=store;
		  }
		  return resutl;

		}

		public static BigDecimal calculateDemand(Store store, List<Store> refStores,
				Map<Integer, BigDecimal> refWeights, Map<Integer, BigDecimal> storeTrendFactors) {
			BigDecimal potentialRefSum = BigDecimal.ZERO;
			BigDecimal weightSum = BigDecimal.ZERO;

			for (Store refStore : refStores) {
				BigDecimal potential = refStore.getStorePotential();
				BigDecimal weight = refWeights.get(refStore.getItem().getItemId());

				if (potential != null && weight != null) {
					potentialRefSum = potentialRefSum.add(potential.multiply(weight));
					weightSum = weightSum.add(weight);
				}
			}

			BigDecimal demand;
			if (weightSum.compareTo(BigDecimal.ZERO) != 0) {
				demand = potentialRefSum.divide(weightSum, BigDecimal.ROUND_HALF_UP);
			} else {
				demand = BigDecimal.ZERO;
			}

			demand = demand.multiply(storeTrendFactors.get(store.getStoreId()));

			return demand;
		}
	}
		

