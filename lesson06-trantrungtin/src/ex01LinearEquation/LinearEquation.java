package ex01LinearEquation;

import java.util.Scanner;

public class LinearEquation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = 0, b = 0;

		boolean validInput = false;
		while (!validInput) {
			try {
				System.out.print("Enter a: ");
				a = Double.parseDouble(sc.nextLine());
				if (a == 0) {
					System.err.println("Invalid input --> a cannot be zero. Please enter a non-zero value.");
					continue;
				}

				validInput = true;
			} catch (NumberFormatException e) {
				System.err.println("Invalid input. Please enter a number except zero.");
			}
		}

		validInput = false;
		while (!validInput) {
			try {
				System.out.print("Enter b: ");
				b = Double.parseDouble(sc.nextLine());
				validInput = true;
			} catch (NumberFormatException e) {
				System.err.println("Invalid input. Please enter a number");
			}
		}

		double x = -b / a;
		System.out.println("--> The result of " + a + "x + " + b + " = 0 is: x = " + x);
	}
}
