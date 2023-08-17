package utils;

import java.util.Arrays;

import bean.ItemDetail;

public class SortUntils {
	private SortUntils() {
		// TODO Auto-generated constructor stub
	}
	
	public static void sort(int[] elements, boolean isASC) {
		Arrays.sort(elements);
		if(!isASC) {
			reverse(elements);
		}
	}
	
	public static void reverse(int[] numbers) {
		for (int i = 0; i < numbers.length/2; i++) {
			int tmp = numbers[i];
			numbers[i] = numbers[numbers.length - i -1];
			numbers[numbers.length - i -1] = tmp;
		}
	}

	public static void swap(int[] source, int i, int j) {
		int tmp = source[i];
		source[i] = source[j];
		source[j] = tmp;
	}
	
	public static void swap(String[] source, int i, int j) {
		String tmp = source[i];
		source[i] = source[j];
		source[j] = tmp;
	}
	
	public static void swap(ItemDetail[] source, int i, int j) {
		ItemDetail tmp = source[i];
		source[i] = source[j];
		source[j] = tmp;
	}
}
