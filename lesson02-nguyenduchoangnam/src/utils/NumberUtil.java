package utils;

import java.util.Random;

public class NumberUtil {

	private static Random rd = new Random();
	
	private NumberUtil() {
	}
	
	public static boolean isPrime(int n) {
		for (int i = 2; i <= n/2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static long factorial(int n) {
		long f = n; // 10
		while (n > 1) {
			n--;
			f *= n;
		}
		return f;
	}
	
	// [inclusiveStart, exclusiveEnd)
	public static int random(int inclusiveStart, int exclusiveEnd) {
		return inclusiveStart + rd.nextInt(exclusiveEnd - inclusiveStart);
	}
}
