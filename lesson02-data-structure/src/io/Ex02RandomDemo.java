package io;

import java.math.BigDecimal;
import java.util.Random;

public class Ex02RandomDemo {
	public static void main(String[] args) {
		// A random number
		// Ramdom - tạo ra một số ngẫu nhiên

		Random rd = new Random();

		// range(phạm vi): [min, max] int
		int noRestriction = rd.nextInt();
		System.out.println("noRestriction: " + noRestriction);

		// range [0 - N]
		// From a(inclusive)[to b(exclusive)]
		int upperBound = rd.nextInt(10);
		System.out.println("upperBound: " + upperBound);

		// range: [a - b) -->[6,24)
		int bounder = 6 + rd.nextInt(18);// a --> b-a
		System.out.println("bounder: " + bounder);
		System.out.println("\n=======================\n");

		// Tạo ra số thực ngẫu nhiên

		//
		float decimalNumber = rd.nextFloat();
		System.out.println("decimalNumber: " + decimalNumber);

		// [0.0,20) -->
		float upperBoundF = rd.nextFloat() * 20;
		System.out.println("upperBoundF: " + upperBoundF);

		// [a,b) --> [5,22)
		float boundNumberF = 5 + rd.nextFloat() * 17;
		System.out.println("boundNumberF: " + boundNumberF);
		
		//Làm tròn
		//BigDecimal bd = new BigDecimal.valueOf(decimalNumber)
			//					.setScale();
		
		System.out.println("\n=======================\n");
		

		// Tạo ra 1 giá trị boolean ngẫu nhiên --> true | false
		

	}
}
