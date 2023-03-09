package demo1;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số nguyên a (0 <= a < 20): ");
		int a = sc.nextInt();
		System.out.print("Nhập số nguyên b (0 <= b < 20): ");
		int b = sc.nextInt();
		System.out.print("Nhập số nguyên c (0 <= c < 20): ");
		int c = sc.nextInt();
		sc.close();
		int min = a;
		if (b < min) {
			min = b;
		}
		if (c < min) {
			min = c;
		}

		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}

		System.out.println("Số nguyên nhỏ nhất trong ba số " + a + ", " + b + ", " + c + " là " + min);
		System.out.println("Số nguyên lớn nhất trong ba số " + a + ", " + b + ", " + c + " là " + max);
	}
}
