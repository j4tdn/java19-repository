package io;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex02RandomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// random - tao ra 1 so ngau nhien
		Random rd = new Random();
		
		// range (pham vi): [min, max] int
		int noRestriction = rd.nextInt();
		System.out.println("noRestriction: " + noRestriction);
		
		// range: [0, N] --> 0 --> 10
		// from a(inclusive)[ to b(exclusive) )
		int upperBound = rd.nextInt(10); // --> [0,10)
		System.out.println("upperBound: " + upperBound);
		
		//range: [a-b) --> [6, 24)
		int bounder = 6 + rd.nextInt(18); // a --> b - a
		System.out.println("bounder: " + bounder);
		
		// \n break line: xuong hang
		System.out.println("\n===============\n");
		
		System.out.println(rd.nextFloat());
		
		float boundNumberF = 5 + 17*rd.nextFloat();
		System.out.println(boundNumberF);
		
		// làm tròn --> rounding
		// 1 --> DecimalFormat
		// 2 --> BigDecimal <-- BigDecimal (class) có thuộc tính là value
		// vd: Integer --> value --> BigDecimal(value(float, double))
		// scala: làm tròn mấy số
		// rounding mode: chế độ làm tròn
		BigDecimal bd = BigDecimal.valueOf(boundNumberF).setScale(2, RoundingMode.HALF_UP);
		System.out.println("rounding: " + bd);
		
		// tạo ra 1 giá trị boolean ngẫu nhiên --> true | false
		boolean boolValue = rd.nextBoolean();
		System.out.println(boolValue);
		
		// random một chuỗi ngẫu nhiên trong danh sách
	}

}
