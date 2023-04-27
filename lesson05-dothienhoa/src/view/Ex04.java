package view;

import java.util.Arrays;

public class Ex04 {
	public static int[] getUniqueNumbers(int[] arr) {
		int[] uniqueArr = new int[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean isUnique = true;
			for (int j = 0; j < arr.length; j++) {
				if (i != j && arr[i] == arr[j]) {
					isUnique = false;
					break;
				}
			}
			if (isUnique) {
				uniqueArr[count++] = arr[i];
			}
		}
		int[] resultArr = new int[count];
		for (int i = 0; i < count; i++) {
			resultArr[i] = uniqueArr[i];
		}
		return resultArr;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 15, 21, 0, 15, 17, 21 };
		int[] uniqueArr = getUniqueNumbers(arr);
		Arrays.sort(uniqueArr);
		for (int num : uniqueArr) {
			System.out.print(num + " ");
		}
	}

}
