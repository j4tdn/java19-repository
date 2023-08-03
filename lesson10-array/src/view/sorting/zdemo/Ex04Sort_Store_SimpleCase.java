package view.sorting.zdemo;

import java.util.Arrays;
import java.util.Comparator;
import static java.util.Comparator.*;

import bean.Store;

public class Ex04Sort_Store_SimpleCase {
	public static void main(String[] args) {
		Store[] stores = mockData();
		System.out.println("stores:" + Arrays.toString(stores));

//		new Comparator<Store>() {
//			
//			public int compare(Store s1, Store s2) {
//				// amountOfItems ASC
//				return s1.getAmountOfItems().compareTo(s2.getAmountOfItems());
//			}
//		}
		// amountOfItems ASC
		Arrays.sort(stores, comparing(s -> s.getAmountOfItems()));
		System.out.println("stores sorted amountOfItems ASC:\n" + Arrays.toString(stores));

		// amountOfItems ASC, storeId ASC
		Arrays.sort(stores, comparing((Store s) -> s.getAmountOfItems()).thenComparing(s -> s.getId()));
		System.out.println("stores sorted amountOfItems ASC, storeId ASC:\n" + Arrays.toString(stores));

		// amountOfItems DESC, storeId DESC
		Arrays.sort(stores, comparing((Store s) -> s.getAmountOfItems(), reverseOrder()).thenComparing(s -> s.getId(), reverseOrder()));
		System.out.println("stores sorted amountOfItems DESC, storeId DESC:\n" + Arrays.toString(stores));

	}

	public static Store[] mockData() {
		return new Store[] { new Store(101, "Store 101", 220L, 77), new Store(102, "Store 102", 180L, 77),
				new Store(103, "Store 103", 202L, 77), new Store(501, "Store 501", 888L, 88),
				new Store(504, "Store 504", 723L, 88), new Store(502, "Store 503", 912L, 88),
				new Store(503, "Store 502", 120L, 88), new Store(401, "Store 401", 180L, 44),
				new Store(402, "Store 402", 888L, 44), new Store(403, "Store 403", 723L, 44),
				new Store(404, "Store 404", 220L, 44), };
	}
}
