package view;

import static utils.StoreUtils.getStoreById;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import bean.Store;
import model.DataModel;
import utils.NumberUtils;

public class DeliveryApp {
	private static final Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {

		List<Store> refA55 = DataModel.mockStoresOfRefItemA55();
		List<Store> refA77 = DataModel.mockStoresOfRefItemA77();
		var trendFactors = DataModel.mockStoreTrendFactors();
		var refStores = DataModel.mockRefStores();
		var refWeights = DataModel.mockRefWeights();
		
		System.out.println(refA77);
		
//		int planningAmount = planningAmount();
//		
//		if(planningAmount == Integer.MIN_VALUE) {
//			System.exit(0);
//		} else {
//			fillingGapPotential(refA55, refStores);
//			fillingGapPotential(refA77, refStores);
//		}
		
		int planningAmount = 10;
		int minPerStore = 2;
		fillingGapPotential(refA55, refStores);
		fillingGapPotential(refA77, refStores);
		
		System.out.println("\n================ - calculateDemandStores - =================\n");
		Map<Integer,BigDecimal> demandMap = calculateDemandStores(refA55,refA77,trendFactors,refWeights);
		
		demandMap.entrySet().stream().forEach(System.out::println);
		
		System.out.println("\n================ - sumOfWhDemandLevel - =================\n");
		Map<Integer,BigDecimal> sumOfDemandWhLevel = sumOfWhDemandLevel(refA55,demandMap);		
		sumOfDemandWhLevel.entrySet().stream().forEach(System.out::println);
		
		System.out.println("\n================ - calculateShareOfWh - =================\n");
		Map<Integer,BigDecimal> calculateShareOfWh = calculateShareOfWh(sumOfDemandWhLevel);		
		calculateShareOfWh.entrySet().stream().forEach(System.out::println);
		
		System.out.println("\n================ - allocateByShares - =================\n");
		Map<Integer,BigDecimal> allocateByShares = allocateByShares(sumOfDemandWhLevel,planningAmount);		
		allocateByShares.entrySet().stream().forEach(System.out::println);
		boolean isApplyMin = false;
		for (int i = 1; i <= allocateByShares.size(); i++) {
			if(allocateByShares.get(i).compareTo(BigDecimal.valueOf(minPerStore))<0) {
				allocateByShares.put(i, BigDecimal.ZERO);
				isApplyMin = true;
			} 
		}
		
		System.out.println("\n================ - Apply minPerStore - =================\n");
		Map<Integer,BigDecimal> applyMinimum = applyMinimum(allocateByShares,minPerStore);		
		applyMinimum.entrySet().stream().forEach(System.out::println);
		
		if(isApplyMin) {
			System.out.println("\n================ -Recalculate Share - =================\n");
			Map<Integer,BigDecimal> recalculateShare = allocateByShares(allocateByShares,planningAmount);		
			recalculateShare.entrySet().stream().forEach(System.out::println);
		}

		
	
	}
	
	private static Map<Integer, BigDecimal> applyMinimum(Map<Integer,BigDecimal> allocateByShares, Integer minPerStore) {
		for (int i = 1; i <= allocateByShares.size(); i++) {
			if(allocateByShares.get(i).compareTo(BigDecimal.valueOf(minPerStore))<0) {
				allocateByShares.put(i, BigDecimal.valueOf(minPerStore));
			} 
		}
		return allocateByShares;
	}
	
	private static Map<Integer, BigDecimal> allocateByShares(Map<Integer,BigDecimal> sumOfDemandWhLevel,
			Integer planningAmount) {
		Map<Integer, BigDecimal> allocateByShares = new LinkedHashMap<Integer, BigDecimal>();

		BigDecimal sumOfDemand = sumOfDemandWhLevel.entrySet().stream().map(entry -> entry.getValue())
				.reduce(BigDecimal::add).orElse(BigDecimal.ZERO);
		for (int i = 1; i <= sumOfDemandWhLevel.size(); i++) {
			BigDecimal shareWhAllocate = (sumOfDemandWhLevel.get(i).divide(sumOfDemand,10,RoundingMode.HALF_DOWN))
											.multiply(BigDecimal.valueOf(planningAmount));
			allocateByShares.put(i, shareWhAllocate);
		}
		return allocateByShares;
	}
	
	private static Map<Integer,BigDecimal> calculateShareOfWh(Map<Integer,BigDecimal> sumOfDemandWhLevel) {
		Map<Integer,BigDecimal> shareOfWhDemandLevel = new LinkedHashMap<Integer, BigDecimal>();
		
		BigDecimal sumOfDemand = sumOfDemandWhLevel.entrySet().stream().map(entry -> entry.getValue())
														.reduce(BigDecimal::add).orElse(BigDecimal.ZERO);
		
		for (int i = 1; i <= sumOfDemandWhLevel.size(); i++) {
			BigDecimal shareWhRate = (sumOfDemandWhLevel.get(i).multiply(BigDecimal.valueOf(100)).divide(sumOfDemand,2,RoundingMode.HALF_UP));
			shareOfWhDemandLevel.put(i, shareWhRate);
		}
		return shareOfWhDemandLevel;
	}
	
	
	private static Map<Integer,BigDecimal> sumOfWhDemandLevel(List<Store> stores,Map<Integer,BigDecimal> demandMap) {
		Map<Integer,BigDecimal> sumOfWhDemandLevel = new LinkedHashMap<Integer, BigDecimal>();
		
		BigDecimal sumOfDemandWh1 = BigDecimal.ZERO;
		BigDecimal sumOfDemandWh2 = BigDecimal.ZERO;
		BigDecimal sumOfDemandWh3 = BigDecimal.ZERO;
		
		for(Store store:stores) {
			if (store.getWhId() == 1) {
				sumOfDemandWh1 = sumOfDemandWh1.add(demandMap.get(store.getStoreId()));
			} else  if(store.getWhId() == 2) {
				sumOfDemandWh2 = sumOfDemandWh2.add(demandMap.get(store.getStoreId()));
			} else {
				sumOfDemandWh3 = sumOfDemandWh3.add(demandMap.get(store.getStoreId()));
			}
		}
		sumOfWhDemandLevel.put(1, sumOfDemandWh1);
		sumOfWhDemandLevel.put(2, sumOfDemandWh2);
		sumOfWhDemandLevel.put(3, sumOfDemandWh3);
		return sumOfWhDemandLevel;
	}
	
	
	private static Map<Integer, BigDecimal> calculateDemandStores(List<Store> stores55, List<Store> stores77,
									Map<Integer, BigDecimal> trendFactors,Map<Integer, BigDecimal> refWeights) {
		
		Map<Integer,BigDecimal> demandRes = new LinkedHashMap<>(14);
		for (int count = 1; count <= 14; count++) {
			BigDecimal store55Potential = stores55.get(count-1).getStorePotential();
			BigDecimal store77Potential = stores77.get(count-1).getStorePotential();
			BigDecimal demand = (store55Potential.multiply(refWeights.get(55))).add(store77Potential.multiply(refWeights.get(77)))
								.divide(refWeights.get(55).add(refWeights.get(77)))
								.multiply(trendFactors.get(count)).setScale(1, RoundingMode.HALF_UP);
			demandRes.put(count, demand);
		}

		return demandRes;
	}

	private static int planningAmount() {
		System.out.print("Enter Planning Amount Country: ");
		String amount = sc.nextLine();
		while(!NumberUtils.isValidIntegerNumber(amount)) {
			System.out.println("Planning Amount Country must be in int!");
			System.out.print("Enter again: ");
			amount = sc.nextLine();
		}
		int amountAsInt = Integer.parseInt(amount);
		
		return (amountAsInt <= 100) ? Integer.MIN_VALUE : amountAsInt;
	}
	
	private static int minimunPerStore() {
		System.out.print("Enter Minimum per store: ");
		String min = sc.nextLine();
		while(!NumberUtils.isValidIntegerNumber(min)) {
			System.out.println("Minimum per store must be in int!");
			System.out.print("Enter again: ");
			min = sc.nextLine();
		}
		return Integer.parseInt(min);
	}
	
	private static void fillingGapPotential(List<Store> stores, Map<Integer,Integer> refStores) {
		List<Store> missingPotentialStores = stores.stream().filter(s -> s.getStorePotential().compareTo(BigDecimal.ZERO)==0)
				.collect(Collectors.toList());

		List<Integer> missingPotentialIds = stores.stream().filter(s -> s.getStorePotential().compareTo(BigDecimal.ZERO)==0)
				.map(Store::getStoreId).collect(Collectors.toList());

		BigDecimal sumOfPotentials = stores.stream().filter(s -> s.getStorePotential().compareTo(BigDecimal.ZERO)>0).map(Store::getStorePotential)
											.reduce(BigDecimal::add).get();
		
		// For missing potential
		for (Store store : missingPotentialStores) {
			int currentStoreId = store.getStoreId();
			
		//	If the missing have ref and ref have its own value
			if (refStores.containsKey(currentStoreId) && !missingPotentialIds.contains(refStores.get(currentStoreId))) {
				store.setStorePotential(getStoreById(stores, refStores.get(currentStoreId)).getStorePotential());
			} else {
				store.setStorePotential(sumOfPotentials.divide(
						BigDecimal.valueOf((stores.size() - missingPotentialStores.size())), 1, RoundingMode.HALF_UP));
			}

		}
		
		for (Store store : stores) {
			store.setStorePotential(store.getStorePotential().setScale(1, RoundingMode.HALF_UP));
		}
		
	}
	
	

}