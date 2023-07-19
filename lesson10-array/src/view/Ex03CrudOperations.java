package view;

import java.util.Arrays;

import utils.ArrayUtils;

// Create remove update delete
public class Ex03CrudOperations {
	public static void main(String[] args) {
		int[] origin = { 4, 9, 5, 36, 12, 33 };
		System.out.println("Origin Array: " + Arrays.toString(origin));

		System.out.println("\n==========Add=========\n");

		System.out.println("Add new element to index: 3 --> " + Arrays.toString((add(origin, 3, 11))));
		System.out.println("Add new element to index: 0 --> " + Arrays.toString((add(origin, 0, 11))));

		System.out.println("\n==========Remove=========\n");

		System.out.println("Remove element at index: 0 --> " + Arrays.toString((remove(origin, 0))));
		System.out.println("Remove element at index: 5 --> " + Arrays.toString((remove(origin, 5))));
	}

	private static int[] remove(int[] origin, int pos) {
		if (pos < 0 || pos > origin.length)
			throw new IllegalArgumentException("Position to remove is invalid! --> " + pos);
		int[] newArray = ArrayUtils.copyOf(origin, origin.length-1);
		ArrayUtils.shiftLeft(origin, pos);
		return newArray;
	}

	private static int[] add(int[] origin, int pos, int newValue) {
		if (pos < 0 || pos > origin.length)
			throw new IllegalArgumentException("Position to add is invalid! --> " + pos);
		int[] newArray = ArrayUtils.copyOf(origin, origin.length + 1);
		ArrayUtils.shiftRight(newArray, pos);
		newArray[pos] = newValue;
		return newArray;
	}
}
