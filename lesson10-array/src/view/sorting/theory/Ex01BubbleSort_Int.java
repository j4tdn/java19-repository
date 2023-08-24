package view.sorting.theory;

import java.util.Arrays;

import functional.IntComparator;
import utils.ArrayUtils;

public class Ex01BubbleSort_Int {
	public static void main(String[] args) {
		int[] numbers = { 1, 5, 11, 9, 4, 6 };
		System.out.println("origin --> " + Arrays.toString(numbers));
		bubbleSort(numbers, (i1, i2) -> {
			return i1 > i2;
		});
		System.out.println("bubble sort --> " + Arrays.toString(numbers));
	}
	

	private static void bubbleSort(int[] numbers, IntComparator comparator) {
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers.length - i - 1; j++) {
				if(comparator.compare(numbers[j], numbers[j+1])) {
					ArrayUtils.swap(numbers, j, j+1);
				}
			}
		}
	}
}
