package view;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a;
		do {
			System.out.print("Enter an integer: ");
			a = sc.nextLine();
		} while (!isValidNumber(a));
		System.out.println("Result: " + convertDecToBin(Integer.parseInt(a)));
	}

	public static boolean isValidNumber(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i)))
				return false;
		}
		Integer a = Integer.parseInt(s);
		if (a < 0)
			return false;
		return true;
	}

	public static String convertDecToBin(Integer number) {
		String res = number.toBinaryString(number);
		return res;
	}
}
