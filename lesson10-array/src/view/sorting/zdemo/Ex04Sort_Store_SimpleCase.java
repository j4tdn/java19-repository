package view.sorting.zdemo;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

import static java.util.Comparator.*;
import java.util.Objects;
import java.util.function.Function;

import bean.Store;

public class Ex04Sort_Store_SimpleCase {

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
		
		/*
		 * keyExtractor == s -> s.getAmountOfItems()
		 * public static <T, U extends Comparable<? super U>> Comparator<T> comparing(
		 * Function<? super T, ? extends U> keyExtractor) {
		 * Objects.requireNonNull(keyExtractor); return (Comparator<T> & Serializable)
		 * (c1, c2) -> keyExtractor.apply(c1).compareTo(keyExtractor.apply(c2)); }
		 
		 Comparator.comparing(s -> s.getAmountOfItems() == (s1, s2) -> s1.getAmountOfItems().compareTo(s2.getAmountOfItems());
		 */
		Arrays.sort(stores, comparing(s -> s.getName()));
		System.out.println("Store Sort Name : " + Arrays.toString(stores));
		
		//sorting amountOfItems ASC, storeId ASC
		Arrays.sort(stores, comparing((Store s) -> s.getAmountOfItems()).thenComparing(s -> s.getId()));
		
		//sorting amountOfItems DESC, storeId ASC
		Arrays.sort(stores, comparing((Store s) -> s.getAmountOfItems(), reverseOrder()).thenComparing(s -> s.getId()));
		
		//sorting amountOfItems DESC, storeId DESC
		Arrays.sort(stores, comparing((Store s) -> s.getAmountOfItems(), reverseOrder()).thenComparing(s -> s.getId(), reverseOrder()));
	
		//null first, null last
		stores[0] = null;
		stores[5] = null;
		stores[stores.length - 1] = null;
		
		
//		Arrays.sort(stores, comparing(Store::getAmountOfItems));//statge partter --> lamda --> method reference
		Arrays.sort(stores, nullsFirst(comparing(Store::getAmountOfItems)));
		System.out.println("Store Sort Null : " + Arrays.toString(stores));
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
