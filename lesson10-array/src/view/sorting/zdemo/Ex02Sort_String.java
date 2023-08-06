package view.sorting.zdemo;

import java.util.Arrays;

public class Ex02Sort_String {

	public static void main(String[] args) {

		String[] sequences = { "a", "z", "b", "f", "c", "k", "d" };

		System.out.println("Origin Sequences --> " + Arrays.toString(sequences));
		
		// Sort Object[] type - Arrays.sort(Object[] objects) --> support ASC(default) only
		
		//TODO: handle with sorting DESC
		Arrays.sort(sequences, (o1,o2) -> o2.compareTo(o1));
		System.out.println("Sorted Sequences --> " + Arrays.toString(sequences));
	}
}
