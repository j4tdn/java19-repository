package demo1;

import java.util.Scanner;

public class Ex08 {

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
			System.out.println(isPrime(Integer.parseInt(text)));
		}
	}

	private static boolean isValidNumber(String input) {
		if (input.length() == 0) {
			return false;
		}
		for (int i = 0; i < input.length(); i++) {
			if (!Character.isDigit(input.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

}
