package exercise.lesson02;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap a (0 den 19): ");
		int a = sc.nextInt();

		System.out.println("Nhap b (0 den 19): ");
		int b = sc.nextInt();

		System.out.println("Nhap c (0 den 19): ");
		int c = sc.nextInt();

		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}

		int min = a;
		if (b < min) {
			min = b;
		}
		if (c < min) {
			min = c;
		}
		System.out.println("max: " + max);
		System.out.println("min: " + min);

	}
}
