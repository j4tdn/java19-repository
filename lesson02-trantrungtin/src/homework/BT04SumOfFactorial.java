package homework;

import java.util.Random;

public class BT04SumOfFactorial {
	public static void main(String[] args) {
		int x = 10;
		int y = 21;
		long sum = 0;
		Random rd = new Random();
		int a = x + rd.nextInt(y - x);
		int b = x + rd.nextInt(y - x);
		int c = x + rd.nextInt(y - x);
		int d = x + rd.nextInt(y - x);
		sum = factorial(a) + factorial(b) + factorial(c) + factorial(d);

		System.out.println("S = " + a + "! + " + b + "! + " + c + "! + " + d + "! = " + sum);

	}

	public static long factorial(int number) {
		long s = 1;
		for (int i = number; i >= 1; i--) {
			s *= i;
		}
		return s;
	}

}
