package io;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex01RandomDemo {
	public static void main(String[] args) {
		//A random number
		//Random - Tạo ra 1 số ngẫu nhiên
		
		Random rd = new Random();
		
		System.out.println("\n=======================\n");
		
		//range(phạm vi ) : [min, max] int -->4 bytes
		
		int noRestriction = rd.nextInt();
		
		System.out.println("noRestriction " + noRestriction);
		
		//range : [0 - N] -->[0,10)
		//From a(inclusive)[ to b(exclusive) 
		
		int upperBound = rd.nextInt(10); // --> [0,10)
		System.out.println("upper " + upperBound);
		
		//range : [a-b)  -->[6,24)
//		int bounder = rd.nextInt(6,24); // chưa chắc
		int bounder = 6 + rd.nextInt(18);
		System.out.println("bounder " + bounder);
		
		
		System.out.println("\n=======================\n");
		
		//Tạo ra số thwucj ngẫu nheien
		float decimalNumber = rd.nextFloat();
		System.out.println("decimalNumber : " + (float)Math.round(decimalNumber*100)/100);
		
		//[0.0 , 20)
		float upperBoundF = 20 * rd.nextFloat();
		System.out.println("upperBoundF : " + upperBoundF);
		
		//[a,b)
		float boundNumber = 5 + 17 * rd.nextFloat();
		System.out.println("boundNumber : " + boundNumber);
		
		//Tạo ra 1 giá trị boolean ngẫu nhiên -->true | false
		
		BigDecimal bd= BigDecimal.valueOf(upperBoundF)
				.setScale(2,RoundingMode.HALF_UP);
		
		System.out.println("rounding : " + bd);
		
		boolean boolValue = rd.nextBoolean();
		System.out.println("boolValue : " + boolValue);
		
		//Random 1 chuỗi(phần tử) ngẫu nhiên trong 1 danh sách
		
		
		
	}
}
