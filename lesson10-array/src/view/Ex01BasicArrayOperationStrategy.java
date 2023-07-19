package view;

import java.lang.reflect.Array;
import java.util.Arrays;

import functional.Condition;

// 
public class Ex01BasicArrayOperationStrategy {
public static void main(String[] args) {
	int[] numbers = {1, 8, 12, 6, 33, 40, 24};
	
	
}
private static int[] getOddNumbers(int[] numbers) {
	int[] result = new int[numbers.length];
	int running = 0;
	for(int number : numbers ) {
		if(number % 2 != 0) {
			result[running++] = number;
		}
	}
	return Arrays.copyOfRange(result, 0, running);
}
private static int[] getEvenNumbers(int[] numbers) {
	int[] result = new int[numbers.length];
	int running = 0;
	for(int number : numbers ) {
		if(number % 2 == 0) {
			result[running++] = number;
		}
	}
	return Arrays.copyOfRange(result, 0, running);
}
private static int[] getNumbers(int[] numbers, Condition condition) {
	int[] result = new int[numbers.length];
	int running = 0;
	for(int number : numbers) {
		if(condition.test(number)) {
			result[running++] = number;
		}
	}
	return Arrays.copyOfRange(result, 0, running);
}
private static int[] getPrimeNumbers(int[] numbers) {
	int[] result = new int[numbers.length];
	int running = 0;
	for(int number : numbers ) {
		if(number % 2 == 0) {
			result[running++] = number;
		}
	}
	return Arrays.copyOfRange(result, 0, running);
}
private static void printf(String prefix, int[] numbers) {
	System.out.println(prefix + " - >" + Arrays.toString(numbers));
}
}
