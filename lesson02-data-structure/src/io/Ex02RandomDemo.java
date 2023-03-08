package io;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex02RandomDemo {
	public static void main(String[] args) {
		Random rd = new Random();
		int noRestriction = rd.nextInt();
		System.out.println("noRestriction : " + noRestriction);
		
		//range: [0-10)
		int upperBound = rd.nextInt(10);
		System.out.println("upperBound : " + upperBound);
		
		//range: [6-24)
		int bounder = 6 + rd.nextInt(18);
		System.out.println("noRestriction : " + bounder);
		
		System.out.println("============================================\n");
		
		float decimalNumber = rd.nextFloat();
		System.out.println("decimalNumber : " + decimalNumber);
		
		//range: [0.0, 20)
		float upperBoundf = rd.nextFloat() * 20;
		System.out.println("upperBoundf : " + upperBoundf);
		
		//range: [5-24)
		float boundNumberF = 5 + (rd.nextFloat() * 19);
		System.out.println("boundNumberF : " + boundNumberF);
		
		BigDecimal bd = BigDecimal.valueOf(boundNumberF).setScale(2,RoundingMode.HALF_UP);
		System.out.println("rounding : " + bd);
		
		
	}
}
