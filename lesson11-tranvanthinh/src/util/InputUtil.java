package util;

import java.util.Scanner;

public class InputUtil {
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

	public static int InputNumber() {
		Scanner ip = new Scanner(System.in);
		do {
			String s = ip.nextLine();
			if (isValidNumber(s)) {
				return Integer.parseInt(s);
			}
		} while (true);
	}
}
