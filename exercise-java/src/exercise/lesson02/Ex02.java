package exercise.lesson02;

import java.util.Scanner;

public class Ex02 {
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
			System.out.println(isPowerOfTwo(n) ? "true:" : "false");
			count++;
		}

	}

	public static boolean isPowerOfTwo(int input) {
		if( 0 == input || 1 == input ) return true;
		int x = input / 2;
		int y = input%2;
		if (1 == y) return false;
		return isPowerOfTwo(x);
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
