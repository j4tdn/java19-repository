package view.sorting.zdemo;

import java.util.Arrays;
import java.util.Comparator;

import bean.Store;

public class Ex03Sort_Store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store[] stores = mockData();
		
		System.out.println("Store : " + Arrays.toString(stores));

		Arrays.sort(stores);
		System.out.println("Store Sort : " + Arrays.toString(stores));
		
		Arrays.sort(stores, new Comparator<Store>() {

			@Override
			public int compare(Store o1, Store o2) {
				//sort amountOfItems ASC, storeId ASC
				if(!o1.getAmountOfItems().equals(o2.getAmountOfItems())) {
					return o1.getAmountOfItems().compareTo(o2.getAmountOfItems());
				}
				return o1.getId().compareTo(o2.getId());
			}
		});;
		System.out.println("Store Sort : " + Arrays.toString(stores));
		
	}
	
	private static Store[] mockData() {
		return new Store[] {
				new Store(101, "Store 101", 201L, 11),
				new Store(104, "Store 103", 203L, 13),
				new Store(102, "Store 104", 204L, 14),
				new Store(101, "Store 102", 202L, 12),
				new Store(103, "Store 101", 201L, 11),
				new Store(103, "Store 103", 203L, 13),
				new Store(104, "Store 104", 204L, 14),
				new Store(102, "Store 102", 202L, 12),
		};
	}

}
