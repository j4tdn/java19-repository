package exam;

import java.util.Arrays;

public class Ex04 {
	private static int[] getUniqueNumber(int[] arr) {
		Arrays.sort(arr);
		int n = arr.length;
		int[] unique = new int[arr[n - 1] + 5];
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (unique[arr[i]] == 0) {
				unique[arr[i]]++;
				count++;
			} else
				unique[arr[i]]++;
		}

		int result[] = new int[count];
		int temp = 0;
		for (int i = 0; i < n; i++) {
			if (unique[arr[i]] == 1) {
				result[temp++] = arr[i];
			}
		}
		return Arrays.copyOfRange(result, 0, temp) ;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 15, 21, 0, 15, 17, 21 };
		System.out.println(Arrays.toString(getUniqueNumber(arr)));
	}
}
