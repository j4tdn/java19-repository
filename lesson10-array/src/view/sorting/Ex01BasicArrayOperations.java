package view.sorting;

import static utils.NumberUtils.*;

import java.util.Arrays;

public class Ex01BasicArrayOperations {
	public static void main(String[] args) {
		int[] numbers = { 1, 8, 12, 6, 33, 40, 19, 24, 17 };
		printf("1.Odd Numbers", getOddNumber(numbers));
		System.out.println("\n =========\n");
		printf("2. Even Numbers", getEvenNumber(numbers));
		System.out.println("\n =========\n");
		printf("3. Prime numbers", getPrimeNumbers(numbers));
		System.out.println("\n=====================\n");
		printf("4. Happy numbers", getHappyNumbers(numbers));
	}

	private static int[] getOddNumber(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0;
		for (int number : numbers) {
			if (number % 2 != 0) {
				result[count++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	public static int[] getEvenNumber(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0;
		for (int number : numbers) {
			if (number % 2 == 0) {
				result[count++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	public static int[] getPrimeNumbers(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0;
		for (int number : numbers) {
			if (isPrime(number)) {
				result[count++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static int[] getHappyNumbers(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0;
		for (int number : numbers) {
			if (isHappy(number)) {
				result[count++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static void printf(String prefix, int[] numbers) {
		System.out.println(prefix + "--> " + Arrays.toString(numbers));
	}
}
