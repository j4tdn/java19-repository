package ex04;

import java.util.Arrays;

public class Sum {
	public static void main(String[] args) {
		int[] a1 = { 1, 5, 8, 9, 2, 5, 9 };
		int[] a2 = { 4, 2, 6, 6, 4, 15, 1 };

		System.out.println(sum(a1));
		System.out.println(sum(a2));

	}

	private static int sum(int[] arr) {
		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max || arr[i] == min) {
				continue;
			}
			sum += arr[i];
		}
		return sum;
	}
}
