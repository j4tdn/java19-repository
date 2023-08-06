package view.sorting.theory;

import java.util.Arrays;

import utils.ArrayUtils;

interface IntComparator {
	boolean compare(int a, int b);
}

public class Ex01BubbleSort {
	public static void main(String[] args) {
		int[] numbers = { 1, 5, 11, 9, 4, 6 };
		System.out.println("origin Array --> " + Arrays.toString(numbers));
		
		bubbleSortASC(numbers);
		System.out.println("Sorted ASC Array --> " + Arrays.toString(numbers));
		
		bubbleSortDESC(numbers);
		System.out.println("Sorted DESC Array --> " + Arrays.toString(numbers));

		System.out.println("\n=======strategy========\n");

		bubbleSort(numbers, (i1, i2) -> i1 > i2);
		System.out.println("Sorted ASC Array --> " + Arrays.toString(numbers));
		
		bubbleSort(numbers, (i1, i2) -> i1 < i2);
		System.out.println("Sorted DESC Array --> " + Arrays.toString(numbers));
	}

	private static void bubbleSort(int[] numbers, IntComparator comparator) {
		// Ascending
		// Sau mỗi round sẽ tìm được 1 phần tử lớn nhất
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length - 1; j++) {
				if (comparator.compare(numbers[j], numbers[j+1])) {
					ArrayUtils.swap(numbers, j, j + 1);
				}
			}
		}
	}

	private static void bubbleSortASC(int[] numbers) {
		// Ascending
		// Sau mỗi round sẽ tìm được 1 phần tử lớn nhất
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length - 1; j++) {
				if (numbers[j] > numbers[j + 1]) {
					ArrayUtils.swap(numbers, j, j + 1);
				}
			}
		}
	}

	private static void bubbleSortDESC(int[] numbers) {
		// Ascending
		// Sau mỗi round sẽ tìm được 1 phần tử lớn nhất
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length - 1; j++) {
				if (numbers[j] < numbers[j + 1]) {
					ArrayUtils.swap(numbers, j, j + 1);
				}
			}
		}
	}

}
