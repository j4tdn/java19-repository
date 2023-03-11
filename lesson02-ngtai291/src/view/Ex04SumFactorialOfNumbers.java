package view;

import java.util.Random;

public class Ex04SumFactorialOfNumbers {
	public static void main(String[] args) {
		Random ip = new Random();

		int a = (ip.nextInt(10) + 1) * 2;
		int b = (ip.nextInt(10) + 1) * 2;
		int c = (ip.nextInt(10) + 1) * 2;
		int d = (ip.nextInt(10) + 1) * 2;
		
		System.out.println("Random a is: " + a);
		System.out.println("Random a is: " + b);
		System.out.println("Random a is: " + c);
		System.out.println("Random a is: " + d);

		
		System.out.println("==> Sum factorial of numbers is: " + countSum(a, b, c, d));
	}

	private static long countSum(int a, int b, int c, int d) {
		return Ex03FactorialOfNumber.countFactOfNumber(a) +
				Ex03FactorialOfNumber.countFactOfNumber(b) +
			    Ex03FactorialOfNumber.countFactOfNumber(c) +
			    Ex03FactorialOfNumber.countFactOfNumber(d);
	}
}
