package utils;

public class ArrayUtils {
	private ArrayUtils() {
		
	}
	
	public static int[] copyOf(int[] origin, int newLength) {
		int[] newArray = new int[newLength];
		for(int i = 0; i < origin.length; i++) {
			newArray[i] = origin[i];
		}
		return newArray;
	}
	public static void shiftLeft(int[] origin, int pos) {
		for(int i = pos; i < origin.length - 1; i++) {
			origin[i] = origin[i+1];
		}
	}
	
	public static void shiftRight(int[] origin, int pos) {
		for(int i = origin.length - 1; i > pos; i--) {
			origin[i] = origin[i-1];
		}
	}
	
	public static void swap(int[] array, int i, int j) {
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}
	public static void swap(String[] array, int i, int j) {
		String tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}
	public static void swap(Object[] array, int i, int j) {
		Object tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}
	public static void printf(Object[] objects) {
		for(Object object: objects) {
			System.out.println(object.toString());
		}
	}
}
