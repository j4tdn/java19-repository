package view;

import java.util.Arrays;
import java.util.Random;

import utils.NumberUtil;

/**
 * Tính tổng giai thừa của a b c d (n số) Biết rằng a,b,c,d là các số nguyên
 * ngẫu nhiên từ 10 đến 20  [10, 20]
 */
public class Ex04FactorialSumming {
	private static Random rd = new Random();

	public static void main(String[] args) {
		int[] numbers = new int[4];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random(1, 5);
		}

		System.out.println("numbers --> " + Arrays.toString(numbers));
		System.out.println("sum of fact numbers: " + sumOfFact(numbers));
	}

	private static long sumOfFact(int[] numbers) {
		long sum = 0;
		for (int number : numbers) {
			sum += NumberUtil.factorial(number);
		}
		return sum;
	}

	private static int random(int inclusiveStart, int inclusiveEnd) {
		return inclusiveStart + rd.nextInt(inclusiveEnd - inclusiveStart + 1);
	}
}
