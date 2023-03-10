package view;

import java.util.Random;

public class bai04 {
	public static void main(String[] args) {
		Random rd = new Random();
		int a = 10 + rd.nextInt(10); // [10,20]
		int b = 10 + rd.nextInt(10); // [10,20]
		int c = 10 + rd.nextInt(10); // [10,20]
		int d = 10 + rd.nextInt(10); // [10,20]
		System.out.println("Sum Factorial: " + sumOfFactorial(a, b, c, d));
	}

	private static long sumOfFactorial(int a, int b, int c, int d) {
		return bai03.factorialCal(a) + bai03.factorialCal(b) + bai03.factorialCal(c) + bai03.factorialCal(d);
	}
}
