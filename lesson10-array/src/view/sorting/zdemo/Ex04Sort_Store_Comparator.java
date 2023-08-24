package view.sorting.zdemo;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;

import bean.Store;

public class Ex04Sort_Store_Comparator {
	
	public static void main(String[] args) {
		
		System.out.println("big decimal equals --> " + BigDecimal.valueOf(5).equals(BigDecimal.valueOf(5.0)));
		System.out.println("big decimal compare --> " + (BigDecimal.valueOf(5).compareTo(BigDecimal.valueOf(5.0)) == 0));
		
		System.out.println("\n\n");
		
		Store[] stores = mockData();
		
		System.out.println("stores --> " + Arrays.toString(stores));
		
		// Arrays.sort(T[] a, Comparator<T> c)
		// a, T no need to implements Comparable
		//      if implements Comparable, won't use --> use strateger/criteria from Comparator for sorting
		
		Arrays.sort(stores, new Comparator<Store>() {

			@Override
			public int compare(Store s1, Store s2) {
				// sorting amountOfItems ASC
				return s1.getAmountOfItems().compareTo(s2.getAmountOfItems());
			}
		});
		
		System.out.println("\n\nstores sorting amountOfItems ASC --> " + Arrays.toString(stores));
		
		Arrays.sort(stores, new Comparator<Store>() {

			@Override
			public int compare(Store s1, Store s2) {
				// sorting amountOfItems ASC, storeId ASC
				if (!s1.getAmountOfItems().equals(s2.getAmountOfItems())) {
					return s1.getAmountOfItems().compareTo(s2.getAmountOfItems()); 
				}
				return s1.getId().compareTo(s2.getId());
			}
		});
		
		System.out.println("\n\nsorting amountOfItems ASC, storeId ASC --> " + Arrays.toString(stores));
	}
	
	private static Store[] mockData() {
		return new Store[] {
			new Store(101, "Store 101", 220L, 77),
			new Store(102, "Store 102", 180L, 77),
			new Store(103, "Store 103", 202L, 77),
			new Store(501, "Store 501", 888L, 88),
			new Store(504, "Store 504", 723L, 88),
			new Store(502, "Store 502", 912L, 88),
			new Store(503, "Store 503", 120L, 88),
			new Store(401, "Store 401", 180L, 44),
			new Store(402, "Store 402", 888L, 44),
			new Store(403, "Store 403", 723L, 44),
			new Store(404, "Store 404", 220L, 44),
		};
	}
}