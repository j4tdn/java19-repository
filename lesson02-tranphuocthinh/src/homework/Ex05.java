package homework;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String text = "";
		int n = 0;
		do {
			System.out.print("Nhập vào số N= ");
			text = ip.nextLine();
			n++;
		} while (!isValidNumber(text) && n < 5);
		ip.close();
		if (n == 5 && !isValidNumber(text)) {
			System.out.println("Bạn đã nhập quá 5 lần ");
		} else {
			System.out.println(isSymmetricNumber(Integer.parseInt(text)));
		}
	}

	private static boolean isValidNumber(String input) {
		if (input.length() < 2) {
			return false;
		}
		for (int i = 0; i < input.length(); i++) {
			if (!Character.isDigit(input.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	private static boolean isSymmetricNumber(int number) {
		int reversedNumber = 0;
		int originalNumber = number;
		while (number != 0) {
			reversedNumber = reversedNumber * 10 + number % 10;
			number /= 10;
		}
		return originalNumber == reversedNumber;
	}

}
