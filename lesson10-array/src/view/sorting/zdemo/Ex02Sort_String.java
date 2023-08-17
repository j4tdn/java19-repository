package view.sorting.zdemo;

import java.util.Arrays;
import java.util.Comparator;

public class Ex02Sort_String {
	
	public static void main(String[] args) {
		
		String[] sequences = {"a", "z", "b", "f", "c", "k", "d"};
		
		System.out.println("sequences --> " + Arrays.toString(sequences));
		
		// sort object[] type - Arrays.sort(Object[] objects) --> support ASC(default) only
		// required: a, each element must be a Comparable or implements from Comparable
		// Arrays.sort(sequences);
		
		// TODO: handle with sorting DESC
		Arrays.sort(sequences, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				return s2.compareTo(s1);
			}
		});
		
		System.out.println("sequences sorted --> " + Arrays.toString(sequences));
	}
}
