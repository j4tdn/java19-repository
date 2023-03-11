package io;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex02RamdomDemo {
	public static void main(String[] args) {
		//A ramdom number
		//Ramdom - Tạo ra 1 số ngẫu nhiên
		
		Random rd = new Random();
		
		//range(phạm vi): [min, max] int --> 4 bytes
		int noRestriction = rd.nextInt();
		System.out.println("noRestriction: " + noRestriction);
		 //range: [0 - N) --> [0, 10)
		int upperBound = rd.nextInt(10); // --> [0, 10)
		System.out.println("upperBound: " + upperBound);
		
		//range: [a-b) --> [6, 24)
		int bounder = 6 + rd.nextInt(18); // a -> b-a
		System.out.println("bounder: " + bounder);
		
		System.out.println("\n---------------\n");
		
		//tạo ra số thực ngẫu nhiên
		
		// [0.0f, 1f)
		float decimalNumber = rd.nextFloat();
		System.out.println("decimalNumber: " + decimalNumber);
		
		// [0.0, 20) -->
		float upperBoundF = rd.nextFloat() * 20;
		System.out.println("upperBoundF: " + upperBoundF);
		
		//làm tròn --> rounding
		//1 --> DecimalFormat
		//2 --> BigDecimal <-- BigDecimal(class) có thuộc tính là value
		//VD: integer --> value --> BigDecimal(value(float, double))
		
		BigDecimal bd = BigDecimal.valueOf(upperBoundF)
				             .setScale(2, RoundingMode.HALF_UP ); // half_up --> commercial round
		System.out.println("reading: " + bd);
		
		// [a, b) --> [5, 22)
		float boundNumber = 5 + (rd.nextFloat() * 17);
		System.out.println("boundNumber: " + boundNumber);
		
		//tạo ra 1 giá trị boolean ngẫu nhiên --> true | false
		boolean boolValue = rd.nextBoolean();
		System.out.println("boolean: " + boolValue);
		
		//ramdom 1 chuỗi ngẫu nhiên trong danh sách 
		
	}

}
