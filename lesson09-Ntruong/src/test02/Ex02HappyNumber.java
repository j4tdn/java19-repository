package test02;

import java.util.Iterator;
import java.util.Random;

public class Ex02HappyNumber {
	public static void main(String[] args) {
		int number = new Random().nextInt(10,100);
		System.out.println("Initial Number :"+number);
		
		System.out.println("is" + number + "a happy number-->"+ isHappyNumber(number));
		
	}
	private static boolean isHappyNumber(int number) {
		// store generated sum of square elements
		int []storage = new int[1000];
		int storageCount = 0;
		while(number !=1) {
			if (isExists(storage,number, storageCount)) {
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
	//123 ---> 1^2 + 2^2+ 3^2
	private static int sumOfSquare(int number) {
		int sum = 0;
		String numberAsString = String.valueOf(number); // numberAsString = "123"
		// support for logging
		String[]text = new String[numberAsString.length()];// length = {"1^2", "2^2", "3^3"}
		for (int i = 0; i < numberAsString.length(); i ++) {
			String digitAsString = numberAsString.charAt(i)+ "";
			int digit = Integer.parseInt(digitAsString);
			sum = sum + digit*digit;
			text[i] = digitAsString + "^2";
		}
		System.out.println(String.join("+", text)+"="+sum);
		return sum;
	}
}
