package view;

import functional.Require;

public class Ex02Numerator {
	public static void main(String[] args) {

		int x = 99;
		int y = 100;
		System.out.println("add -> " + process(x, y, Ex02Numerator::sum));
		
	}

	private static int process(int a, int b, Require require) {
		return require.operate(a, b);
	}

	public static int subtract(int a, int b) {
		return a - b;

	}

	public static int sum(int a, int b) {
		return a + b;
	}
}
