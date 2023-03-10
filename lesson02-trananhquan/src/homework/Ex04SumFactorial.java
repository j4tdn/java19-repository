package homework;

import java.math.BigInteger;
import java.util.Random;

public class Ex04SumFactorial {

	public static void main(String[] args) {
		System.out.println("Tổng giai thừa 4 số ngẫu nhiên trong khoảng [10, 20]: " + sumFactorial2());
	}

	private static long sumFactorial() {
		Random rd = new Random();
		int sum = 0;
		for (int i = 0; i < 4; i++) {
			sum += Ex03FindFactorial.factorial(10 + rd.nextInt(11));
		}
		return sum;
	}

	private static BigInteger sumFactorial2() {
		Random rd = new Random();
		BigInteger sum = BigInteger.ZERO;
		for (int i = 0; i < 4; i++) {
			int temp = rd.nextInt(10 + rd.nextInt(11));
			sum = sum.add(Ex03FindFactorial.factorial2(temp));
		}
		return sum;
	}
}
