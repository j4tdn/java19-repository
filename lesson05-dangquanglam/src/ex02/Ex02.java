package ex02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number: ");
		int number = scanner.nextInt();

		System.out.println(isSpecialNumber(number));

	}

	public static boolean isSpecialNumber(int number) {
		int sum = 0;
		int i = 1;

		while (sum < number) {
			sum += i;
			i += 1;
		}

		return sum == number;
	}
}
