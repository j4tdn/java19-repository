package io;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex02RandomDemo {
public static void main(String[] args) {
	// Random tạo ra một số ngẫu nhiên
	Random rd = new Random();
	
	int noRestriction = rd.nextInt();
	System.out.println("noRestriction: " + noRestriction);
	int upperBound = rd.nextInt(10); //->[0, 10)
	System.out.println("upperBound: " + upperBound);
	int bounder = 6 + rd.nextInt(18);
	System.out.println("bounder: " + bounder);
	
	System.out.println("\n===========\n");
	// Tạo ra số thực ngẫu nhiên
	
	//[0.0f, 1f)
	float decimalNumber = rd.nextFloat();
	System.out.println("decimalNumber: " + decimalNumber);
	
	//[0.0, 20)
	float upperBoundf = rd.nextFloat() * 20;
	System.out.println("upperBound: " + upperBoundf);
	// Làm tròn -> rounding
	// 1. Decimal
	BigDecimal bd = BigDecimal.valueOf(upperBoundf)
	                   .setScale(2, RoundingMode.HALF_UP);
	// [a, b) -> [5, 22)
	float boundNumberf = 5 + (rd.nextFloat() * 17);
	System.out.println("boundNumberf: " + boundNumberf);
	
	// Tạo ra một giá trị boolean ngẫu nhiên
	boolean boolValue = rd.nextBoolean();
	System.out.println("boolValue: " + boolValue);
	
}
}
