package utils;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import bean.Store;
import model.DataModel;

public class StoreUtils {
	
	private StoreUtils() {
	}
	
	public static void main(String[] args) {
		List<Store> stores = DataModel.mockStores();
		System.out.println(total(stores,Store::isSelected,Store::getExpectedSales));
	}
	
	
	
	public static <T extends Number> BigDecimal total(List<Store> stores, Predicate<Store> predicate, Function<Store, T> mapping) {
					return 	stores	.stream()
							  		.filter(predicate)  
							  		.map(mapping)
							  		.map(num -> new BigDecimal(num.toString())) 
							  		.reduce(BigDecimal.ZERO, BigDecimal::add);
		}
	

}
