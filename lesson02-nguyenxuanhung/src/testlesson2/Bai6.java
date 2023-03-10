package testlesson2;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Bai6 {
//	private static boolean isValidNumber(String n) {
//		try {
//			if (Integer.parseInt(n) >= 20 && Integer.parseInt(n) < 0)
//				return false;
//			return true;
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

	private static int minOfThreeNumber(int a, int b, int c) {
		int res = a;
		if (b < res)
			res = b;
		if (c < res)
			res = c;
		return res;
	}

	private static int maxOfThreeNumber(int a, int b, int c) {
		int res = a;
		if (b > res)
			res = b;
		if (c > res)
			res = c;
		return res;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a;
		String b;
		String c;
		System.out.println("----------Min and Max----------");
		System.out.print("Input a:");
		while (true) {
			a = scanner.nextLine();
			if (isValidNumber(a)) {
				break;
			} else {
				System.out.print("Input again a: ");
			}

		}
		System.out.print("Input b:");
		while (true) {
			b = scanner.nextLine();
			if (isValidNumber(b)) {
				break;
			} else {
				System.out.print("Input again b: ");
			}

		}
		System.out.print("Input c:");
		while (true) {
			c = scanner.nextLine();
			if (isValidNumber(c)) {
				break;
			} else {
				System.out.print("Input again c: ");
			}

		}
		System.out.println("Min of {" + a + ", " + b + ", " + c + "} = "
				+ minOfThreeNumber(Integer.parseInt(a), Integer.parseInt(b), Integer.parseInt(c)));
		System.out.println("-------------");
		System.out.println("Max of {" + a + ", " + b + ", " + c + "} = "
				+ maxOfThreeNumber(Integer.parseInt(a), Integer.parseInt(b), Integer.parseInt(c)));
	}
}
