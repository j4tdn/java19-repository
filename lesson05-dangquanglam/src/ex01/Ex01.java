package ex01;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number: ");
		int number = scanner.nextInt();
		System.out.print("Enter base: ");
		int base = scanner.nextInt();

		System.out.println(isPowerOf(number, base));

	}

	public static boolean isPowerOf(int number, int base) {
		if (number == 1 || number == base) {
			return true;
		}
		int power = base;
		while (power < number) {
			power *= base;
		}
		return power == number;
	}
}
