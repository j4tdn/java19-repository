package homework;

import java.util.Scanner;

public class Ex05CheckSymmetry {
	public static boolean check(String a) {
		int left = 0;
		int right = a.length() - 1;
		while (left < right) {
			if (a.charAt(left) == a.charAt(right)) {
				left++;
				right--;
			} else
				return false;
		}
		return true;
	}

	public static boolean checkDigit(String s) {
		if (s.length() < 2)
			return false;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) < '0' || s.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		String s = "abc";
		while (!checkDigit(s)) {
			System.out.println("Nhap so can kiem tra: ");
			s = ip.nextLine();
		}
		System.out.println(check(s));
	}
}
