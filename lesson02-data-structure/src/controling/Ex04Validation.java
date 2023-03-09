package controling;

import java.util.Scanner;

public class Ex04Validation {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String text = "";
		
		do {
			System.out.print("Input number is n(valid): ");
			text = ip.nextLine();
		} while(!isValidNumber(text));

		int n = Integer.parseInt(text);
		
		System.out.println("Complete input is n = " + n);
		System.out.println(isPrime(n) ?
				"N is prime number" : "N not is prime number");
		
	}
	
	private static boolean isPrime(int input) {
		for (int i = 2; i < input/2; i++) {
			if(input % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean isValidNumber(String input) {
		int textLength = input.length();
		if(textLength == 0) {
			return false;
		}
		for (int i = 0; i < textLength; i++) {
			char letter = input.charAt(i);
			if(!Character.isDigit(letter)) {
				return false;
			}
		}
		return true;
	}
}
