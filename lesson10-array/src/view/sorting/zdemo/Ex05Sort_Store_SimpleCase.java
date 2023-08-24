package view.sorting.zdemo;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.Comparator.*;

import bean.Store;

public class Ex05Sort_Store_SimpleCase {

	public static void main(String[] args) {

		Store[] stores = mockData();

		System.out.println("stores --> " + Arrays.toString(stores));

		/*
		 * new Comparator<Store>() {
		 * 
		 * @Override public int compare(Store s1, Store s2) { // sorting amountOfItems
		 * ASC return s1.getAmountOfItems().compareTo(s2.getAmountOfItems()); } }
		 * 
		 * --> (s1, s2) -> s1.getAmountOfItems().compareTo(s2.getAmountOfItems())
		 * 
		 * keyExtractor = s -> s.getAmountOfItems()
		 * 
		 * public static <T, U extends Comparable<? super U>> Comparator<T> comparing(
		 * Function<? super T, ? extends U> keyExtractor) { return (Comparator<T> &
		 * Serializable) (s1, s2) ->
		 * s1.getAmountOfItems().compareTo(s2.getAmountOfItems()); }
		 * 
		 * Comparator.comparing(s -> s.getAmountOfItems()) ==> (s1, s2) ->
		 * s1.getAmountOfItems().compareTo(s2.getAmountOfItems())
		 * 
		 */

		// sorting amountOfItems ASC
		Arrays.sort(stores, nullsFirst(comparing(s -> s.getAmountOfItems())));

		System.out.println("\n\nstores sorting amountOfItems ASC --> " + Arrays.toString(stores));

		// sorting amountOfItems ASC, storeId ASC
		Arrays.sort(stores, comparing((Store s) -> s.getAmountOfItems()).thenComparing(s -> s.getId()));
		System.out.println("\n\nsorting amountOfItems ASC, storeId ASC --> " + Arrays.toString(stores));

		// sorting amountOfItems DESC, storeId ASC
		Arrays.sort(stores, comparing((Store s) -> s.getAmountOfItems(), reverseOrder()).thenComparing(s -> s.getId()));
		System.out.println("\n\nsorting amountOfItems DESC, storeId ASC --> " + Arrays.toString(stores));

		// sorting amountOfItems DESC, storeId DESC
		Arrays.sort(stores, comparing((Store s) -> s.getAmountOfItems(), reverseOrder()).thenComparing(s -> s.getId(),
				reverseOrder()));
		System.out.println("\n\nsorting amountOfItems DESC, storeId DESC --> " + Arrays.toString(stores));

		System.out.println("\n ============ HANDLE NULL VALUES =========== \n");

		// null first, null last
		stores[0] = null;
		stores[1] = null;
		stores[5] = null;
		stores[stores.length - 1] = null;

		// sorting countryId ASC
		Arrays.sort(stores, nullsLast(comparing(Store::getCountryId))); // method reference
		System.out.println("sorting countryId ASC --> " + Arrays.toString(stores));

		// restriction
		// nullFirst, nullLast --> process for null object
		// throw exception if null value for attributes

		// 3x3
		// zero: row = 1; column = 1
		int[][] matrix = { { 1, 2, 3, 5 }, { 4, 0, 6, 9 }, { 7, 8, 9, 2 } };

		System.out.println("\n");

		int rowLength = matrix.length;
		int colLength = matrix[0].length;
		int rowZ = 1;
		int colZ = 1;

		System.out.println("rowLength --> " + rowLength);
		System.out.println("colLength --> " + colLength);

		// zero for row
		for (int rowI = 0; rowI < rowLength; rowI++) {
			if (rowI == rowZ) {
				for (int colI = 0; colI < colLength; colI++) {
					matrix[rowI][colI] = 0;
				}
				break;
			}
		}

		// zero for col
		for (int rowI = 0; rowI < rowLength; rowI++) {
			for (int colI = 0; colI < colLength; colI++) {
				if (colI == colZ) {
					matrix[rowI][colI] = 0;
				}
			}
		}

		for (int i = 0; i < rowLength; i++) {
			for (int j = 0; j < colLength; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static Store[] mockData() {
		return new Store[] { new Store(101, "Store 101", 220L, 77), new Store(102, "Store 102", 180L, 77),
				new Store(103, "Store 103", 202L, 77), new Store(501, "Store 501", 281L, 88),
				new Store(504, "Store 504", 723L, 88), new Store(502, "Store 502", 912L, 88),
				new Store(503, "Store 503", 190L, 88), new Store(401, "Store 401", 180L, 44),
				new Store(402, "Store 402", 888L, 44), new Store(403, "Store 403", 723L, 44),
				new Store(404, "Store 404", 220L, 44), };
	}
}