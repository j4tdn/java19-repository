package view;

import java.util.Arrays;

import functional.Condition;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = { 1, 3, 7, 8, 12 };
		printf(getNumber(numbers, nb -> nb % 2 != 0 ));
		System.out.println("========================");
		printf(getNumber(numbers, nb -> nb % 2 != 0));
		System.out.println("========================");
		printf(getNumber(numbers, nb -> isPrimeNumber(nb)));
		System.out.println("========================");
	}

	private static int[] getOddNumber(int[] numbers) {
		int[] result = new int[numbers.length];
		int index = 0;
		for (int number : numbers) {
			if (number % 2 != 0) {
				result[index++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, index);
	}

	private static int[] getEvenNumber(int[] numbers) {
		int[] result = new int[numbers.length];
		int index = 0;
		for (int number : numbers) {
			if (number % 2 == 0) {
				result[index++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, index);
	}

	private static void printf(int[] numbers) {
		System.out.println(Arrays.toString(numbers));
	}

	private static boolean isHappyNumber(int number) {
		// store generated sum of square elements
		int[] storage = new int[1000];
		int storageCount = 0;
		while (number != 1) {
			if (isExists(storage, number, storageCount)) {
				return false;
			}
			storage[storageCount++] = number;
			number = sumOfSquare(number);
		}
		return true;
	}

	private static boolean isExists(int[] elements, int checkNumber, int realCounter) {
		for (int i = 0; i < realCounter; i++) {
			if (elements[i] == checkNumber) {
				return true;
			}
		}
		return false;
	}

	// 123 --> 1^2 + 2^2 + 3^2
	private static int sumOfSquare(int number) {
		int sum = 0;
		String numberAsString = String.valueOf(number); // numberAsString = "123"
		// support for logging
		String[] text = new String[numberAsString.length()]; // length = {"1^2", "2^2", "3^3"}
		for (int i = 0; i < numberAsString.length(); i++) {
			String digitAsString = numberAsString.charAt(i) + "";
			int digit = Integer.parseInt(digitAsString);
			sum = sum + digit * digit;
			text[i] = digitAsString + "^2";
		}
		System.out.println(String.join(" + ", text) + " = " + sum);
		return sum;
	}
	
	private static boolean isPrimeNumber(int number) {
		if(number == 0 || number == 1) {
			return false;
		}
		for(int i = 2; i < Math.sqrt(number); i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}

	

	private static int[] getNumber(int[] numbers, Condition condition) {
		int[] result = new int[numbers.length];
		int index = 0;
		for (int number : numbers) {
			if (condition.test(number)) {
				result[index++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, index);
	}
	
}
