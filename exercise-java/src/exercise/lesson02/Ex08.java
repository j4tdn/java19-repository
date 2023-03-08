package exercise.lesson02;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		String text = "";
		int count = 0;
		while (count < 5) {
			do {
				System.out.print("Nhập số nguyên n: ");
				text = ip.nextLine();
			} while (!isValidNumber(text));

			int n = Integer.parseInt(text);
			System.out.println("Nhập thành công n = " + n);
			System.out.println(isPrime(n) ? "N là số nguyên tố" : "N ko phải là số nguyên tố");
		}count++;
	}

	private static boolean isPrime(int input) {
		for (int i = 2; i <= input / 2; i++) {
			if (input % i == 0) {
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

		for (int i = 0; i < textLength; i++) {
			char letter = input.charAt(i);
			if (!Character.isDigit(letter)) {
				return false;
			}
		}
		return true;
	}
}
