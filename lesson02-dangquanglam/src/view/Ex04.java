package view;

import java.util.Random;

public class Ex04 {
	public static void main(String[] args) {
		int x = 10;
		int y = 21;
		long sum = 0;
		
		Random rd = new Random();
		
		int a = x + rd.nextInt(y - x);
		int b = x + rd.nextInt(y - x);
		int c = x + rd.nextInt(y - x);
		int d = x + rd.nextInt(y - x);

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);

		sum = getFactorial(a) + getFactorial(b) + getFactorial(c) + getFactorial(d);

		System.out.println("Tổng giải thừa là: " + sum);
	}

	public static long getFactorial(int n) {
		long factorial = 1;
		for (int i = n; i > 0; i--) {
			factorial *= i;
		}
		return factorial;
	}

}
