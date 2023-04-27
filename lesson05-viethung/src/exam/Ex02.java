package exam;

import java.util.Arrays;

public class Ex02 {
	private static int getMissingNumber(int[] arr) {
		int n = arr.length;
		int[] standard = new int[n];
		for (int i = 0; i < n; i++) {
			standard[i] = i + 1;
		}
		Arrays.sort(arr);
		for (int i = 0; i < n; i++) {
			if (arr[i] != standard[i]) {
				return i + 1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 7, 9, 2, 1, 6, 5, 4, 10 };
		System.out.println(getMissingNumber(arr));
	}
}
