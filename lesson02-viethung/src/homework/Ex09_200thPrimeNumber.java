package homework;

import java.util.Scanner;

public class Ex09_200thPrimeNumber {
	public static boolean checkPrime(int a) {
		int boot = a;
		if (a < 2)
			return false;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean checkDigit(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) < '0' || s.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int i = 0;
		int temp = 0;
		while (true) {
			if (checkPrime(i)) {
				temp++;
				if (temp == 200) {
					System.out.println(i);
				}
				i++;
			} else
				i++;
		}
	}
}