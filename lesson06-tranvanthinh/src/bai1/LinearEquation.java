package bai1;

import java.util.Scanner;

public class LinearEquation {
	
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		do {
			try {
				double result = inputAndHandle();
				System.out.println("result: " + result);
				break;
				
			} catch (NumberFormatException | ArithmeticException e) {
				if(e instanceof NumberFormatException) {
					System.out.println("enter integer value");
				}
				else System.out.println(e.getMessage());
			}
		} while (true);
		
	}
	private static double inputAndHandle() {
		double a = input("Enter a");
		double b = input("Enter b");
		return divide(a, b);
	}

	private static double input(String prefix) {
		System.out.print(prefix + ": ");
		return Double.parseDouble(ip.nextLine());
	}

	private static double divide(double a, double b) {
		if (a == 0) {
			throw new ArithmeticException("a should not be zero");
		}
		return -b/a;
	}
}
