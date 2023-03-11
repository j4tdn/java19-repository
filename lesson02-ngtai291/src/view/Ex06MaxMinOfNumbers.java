package view;

import java.util.Scanner;

public class Ex06MaxMinOfNumbers {
	Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Input a: ");
		int a = checkingNumber(ip.nextInt());
		System.out.println("Input b: ");
		int b = checkingNumber(ip.nextInt());
		System.out.println("Input c: ");
		int c = checkingNumber(ip.nextInt());
		
		System.out.println("Min number is: " + min(a, b, c));
		System.out.println("Max number is: " + max(a, b, c));
		
	}
	
	private static int checkingNumber(int n) {
		int ipAgain = 0;
		String text = String.valueOf(n);
		
		do {
			if (!isValidNumber(text)) {
				ipAgain++;
				if (ipAgain == 5) {
					System.out.println("You input failed 5 times, exit program!!!");
					System.exit(0);
				}
				System.out.println("number is not valid, input again~~~");

			} else {
				n = Integer.parseInt(text);
				if (n >= 20) {
					ipAgain++;
					if (ipAgain == 5) {
						System.out.println("You input failed 5 times, exit program!!!");
						System.exit(0);
					}
					System.out.println("Number is smaller 20, input again");
					continue;
				}
				break;
			}
		} while (true);
		return n;
	}

	private static int min(int a, int b, int c) {
		int min = a;
		min = (min < b) ? min : b;
		min = (min < c) ? min : c;
		return min;
		
	}

	private static int max(int a, int b, int c) {
		int max = a;
		max = (max > b) ? max : b;
		max = (max > c) ? max : c;
		return max;
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
