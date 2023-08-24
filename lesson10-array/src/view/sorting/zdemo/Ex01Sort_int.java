package view.sorting.zdemo;

import java.util.Arrays;

public class Ex01Sort_int {
	public static void main(String[] args) {
		int[] numbers = {4, 1, 9, 2, 8, 15, 6};
		System.out.println("number --> " + Arrays.toString(numbers));
		
		Arrays.sort(numbers);
		System.out.println("number sorted ASC --> " + Arrays.toString(numbers));
		
	}
	
}
