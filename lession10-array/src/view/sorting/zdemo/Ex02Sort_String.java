package view.sorting.zdemo;

import java.util.Arrays;

public class Ex02Sort_String {
	public static void main(String[] args) {
		String[] sequences = {"a","z","b","f","c","k","d"};
		
		System.out.println("sequences --> " + Arrays.toString(sequences));
		Arrays.sort(sequences,(s1,s2)->{
			return s2.compareTo(s1);
		});
		
		System.out.println("sequences --> " + Arrays.toString(sequences));
	}
}
