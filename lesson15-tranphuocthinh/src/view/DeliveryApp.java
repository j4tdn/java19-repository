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
		
//Step1
		
		List<Store> stores77 = DataModel.mockStoresOfRefItemA77();
		List<Store> stores55 = DataModel.mockStoresOfRefItemA55();
		Map<Integer, Integer> mapRefStores = DataModel.mockRefStores();
		Map<Integer, BigDecimal> mapRefweights = DataModel.mockRefWeights();
		Map<Integer, BigDecimal> mapStoreTrendFactors = DataModel.mockStoreTrendFactors();
	
		System.err.println("Enter planning amount:");
		Scanner ip = new Scanner(System.in);
		int planningAmount = ip.nextInt();
		if (planningAmount <= 100) {
		  System.out.println("Stop ");
		  return;
		}
		else {
		  System.out.println("Continue ");
		  // :(
		}
	}
}

		
       

 
		
	
