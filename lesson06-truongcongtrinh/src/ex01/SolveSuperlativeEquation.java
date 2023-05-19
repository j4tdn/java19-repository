package ex01;

import java.util.Scanner;

public class SolveSuperlativeEquation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a = 0;
		float b = 0;
	do {
		try {
			System.out.println("ax + b = 0");
			System.out.print("Enter a: ");
			a = Float.parseFloat(sc.nextLine());
			System.out.print("Enter b: ");
			b = Float.parseFloat(sc.nextLine());
			System.out.println("x --> " + solveSuperlativeEquation(a, b));			
			break;
		} catch (NumberFormatException e) {
			System.out.println("Invalid Number!!!");
		} catch (ArithmeticException e) {
			System.out.println("Cannot divided by 0!!!");
		}
	} while (true);
		System.out.println("Solved Successfully !!!");
		sc.close();
	
	}

	// ax + b = 0 -> x = -b/a

	private static float solveSuperlativeEquation(float a, float b) {
		if(a == 0) {
			throw new ArithmeticException();
		}
		return -b/a;
	}
}