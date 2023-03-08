package exercise.lesson02;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String text = "";
		int count = 0;
		while (count < 10) {
			do {
				System.out.print("Nhập số nguyên n: ");
				text = sc.nextLine();
			} while (!isValidNumber(text));

			int n = Integer.parseInt(text);

			if (isSymmetry()) {
				System.out.println("true: ");
			} else {
				System.out.println("false: ");
			}
			count++;
		}
	}

	private static boolean isSymmetry() {
		Scanner st = new Scanner(System.in);
		 int num1, reversed = 0, original;
		 System.out.println("\nNhập vào số cần kiểm tra: ");
		 num1 = st.nextInt();
		 original = num1;
		while (num1 != 0) {
			int digit = num1 % 10;
			reversed = reversed * 10 + digit;
			num1 /= 10;
		}
		if (reversed == original) {
			return true;
		} else {
			return false;
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
}
