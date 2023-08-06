package view.sorting.zdemo;

import java.util.Arrays;
import java.util.Comparator;

import bean.Store;

public class Ex04Sort_Store_Comparator {
	public static void main(String[] args) {
		Store[] stores = mockData();

		System.out.println("Origin Stores --> " + Arrays.toString(stores));

		Arrays.sort(stores, new Comparator<Store>() {
			@Override
			public int compare(Store o1, Store o2) {
				return o1.getAmountOfItem().compareTo(o2.getAmountOfItem());
			}
		});

		
		// sorting amountOfItems ASC
		Arrays.sort(stores, new Comparator<Store>() {
			@Override
			public int compare(Store o1, Store o2) {
				return o1.getAmountOfItem().compareTo(o2.getAmountOfItem());
			}
		});
		System.out.println("Sorted Stores amountOfItems ASC--> " + Arrays.toString(stores));
		
		
		// sorting amountOfItems ASC; storeId ASC
		Arrays.sort(stores, new Comparator<Store>() {
			@Override
			public int compare(Store o1, Store o2) {
				if(!o1.getAmountOfItem().equals(o2.getAmountOfItem())) {
					return o1.getAmountOfItem().compareTo(o2.getAmountOfItem());
				}
				return o1.getId().compareTo(o2.getId());
			}
		});
		System.out.println("Sorted Stores amountOfItems ASC | amountOfItems ASC; storeId ASC --> \n" + Arrays.toString(stores));
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
