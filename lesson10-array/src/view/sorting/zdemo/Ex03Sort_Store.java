package view.sorting.zdemo;

import java.util.Arrays;

import bean.Store;

public class Ex03Sort_Store {
	public static void main(String[] args) {
		Store[] stores = mockData();
		System.out.println("stores --> " + Arrays.toString(stores));		
		Arrays.sort(stores);
		System.out.println("stores sorted --> " + Arrays.toString(stores));
		
	}

	public static Store[] mockData() {
		return new Store[] { new Store(101, "Store 101", 220L, 77), new Store(102, "Store 102", 180L, 77),
				new Store(103, "Store 103", 202L, 77),
				new Store(501, "Store 501", 888L, 88),
				new Store(504, "Store 504", 723L, 88), 
				new Store(502, "Store 503", 912L, 88),
				new Store(503, "Store 502", 120L, 88), 
				new Store(401, "Store 401", 180L, 44),
				new Store(402, "Store 402", 888L, 44),
				new Store(403, "Store 403", 723L, 44),
				new Store(404, "Store 404", 220L, 44), 
			};
	}

}
