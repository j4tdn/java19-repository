package view.sorting.zdemo;

import java.util.Arrays;

import bean.Store;

public class Ex03Sort_Store {
	public static void main(String[] args) {
		Store[] stores = mockData();

		System.out.println("Origin Stores --> " + Arrays.toString(stores));


		// sort object[] type - Arrays.sort(Object[] objects) --> support ASC(default) only
		// sort(Object[] a)
		//--> if (((Comparable) a[runHi++]).compareTo(a[lo]) <> 0)
		// required: a, each element must be a Comparable or implements from Comparable
		// else : throw exception
		// why do we need Comparable here
		// --> using/implement Comparable to have compareTo to know sorting asc/desc by which attribues in cla
	
		
		//restriction
		// list of stores are always sort with one criteria ONLY
		// cannot sort stores asc/desc by property a, b, c,...
		
		
		Arrays.sort(stores);

		// TODO: handle with sorting DESC

		System.out.println("Sorted Stores --> " + Arrays.toString(stores));
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
