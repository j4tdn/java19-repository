package homework;

import java.util.Scanner;

public class Ex6 {

	public static int maxNumber(int a, int b, int c) {
		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		return max;
	}

	public static int minNumber(int a, int b, int c) {
		int min = a;
		if (b < min) {
			min = b;
		}
		if (c < min) {
			min = c;
		}
		return min;
	}

	public static void main(String[] args) {
		Ex1 ex = new Ex1();
		Scanner ip = new Scanner(System.in);
		String str;
		String str2;
		String str3;
		do {
			System.out.print("Enter number 1: ");
			str = ip.nextLine();
		} while (ex.checkNumber(str) == false || Integer.parseInt(str) > 20);

		int a = Integer.parseInt(str);
		do {
			System.out.print("Enter number 2: ");
			str2 = ip.nextLine();
		} while (ex.checkNumber(str2) == false || Integer.parseInt(str2) > 20);

		int b = Integer.parseInt(str2);
		do {
			System.out.print("Enter number 3: ");
			str3 = ip.nextLine();
		} while (ex.checkNumber(str3) == false || Integer.parseInt(str3) > 20);

		int c = Integer.parseInt(str3);

		System.out.print("Max: " + maxNumber(a, b, c));
		System.out.println();
		System.out.println("Min: " + minNumber(a, b, c));

	}
}
