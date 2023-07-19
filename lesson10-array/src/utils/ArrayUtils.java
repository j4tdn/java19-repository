package utils;

public class ArrayUtils {
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

	public static int[] coppyOf(int[] origin, int newLength) {
		int[] newArray = new int[newLength];
		for (int i = 0; i < origin.length; i++) {
			newArray[i] = origin[i];
		}
		return newArray;
	}

	public static void shiftLeft(int[] origin, int pos) {

		for (int i = pos; i < origin.length - 1; i++) {
			origin[i] = origin[i + 1];
		}
	}

	public static void shiftRight(int[] origin, int pos) {
		for (int i = origin.length - 1; i > pos; i--) {
			origin[i] = origin[i - 1];
		}
	}
}
