package homework;

import java.math.BigInteger;
import java.util.Random;

public class Ex4 {

	private static long factorial(int n) {
		long fac = 1;
		if (n == 0 || n == 1) {
			return fac;
		} else {
			for (int i = 2; i <= n; i++) {
				fac *= i;
			}
		}
		return fac;
	}

	public static void main(String[] args) {
		Random rd = new Random();
//		int a = 10 + rd.nextInt(21 - 10);
//		int b = 10 + rd.nextInt(21 - 10);
//		int c = 10 + rd.nextInt(21 - 10);
//		int d = 10 + rd.nextInt(21 - 10);
		long sum = 0; 
//		long sum = factorial(a) + factorial(b) + factorial(c) + factorial(d);
		for(int i = 0; i < 4 ; i++) {
			sum += factorial(10 + rd.nextInt(11));
		}
		
		System.out.print("Sum = " + sum);
	}

}
