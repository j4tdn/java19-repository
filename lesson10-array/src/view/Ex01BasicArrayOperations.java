package view;

import java.util.Arrays;

import static utils.NumberUtils.*;

/**
 * Requirement: Given the array of integers.
 * 
 * Write methods to get odd, even, prime, happy, etc condition
 *
 */
public class Ex01BasicArrayOperations {

	public static void main(String[] args) {
		int[] numbers = { 1, 8, 12, 6, 33, 40, 19, 24, 17 };

		printf("1. Odd numbers", getOddNumbers(numbers));

		System.out.println("\n=====================\n");

		printf("2. Even numbers", getEvenNumbers(numbers));

		System.out.println("\n=====================\n");

		printf("3. Prime numbers", getPrimeNumbers(numbers));

		System.out.println("\n=====================\n");

		printf("4. Happy numbers", getHappyNumbers(numbers));
	}

	private static int[] getOddNumbers(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0;
		for (int number : numbers) {
			if (number % 2 != 0) {
				result[count++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static int[] getEvenNumbers(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0;
		for (int number : numbers) {
			if (number % 2 == 0) {
				result[count++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static int[] getPrimeNumbers(int[] numbers) {
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
		System.out.println(prefix + " --> " + Arrays.toString(numbers));
	}
}