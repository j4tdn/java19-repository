package exercise.lesson02;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		String text = "";
		while (count < 5) {
			do {
				System.out.print("Nhập số nguyên n: ");
				text = sc.nextLine();
			} while (!isValidNumber(text));

			int n = Integer.parseInt(text);
			System.out.println(ismultiple(n) ? "true:" : "false");
			count++;
		}

	}

	public static boolean ismultiple(int input) {
		if (input < 2) {
			return false;
		}

		for (int i = 0; i < input; i++) {

			if (input % 2 == 0) {
				return true;
			}
		}
		return false;
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
}
