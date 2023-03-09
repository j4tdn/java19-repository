package testlesson2;

import java.util.Scanner;

public class Bai1 {
	private static boolean isMultipleOf2(int n) {
		if (n % 2 == 0)
			return true;
		return false;
	}

//	private static boolean isValidNumber(String n) {
//		try {
//			if(Integer.parseInt(n) > 0) return true;
//			else {
//				return false;
//			}
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

	public static void main(String[] args) {
		String n;
		int countError = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Practice 1: Check n is multiple of 2?");
		System.out.print("Input n: ");
		while (true) {
			n = scanner.nextLine();
			if (isValidNumber(n)) {
				System.out.println(isMultipleOf2(Integer.parseInt(n)));
				System.out.println("---End---");
				break;
			} else {
				countError++;
				if (countError == 5) {
					System.out.println("You typed wrong 5 times");
					System.out.println("---End---");
					break;
				}
				System.out.print("Input n again: ");

			}
		}
	}

}
