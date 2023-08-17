package view;

import java.util.Arrays;

public class Ex01BasicArrayOperation {

	public static void main(String[] args) {
		int[] numbers = {1, 8, 12, 6, 33, 40, 24};
	}
	private static int[] getNumbers(int[] numbers, Condition condition) {
		int[] result = new int[numbers.length];
		int count = 0;
		for (int number : numbers) {
			if (condition.test(number) ) {
				result[count++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	private static int[] getOddNumbers(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0;
		for (int number : numbers) {
			if (number % 2 != 0 ) {
				result[count++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static void printf(String prefix, int[] numbers) {
		System.out.println(prefix + " -->" + Arrays.toString(null));
	}
}
