package exam;

import java.util.Scanner;

public class Ex01 {
	private static boolean isPowerOf(int a, int b) {
		while (a >= b) {
			int x = a / b;
			if (x == 1) {
				return true;
			} else
				a = x;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println((a > b ? isPowerOf(a, b) : isPowerOf(b, a)));
	}
}
