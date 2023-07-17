package view;

import java.util.Arrays;

import static utils.NumberUtils.*;

public class Ex01BasicArrayOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1, 8, 12, 6, 33, 40, 24, 17};
		printf("oodNumber", getOddNumbers(numbers));
		
		System.out.println("=====================");
		printf("evenNumber", getEvenNumbers(numbers));
		
		System.out.println("=====================");
		printf("primeNumber", getPrimeNumbers(numbers));
		
		System.out.println("=====================");
		printf("happyNumber", getHappyNumbers(numbers));

	}
	private static int[] getOddNumbers(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0;
		for(int number : numbers) {
			if(number % 2 != 0) {
				result[count++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0 , count);
	}
	
	private static int[] getEvenNumbers(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0;
		for(int number : numbers) {
			if(number % 2 == 0) {
				result[count++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0 , count);
	}
	
	private static int[] getPrimeNumbers(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0;
		for(int number : numbers) {
			if(isPrime(number)) {
				result[count++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0 , count);
	}
	
	private static int[] getHappyNumbers(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0;
		for(int number : numbers) {
			if(isHappyNumber(number)) {
				result[count++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0 , count);
	}
	
	private static void printf(String prefix, int[] numbers) {
		System.out.println(prefix + "--->" +Arrays.toString(numbers));
	}

}
