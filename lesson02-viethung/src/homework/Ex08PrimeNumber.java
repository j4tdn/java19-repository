package homework;

import java.util.Scanner;

public class Ex08PrimeNumber {
	public static boolean checkPrime(int a) {
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
		Scanner ip = new Scanner(System.in);
		String temp = "abc0";
		int i = 0;
		while (!checkDigit(temp)) {
			System.out.println("Nhap so: ");
			temp = ip.nextLine();
			i++;
			if (i == 5) {
				System.out.println("Gia tri khong hop le!");
				break;
			}
		}
		if (i < 5) {
			System.out.println(checkPrime(Integer.parseInt(temp)));
		}
	}
}
