package view;

import static java.math.BigDecimal.valueOf;
import static utils.StoreUtils.total;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import bean.Store;
import model.DataModel;

/**
 * Do Allocation.
 *
 * return map of -> Key: storeId with Long type
 *               -> Value: storeAllocatedAmount after calculation with 4 steps
 *
 * @return map of storeId, storeAllocatedAmount
 */

public class AllocatedStoreApp {
	
	private static final Integer allocationAmount = 300;
	
	public static void main(String[] args) {
		final Integer whAllocationAmount = 300;
		// Step 1: Input
		List<Store> stores = DataModel.mockStores();

		// Step 2: Do calculation
		Map<Long, Integer> storeAllocatedAmounts = doAllocation(whAllocationAmount, stores);

		// Step 4: Print out result
		storeAllocatedAmounts.entrySet().stream().forEach(System.out::println);
	}
	
	
	
	private static Map<Long, Integer> doAllocation(Integer whAllocationAmount, List<Store> stores) {
        Map<Long, Integer> fixedAllocatedAmountMap = new HashMap<>();

        // Step 1: Filling in missing expected sales
      		fillingMissingExpectedSales(stores);
        
        // Step 2: Calculate Allocation Key
      		Map<Store, BigDecimal> keyAllocatedMap = keyAllocated(stores);
      		keyAllocatedMap.entrySet().stream().forEach(System.out::println);
      		
        // Step 3: Calculate Allocated Amount

        // Step 4: Fix rounding issue

        return fixedAllocatedAmountMap;
    }
	
	public static Map<Long, Integer> amountAllocated(Map<Store, BigDecimal> storesKeyMap) {
		List<Store> stores = storesKeyMap.entrySet().stream()
							   .map(Entry::getKey)
							   .collect(Collectors.toList());
		
		Long amountAllocatedTotal = 0L;
		
		Map<Long, Integer> amountAllocatedMap = new HashMap<>();
		BigDecimal stockPreviousTotal = total(stores,Store::isSelected,Store::getStockPreviousDay);
		
		for(Entry<Store,BigDecimal> entry:storesKeyMap.entrySet()) {
			Long amountAllocated = 0L;
			BigDecimal stockPreviousDay = entry.getKey().getStockPreviousDay() ;
			amountAllocated = (long) entry.getValue()
									.multiply(new BigDecimal(allocationAmount + stockPreviousTotal.intValue()))
									.subtract(stockPreviousDay).setScale(0, RoundingMode.HALF_UP)
									.longValue();
			
			amountAllocated = amountAllocated < 0 ? 0 : amountAllocated;
			amountAllocatedTotal+=amountAllocated;
			
			if(amountAllocatedTotal.intValue()==allocationAmount) {
				amountAllocatedMap.put(amountAllocated, entry.getKey().getStoreId().intValue());
			} else {
				
			}
		}
		
		return amountAllocatedMap;
	}
	
	
	public static Map<Store, BigDecimal> keyAllocated(List<Store> stores) {
		Map<Store, BigDecimal> keyAllocatedMap = new HashMap<>();

		stores.forEach(store -> {
			BigDecimal keyAllocatedValue = store.getExpectedSales()
												.divide(total(stores,Store::isSelected,Store::getExpectedSales)
																	 , 10, RoundingMode.HALF_UP);
			keyAllocatedMap.put(store, keyAllocatedValue);
		});
		
		return keyAllocatedMap;
	}
	
	
	
	public static void fillingMissingExpectedSales(List<Store> stores) {
		
		List<Store> missingExpectedSales = stores.stream()
				.filter(store -> store.getExpectedSales() == null)
				.collect(Collectors.toList());
		
		BigDecimal totalExpectedSales  = stores.stream()
										.filter(store -> store.getExpectedSales() != null)
										.map(Store::getExpectedSales)
										.reduce(BigDecimal.ZERO, BigDecimal::add);
		BigDecimal averageExpectedSales = totalExpectedSales
											.divide(valueOf(stores.size()-missingExpectedSales.size()), 1, RoundingMode.HALF_UP);
		
		
		missingExpectedSales.stream().filter(Store::isSelected).forEach(s -> {
			s.setExpectedSales(s.getReferenceStoreId() != 0 
					? stores.stream()
							.filter(rs -> rs.getStoreId() == s.getReferenceStoreId())
							.filter(rs -> !missingExpectedSales.contains(rs))
							.findFirst()
							.map(Store::getExpectedSales)
							.orElse(averageExpectedSales)
							
					: averageExpectedSales

			);
		});
	}
	
	
	
	
}
