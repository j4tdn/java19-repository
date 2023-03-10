package datastructure.array;

import java.util.Arrays;
import java.util.Random;

public class Ex01BasicDemoPrimitive {
	public static void main(String[] args) {
		int[] digits = new int[8];

		digits[2] = 123;
		digits[4] = 852;

		System.out.println("digits --> " + Arrays.toString(digits));
		System.out.println("digits length:  " + digits.length);
		System.out.println("digits[5]: " + digits[5]);

		System.out.println("\n=====================");

		//int[] numbers = new int[] { 47, 86, 95, 15, 34 };
		//int[] numbers = fetchData();
		int[] numbers = { 47, 86, 95, 15, 34 };
		
		
		// Ex1: get 1 phan tu random in numbers array
		Random rd = new Random();
		int randomValue = numbers[rd.nextInt(numbers.length)];
		System.out.println("randomValue: " + randomValue);
		
	}

	public static int[] fetchData() {
		return new int[] { 47, 86, 95, 15, 34 };
	}
}
