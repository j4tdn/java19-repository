package testlesson2;

import java.util.Scanner;

public class Bai5 {
//	private static boolean isValidNumber(String n) {
//		try {
//			if (Integer.parseInt(n) < 10)
//				return false;
//			return true;
//		} catch (Exception e) {
//			return false;
//		}
//	}
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

	public static boolean isPalindromeNumber(int n) {
		int res = 0, temp = n;
		while (temp > 0) {
			res = res * 10 + temp % 10;
			temp /= 10;
		}
		if (res == n) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Check n is PalindromeNumber?");
		System.out.print("Input n:");
		while(true) {
			String n = scanner.nextLine();
			if(isValidNumber(n)) {
				System.out.println(isPalindromeNumber(Integer.parseInt(n)));
				System.out.println("---End---");
				break;
			}
			else {
				System.out.print("Input again n: ");
			}
			
		}

	}
}
