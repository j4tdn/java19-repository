package utils;

public class ArrayUtils {
	private ArrayUtils() {
		
	}
	public static boolean isDuplicate(int[] array, int value) {
		if(array == null) return false;
		for(int number : array) {
			if(number == value) return true;
		}
		return false;
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
}
