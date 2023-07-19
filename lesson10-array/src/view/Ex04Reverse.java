package view;

import java.util.Arrays;

public class Ex04Reverse {
	public static void main(String[] args) {
		int[] origin = { 4, 9, 5, 1, 8, 7, 36, 12, 33 };

		System.out.println("origin Array: " + Arrays.toString(origin));
		System.out.println("\n=======Reverse=======\n");
		reverse(origin);
		System.out.println(Arrays.toString(origin));

	}

	private static void reverse(int[] origin) {
		for (int i = 0; i < origin.length / 2; i++) {
			int temp = origin[i];
			origin[i] = origin[origin.length - 1 - i];
			origin[origin.length - 1 - i] = temp;
		}
	}

}
