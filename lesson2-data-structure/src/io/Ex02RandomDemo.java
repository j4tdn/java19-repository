package io;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex02RandomDemo {
	public static void main(String[] args) {
		Random rd = new Random();

		// range: [min, max] int --> 4 bytes
		int noRestriction = rd.nextInt(); // min int --> max int
		System.out.println("noRestriction: " + noRestriction);

		// range: [0 - N] --> [0, 10]
		// from a(inclusive)[to b(exclusive)
		int upperBound = rd.nextInt(10);
		System.out.println("upperBound: " + upperBound);

		// range [a - b) --> [6 , 24)
		int bounder = rd.nextInt(18) + 6;
		System.out.println("bounder: " + bounder);

		// Tao ra so thuc ngau nhien
		// [0.0f, 1f)
		float decimalNumber = rd.nextFloat();
		System.out.println("decimalNumber: " + decimalNumber);
		// [0.0, 20)
		float upperBoundF = 20 * rd.nextFloat();
		System.out.println("UpperBoundF: " + upperBoundF);
		
		//scale: lam tron may so
		//rounding mode: che do lam tron
		
		BigDecimal bd = BigDecimal.valueOf(upperBoundF).setScale(2, RoundingMode.HALF_UP);
		System.out.println("rounding: " + bd);
		
		// [a, b) --> [5, 22)
		float boundNumberF = rd.nextFloat() * 17 + 5;
		System.out.println("boundNumberF: " + boundNumberF);
		
		//Tao ra gia tri boolean ngau nhien --> true | false
		boolean boolValue = rd.nextBoolean();
		System.out.println("boolValue:" + boolValue);
		
		
		
	}
}
