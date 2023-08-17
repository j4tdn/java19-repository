package view.sorting.zdemo;

import java.util.Arrays;

import utils.SortUntils;

public class Ex01Sort_Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 8, 5, 11, 9, 4, 6 };
		
		System.out.println("numbers " + Arrays.toString(numbers));
		
		SortUntils.sort(numbers, true);
		
		System.out.println("numbers SORT ASC " + Arrays.toString(numbers));

	}

}
