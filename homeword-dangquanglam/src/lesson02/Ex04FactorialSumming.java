package lesson02;

import java.util.Arrays;
import java.util.Random;

import utils.NumberUntils;

public class Ex04FactorialSumming {
	private static Random rd = new Random();
	public static void main(String[] args) {
		int[] numbers = new int[4];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random(1, 5);
		}
		
		System.out.println("Number = " + Arrays.toString(numbers));
		System.out.println("sum of fact numbers: " + sumOfFact(numbers));

	}
	
	private static long sumOfFact(int[] numbers) {
		long sum = 0;
		for (int number : numbers) {
			sum += NumberUntils.factorial(number);
		}
		return sum;
	}
	
	private static int random(int inclusiveStart, int inclusiveEnd) {
		return inclusiveStart + rd.nextInt(inclusiveEnd - inclusiveStart + 1);
	}
}
