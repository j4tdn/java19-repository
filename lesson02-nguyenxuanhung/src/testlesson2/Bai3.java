package testlesson2;

import java.util.Scanner;

public class Bai3 {
	private static int factorialOfN(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		return n*factorialOfN(n-1);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input n: ");
		int n = scanner.nextInt();
		System.out.println("Factorial of " + n +" = " + factorialOfN(n));
	}
}
