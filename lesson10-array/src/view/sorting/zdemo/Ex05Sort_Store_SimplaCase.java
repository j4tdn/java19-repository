package view.sorting.zdemo;

import java.util.Arrays;
import java.util.Comparator;
import static java.util.Comparator.*;

import bean.Store;

public class Ex05Sort_Store_SimplaCase {
	public static void main(String[] args) {
		Store[] stores = mockData();

		System.out.println("Origin Stores --> " + Arrays.toString(stores));

		/*
		 * Comparator.comparing(new Function<Store, Long>() {
		 * 
		 * @Override public Long apply(Store s) { return s.getAmountOfItem(); }
		 * 
		 * })
		 */

		// sorting amountOfItems ASC
		Arrays.sort(stores, comparing(s -> s.getAmountOfItem()));

		System.out.println("Sorted Stores amountOfItems ASC--> " + Arrays.toString(stores));

		// sorting amountOfItems ASC; storeId ASC
		Arrays.sort(stores, comparing((Store s) -> s.getAmountOfItem()).thenComparing((Store s) -> s.getId()));
		System.out.println("Sorted Stores amountOfItems ASC | storeId ASC --> \n" + Arrays.toString(stores));

		// sorting amountOfItems DESC; storeId ASC
		Arrays.sort(stores,
				comparing((Store s) -> s.getAmountOfItem(), reverseOrder()).thenComparing((Store s) -> s.getId()));
		System.out.println("Sorted Stores amountOfItems DESC | storeId ASC --> \n" + Arrays.toString(stores));

		// sorting amountOfItems DESC; storeId DESC
		Arrays.sort(stores, comparing((Store s) -> s.getAmountOfItem(), reverseOrder())
				.thenComparing((Store s) -> s.getId(), reverseOrder()));
		System.out.println("Sorted Stores amountOfItems DESC | storeId DESC --> \n" + Arrays.toString(stores));

		System.out.println("\n==============HANDLE NULL VALUES==============\n");
		// null first, null last
		stores[0] = null;
		stores[1] = null;
		stores[5] = null;
		stores[stores.length - 1] = null;
		// sorting countryId ASC
		Arrays.sort(stores, nullsFirst(comparing(Store::getCountryId))); // method reference
		System.out.println("\n\nsorting countryId ASC --> " + Arrays.toString(stores));
		
		// restriction
		// nullsFirst, nullsLast --> process for null object
		// throws exception if null value for attributes
	}

	private static Store[] mockData() {
		return new Store[] { new Store(101, "Store 101", 220L, 77), new Store(102, "Store 102", 180L, 77),
				new Store(103, "Store 103", 202L, 77), new Store(501, "Store 501", 888L, 88),
				new Store(504, "Store 504", 723L, 88), new Store(502, "Store 502", 912L, 88),
				new Store(503, "Store 503", 120L, 88), new Store(401, "Store 401", 180L, 44),
				new Store(402, "Store 402", 888L, 44), new Store(403, "Store 403", 723L, 44),
				new Store(404, "Store 404", 220L, 44) };
	}

}
