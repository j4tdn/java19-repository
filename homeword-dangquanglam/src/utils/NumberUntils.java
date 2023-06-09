package utils;

import java.util.Random;

public class NumberUntils {
	private static Random rd = new Random();
	private NumberUntils() {
	}
	public static long factorial(int n) {
//		long f = n;
//		// n= 6
//		// i = 6 ; 6 > 0
//		// f = 6 * 1
//		for (int i = n; i > 1; i--) {
//			f = i * f;
//		}
//		return f;
		
		long f = n;
		while (n > 1) {
			n--;
			f = f * n;
		}
		return f;
	}
	
	public static int random(int inclusiveStart, int inclusiveEnd) {
		return inclusiveStart + rd.nextInt(inclusiveEnd - inclusiveStart + 1);
	}
}
