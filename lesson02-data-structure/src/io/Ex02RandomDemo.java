package io;

import java.util.Random;

public class Ex02RandomDemo {
	public static void main(String[] args) {
		// Tạo ra 1 số ngầu nhiên
		Random rd = new Random();
		
		// range(min,max) của Int
		int noRestriction = rd.nextInt();
		System.out.println("noRestriction: " + noRestriction);
		
		// range [0 , N)
		
		int upperBound = rd.nextInt(10);
		System.out.println("upperBound: " + upperBound);
		
		// rang [a , b) -- [6, 24)
		int bouder = 6 + rd.nextInt(24); // a + (b-a)
		System.out.println("upperBound: " + bouder);
		
		System.out.println("======================");
		
		// [0.0 , 1)
		float decimalNumber = rd.nextFloat();
		System.out.println("decimalNumber: "+ decimalNumber);
		
		// [0.0 , 20]
		float upperNumef = rd.nextFloat() * 20;
		System.out.println("upperNumef: "+ upperNumef);
		
		// [5, 22)
		float boundNumef = 5 + rd.nextFloat() * 7;
		System.out.println("boundNumef: "+ boundNumef);

		//
		boolean boolValue = rd.nextBoolean();
		System.out.println("boolValue: " + boolValue);
		
	}
}
