package view.sorting;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex05SelectionSort {
	public static void main(String[] args) {

		int numbers[] = { 8, 5, 11, 9, 4, 6 };
		
		System.out.println("Origin Numbers: " + Arrays.toString(numbers));
		System.out.println("\n==============================================\n");
		
		
		selectionSort(numbers);
		
		System.out.println("\n==============================================\n");
		System.out.println("Sorted Numbers: " + Arrays.toString(numbers));

	}

	private static void selectionSort(int[] numbers) {
		for (int i = numbers.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (numbers[j] > numbers[i]) {
					ArrayUtils.swap(numbers, i, j);
				}
			}
			System.out.println("After round " + (numbers.length-i) + " --> " + Arrays.toString(numbers));
		}
	}
}
