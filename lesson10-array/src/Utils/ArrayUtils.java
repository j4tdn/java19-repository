package Utils;

import bean.Item;

public class ArrayUtils {
	
	
public static void swap(int[] numbers, int i, int j) {
	int temp = numbers[i];
	numbers[i] = numbers[j];
	numbers[j] = temp;
}

public static void swap(String[] array, int i, int j) {
	String temp = array[i];
	array[i] = array[j];
	array[j] = temp;
}

public static void swap(Item[] item, int i, int j) {
	Item temp = item[i];
	item[i] = item[j];
	item[j] = temp;
}

public static void printf(String prefix, Item[] item) {
	System.out.println(prefix);
	for(Item items : item) {
		System.out.println(items);
	}
}
public static int[] coppyOf(int[] origin, int newLength) {
	int[] newArray = new int[newLength];
	for(int i = 0; i < origin.length;i++ ) {
		newArray[i] = origin[i];
	}
	return newArray;
}
public static void shiftLeft(int[] origin, int pos) {
	
	for(int i = pos; i < origin.length - 1; i++ ) {
		origin[i] = origin[i + 1];
	}
}
public static void shiftRight(int[] origin, int pos) {
	for(int i = origin.length - 1; i > pos; i-- ) {
		origin[i] = origin[i - 1];
	}	
}

}
