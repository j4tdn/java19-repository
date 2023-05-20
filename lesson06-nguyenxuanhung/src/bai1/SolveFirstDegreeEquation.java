package bai1;

import java.util.Scanner;

public class SolveFirstDegreeEquation {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		int a = 0;
		int b = 0;

		do {
			try {
				System.out.print("Input a:");
				a = Integer.parseInt(ip.nextLine());
				System.out.print("Input b:");
				b = Integer.parseInt(ip.nextLine());
				System.out.println(calc(a, b));
				break;
			} catch (Exception e) {
				System.out.println("exception --> " + e.getMessage());
			}
		} while (true);
	}

	public static double calc(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("b should not be zero");
		}
		return -b / a;
	}
}
