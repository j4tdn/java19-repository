package view.sorting;

import java.util.Arrays;

public class Ex04Reverse {
	public static void main(String[] args) {
		int[] origin = { 1, 9, 5, 8, 36, 12, 33 };
		System.out.println("origin --> " + Arrays.toString(origin));

		reverse(origin);

		System.out.println("reverse --> " + Arrays.toString(origin));

	}

	private static void reverse(int[] origin) {
		for (int i = 0; i < origin.length / 2; i++) {
			int temp = origin[i];
			origin[i] = origin[origin.length - 1 - i];
			origin[origin.length - 1 - i] = temp;
		}
	}
}
