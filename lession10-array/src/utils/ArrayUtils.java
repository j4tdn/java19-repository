package utils;

import java.util.Arrays;

import bean.Item;

public class ArrayUtils {
	private ArrayUtils() {
		
	}
	
	public static void sort(int[] elements, boolean isASC) {
		Arrays.sort(elements);
		
		if(!isASC) {
			reverse(elements);
		}
	}
	
	public static void reverse(int[] origin) {
		for(int i=0;i< origin.length/2;i++) {
			int tmp = origin[i];
			origin[i]= origin[origin.length-i-1];
			origin[origin.length-i-1] = tmp;
		}
	}
	
	public static void printf(String prefix, Item[] items) {
		System.out.println(prefix);
		System.out.println("<--");
		for(Item item : items) {
			System.out.println(item);
		}
		System.out.println("-->");
	}
	
	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	public static void swap(String[] array, int i, int j) {
		String temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public static void swap(Item[] array, int i, int j) {
		Item temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public static int[] copyOf(int[] origin, int newLength) {
		int[] newArray = new int[newLength];
		for(int i=0; i< origin.length;i++) {
			newArray[i] = origin[i];
		}
		return newArray;
	}
	
	public static void shiftLeft(int[] origin, int pos) {
		for(int i = pos; i< origin.length - 1; i++) {
			origin[i] = origin[i+1]; 
		}
	}
	
	public static void shiftRight(int[] origin, int pos) {
		for(int i = origin.length-1; i > pos; i--) {
			origin[i] = origin[i-1]; 
		}
	}
}
