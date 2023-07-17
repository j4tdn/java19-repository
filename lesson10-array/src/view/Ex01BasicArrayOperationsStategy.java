package view;

import java.util.Arrays;

import functional.Condition;

import static utils.NumberUtils.*;

public class Ex01BasicArrayOperationsStategy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 1, 8, 12, 6, 33, 40, 24, 17 };

		/*
		 * Condition c1 = new Condition() {
		 * 
		 * @Override 
		 * public boolean test(int number) { 
		 * return number % 2 != 0; } };
		 */
		/*
		 	Condition c1 = (int number) -> {
			return number % 2 != 0;
		};
		*/

		printf("oodNumber", getNumbers(numbers, nb -> nb % 2 != 0));

		System.out.println("============================");

		Condition c2 = new Condition() {

			@Override
			public boolean test(int number) {
				return number % 2 == 0;
			}
		};

		printf("evenNumber", getNumbers(numbers, c2));

		System.out.println("============================");

		Condition c3 = new Condition() {

			@Override
			public boolean test(int number) {
				return isPrime(number);
			}
		};

		printf("primeNumber", getNumbers(numbers, c3));
		
		System.out.println("============================");

		Condition c4 = new Condition() {

			@Override
			public boolean test(int number) {
				return isHappyNumber(number);
			}
		};

		printf("primeNumber", getNumbers(numbers, c4));

	}

	private static int[] getNumbers(int[] numbers, Condition condition) {
		int[] result = new int[numbers.length];
		int count = 0;
		for (int number : numbers) {
			if (condition.test(number)) {
				result[count++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static void printf(String prefix, int[] numbers) {
		System.out.println(prefix + "--->" + Arrays.toString(numbers));
	}

}
