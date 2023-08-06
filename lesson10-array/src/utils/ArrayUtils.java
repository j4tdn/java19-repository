package utils;

import java.util.Arrays;

import bean.Item;

public class ArrayUtils {

	private ArrayUtils() {
	}
	
	public static void sort(int[] elements,boolean isAsc) {
		Arrays.sort(elements);
		
		if(!isAsc) {
			reverse(elements);
		}
	}
	
	public static void reverse(int[] origin) {
		for (int i = 0; i < origin.length / 2; i++) {
			int temp = origin[i];
			origin[i] = origin[origin.length - 1 - i];
			origin[origin.length - 1 - i] = temp;
		}
	}
	
	public static void printf(String prefix, Item[] items) {
		System.out.println(prefix + ":");
		for(Item item:items) {
			System.out.println(item);
		}
	}
	
	public static void swap(int[] numbers, int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}

	public static void swap(String[] sequences, int i, int j) {
		String temp = sequences[i];
		sequences[i] = sequences[j];
		sequences[j] = temp;
	}
	
	public static void swap(Item[] item, int i, int j) {
		Item temp = item[i];
		item[i] = item[j];
		item[j] = temp;
	}

	public static int[] copyOf(int[] origin, int newLength) {
		int[] newArray = new int[newLength];
		for (int i = 0; i < origin.length; i++) {
			newArray[i] = origin[i];
		}
		return newArray;
	}
	
	public static void shiftLeft(int[] origin,int pos) {
		for (int i = pos; i < origin.length-1; i++) {
			origin[i] = origin[i+1];
		}
	}

	public static void shiftRight(int[] origin,int pos) {
		for (int i = origin.length-1; i > pos; i--) {
			origin[i] = origin[i-1];
		}
	}
	
	
}
