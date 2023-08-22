package view.sorting;

import java.util.Arrays;

import Utils.ArrayUtils;

public class Ex06InsertionSort {
public static void main(String[] args) {
	int[] numbers = {4, 3, 2, 10, 12, 1, 5, 6 };
	System.out.println("number -> " + Arrays.toString(numbers));
	insertionSort(numbers);
	System.out.println("number sorted -> " + Arrays.toString(numbers));
}
private static void insertionSort(int[] numbers) {
	for(int i = 1; i < numbers.length; i++) {
		for(int j = 0; j < i; j++) {
			if(numbers[j] > numbers[i]) {
				ArrayUtils.swap(numbers, i, j);
			}
		}
		System.out.println("After round " + i + "-> " +Arrays.toString(numbers) );
	}
}
}
