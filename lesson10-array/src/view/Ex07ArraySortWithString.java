package view;

import java.util.Arrays;
import java.util.Comparator;
import static java.util.Comparator.*;
import java.util.function.Function;

public class Ex07ArraySortWithString {

	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
		String[] sequences = {"a", "c", "b", "z","k","e",};
		
		Arrays.sort(sequences);
		System.out.println("1st array sort:" +Arrays.toString(sequences));
		
		Arrays.sort(sequences, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
			
		});
		
		System.out.println("2st array sort:" +Arrays.toString(sequences));
		
		sequences = new String[]{"a", null, "c", "b", "z", null, "k","e",};
		Arrays.sort(sequences, nullsLast(comparing(Function.identity(), reverseOrder())));
		System.out.println("3st array sort:" +Arrays.toString(sequences));

	}

}
