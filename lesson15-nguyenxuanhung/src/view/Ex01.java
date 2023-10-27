package view;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		double inputNumber;

		while (true) {
			System.out.print("Input number: ");
			if (scanner.hasNextDouble()) {
				inputNumber = scanner.nextDouble();
				if (inputNumber != 0 && Math.abs(inputNumber - Math.floor(inputNumber)) > 1e-6) {
					break;
				} else {
					System.out.println("invalid input!!");
				}
			} else {
				System.out.println("invalid input!!");
				scanner.nextLine();
			}

			count++;
			if (count >= 3) {
				System.out.println("wrong input 3 times!!!");
				return;
			}
		}

		excute(inputNumber);
	}

	public static void excute(Double inputNumber) {
		int numerator = (int) (inputNumber * 100);
		int denominator = 100;
		int gcd = gcd(numerator, denominator);
		numerator /= gcd;
		denominator /= gcd;
		System.out.println("Result: " + inputNumber + " -> " + numerator + "/" + denominator);
	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
}
