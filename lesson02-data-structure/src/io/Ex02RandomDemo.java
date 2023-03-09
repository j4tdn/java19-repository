package io;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex02RandomDemo {
	public static void main(String[] args) {
		Random rd = new Random();
		
		int noRestriction = rd.nextInt();
		System.out.println("noRestriction: " + noRestriction);
		
		int upperBound = rd.nextInt(10);
		System.out.println("upperBound: " + upperBound);
		
		int bounder = 6 + rd.nextInt(10);
		System.out.println("bounder: " + bounder);
		
		System.out.println("\n============================\n");
		
		float decimalNumber = rd.nextFloat();
		System.out.println("decimalNumber: " + decimalNumber);
		
		float upperBoundF = rd.nextFloat() * 20;
		System.out.println("upperBoundF:" + upperBoundF);
		
		BigDecimal bd = BigDecimal.valueOf(upperBoundF)
									.setScale(2, RoundingMode.HALF_UP);
		System.out.println("Rouding: " + bd);
		
		float boundNumberF = 5 + (rd.nextFloat() * 17);
		System.out.println("boundNumberF: " + boundNumberF);
		
		boolean boolValue = rd.nextBoolean();
		System.out.println("boolValue: " + boolValue);
		
		
		
	}
}
