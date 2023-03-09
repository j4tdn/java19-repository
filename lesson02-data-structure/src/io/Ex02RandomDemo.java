package io;

import java.util.Random;

public class Ex02RandomDemo {
	public static void main(String[] args) {
		Random rd = new Random();
		
		int noRestriction = rd.nextInt();
		
		System.out.println("noRestriction: " + noRestriction);
		
		int upperBound = rd.nextInt(10);
		
		System.out.println(upperBound);
		
		int bounder = 6 + rd.nextInt(18);
		
		System.out.println(bounder);
		
		// \n break line: xuống hàng
		System.out.println("\n==================\n");
		
		
		// [0.0 --> 1)
		float decimalNumber= rd.nextFloat();
		System.out.println("decimalNumber: " + decimalNumber);
		// [0.0 --> 20)
		float upperBoundF = 20 * rd.nextFloat();
		
		System.out.println("upperBound: " + upperBoundF);
		// [a, b) --> [5 --> 20)
		
		float boundNumberF = 5 + (rd.nextFloat()*17);
		
		System.out.println("boundNumberF: " + boundNumberF);
		
		// Tạo ra một giá trị Boolean ngẫu nhiên --> true || false
		
		boolean boolValue = rd.nextBoolean();
		System.out.println(boolValue);
	}
}
