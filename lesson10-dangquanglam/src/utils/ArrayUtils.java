package utils;

public class ArrayUtils {
	private ArrayUtils() {

	}

	public static boolean checkDuplicate(int[] newArr, int value) {
		if (newArr == null)
			return false;
		for (int number : newArr) {
			if (number == value)
				return true;
		}
		return false;
	}
	
	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
