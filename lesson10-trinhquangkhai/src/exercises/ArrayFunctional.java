package exercises;

public class ArrayFunctional {
	
public static void swap(Item[] arr, int i, int j) {
	Item temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
}
public static void swap(String[] arr, int i, int j) {
	String temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
}
public static void swapSpecial(String[] arr, int i, String j) {
	arr[i] = j;
	
}
}

