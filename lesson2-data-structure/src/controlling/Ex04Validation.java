package controlling;

import java.util.Scanner;

public class Ex04Validation {
	
	private static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		int squareRoot = (int) Math.sqrt(n);
		for (int i = 2; i <= squareRoot; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	private static boolean isValidNumber(String input) {
		int textLength = input.length();
		if (textLength == 0) {
			return false;
		}
		for(int i = 0; i < textLength; i++) {
//			if(input.charAt(i) < '0' || input.charAt(i) > '9') {
//				return false;
//			}
			char letter = input.charAt(i);
			if(!Character.isDigit(letter)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input n: ");
		while(true) {
			String n = scanner.nextLine();
			if(isValidNumber(n)) {
				System.out.println(isPrime(Integer.parseInt(n)));
				break;
			}
			else {
				System.out.print("Input again n: ");
			}
		}
	}
}
