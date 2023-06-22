package ex02;

import java.util.Arrays;

public class LargestNumberInString {
	public static void main(String[] args) {
		String[] strings = new String[] { "a6b546c6e22h", "aa6b326c6e22h" };
		System.out.println(findMaxNumberFromString("a6b546c6e22h"));
		System.out.println(Arrays.toString(getListMaxNumberOfStrings(strings)));
	}

	private static int[] getListMaxNumberOfStrings(String[] strings) {
		int[] maxNumbers = new int[strings.length];
		for (int i = 0; i < strings.length; i++) {
			maxNumbers [i] = findMaxNumberFromString(strings[i]);
		}
		return sortNumbers(maxNumbers);
	}

	private static int[] sortNumbers(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		return arr;
	}

	private static int findMaxNumberFromString(String s) {
		int[] arrayIntInString = new int[s.length() / 2];
		int result;
		String[] parts = s.split("[a-z]+");
		int running = 0;
		for (String part : parts) {
			if (!part.isEmpty()) {
				int number = Integer.parseInt(part);
				arrayIntInString[running++] = number;
			}
		}
		int maxNumber = arrayIntInString[0];
		for (int i = 1; i < arrayIntInString.length; i++) {
			if (arrayIntInString[i] > maxNumber) {
				maxNumber = arrayIntInString[i];
			}
		}

		return maxNumber;
	}
}
