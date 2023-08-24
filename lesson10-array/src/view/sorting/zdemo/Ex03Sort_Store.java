package view.sorting.zdemo;

import java.util.Arrays;
import java.util.Comparator;

import bean.Store;

public class Ex03Sort_Store {
	public static void main(String[] args) {
		Store[] stores = mockData();
		System.out.println("sequences -->" + Arrays.toString(stores));
//		Arrays.sort(stores, new Comparator<Store>() {
//			@Override
//			public int compare(Store s1, Store s2) {
//				if (!s1.getAmountOfItems().equals(s2.getAmountOfItems())) {
//					return s1.getAmountOfItems().compareTo(s2.getAmountOfItems());
//				}
//				return s1.getStoreId().compareTo(s2.getStoreId());
//			}
//		});
		//sort AmountOfItems desc, StoreId ASC
		Arrays.sort(stores, Comparator.nullsLast(Comparator.comparing((Store s) -> s.getAmountOfItems(), Comparator.reverseOrder()).thenComparing(s -> s.getStoreId())));
		System.out.println("sequences Sorted ASC -->" + Arrays.toString(stores));
		// TODO: handle with sorting DESC
	}

	private static Store[] mockData() {
		return new Store[] { new Store(101, "Store 101", 220L, 77), new Store(102, "Store 102", 180L, 77),
				null,
				new Store(103, "Store 103", 202L, 77),
				new Store(501, "Store 501", 888L, 88),
				new Store(504, "Store 504", 723L, 88),
				null,
				new Store(502, "Store 503", 912L, 88),
				new Store(503, "Store 502", 120L, 88),
				new Store(401, "Store 401", 180L, 44),
				null,
				null,
				new Store(402, "Store 402", 888L, 44),
				new Store(403, "Store 403", 723L, 44),
				new Store(404, "Store 404", 220L, 44) };
	}
}
