package view;

import java.util.Scanner;

public class Ex02ExponentiationOf2 {
	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		String text = "";
		int ipAgain = 1;
		do {

			System.out.println("Input number (valid): ");
			text = ip.nextLine();

			if (!isValidNumber(text)) {
				if (ipAgain == 5) {
					System.out.println("You input failed 5 times, exit program!!!");
					System.exit(0);
				}
				System.out.println("number is not valid, input again~~~");
				ipAgain++;
			} else
				break;
		} while (true);

		System.out.print("Number is valid ==>  ");

		int n = Integer.parseInt(text);

		if (isNumberExpoOf2(n)) {
			System.out.println("Number is Expnentiation of 2");
		} else {
			System.out.println("Number not is Expnentiation of 2");
		}
	}

	private static boolean isValidNumber(String input) {
		int textLength = input.length();
		if (textLength == 0) {
			return false;
		}
		for (int i = 0; i < textLength; i++) {
			char letter = input.charAt(i);
			if (!Character.isDigit(letter)) {
				return false;
			}
		}
		return true;
	}

	private static boolean isNumberExpoOf2(int number) {

		while (true) {
			int x = number / 2;
			int y = number % 2;
			if (x == 1 & y == 0) {
				return true;
			}
			if (y != 0) {
				return false;
			}
			number /= 2;
		}
	}
}
