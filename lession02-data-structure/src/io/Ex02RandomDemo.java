package io;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex02RandomDemo {

	public static void main(String[] args) {
		//Random 1 số ngẫu nhiên
		
		Random rd = new Random();
		
		//range: [min,max] int --> 4 bytes
		int noRestriction = rd.nextInt(); //min int .. max int
		System.out.println("noRestriction: " + noRestriction);
		
		//range [0 - N) --> [0, 10)
		// From a(inclusive) to b(exclusive)
		int upperBound = rd.nextInt(10); // [0, 10)
		System.out.println("upperBound: " + upperBound);
		
		//range [a, b)
		int bounder = 6 + rd.nextInt(18); // a -> (b - a)
		System.out.println("bounder: " + bounder);
		
		// \n break line
		System.out.println("\n ============ \n");
		
		//Tạo số thực ngẫu nhiên
		// [0.0f, 1f)
		float decimalNumber = rd.nextFloat();
		System.out.println("decimalNumber: " + decimalNumber);
		
		// [0.0f, 20f)
		float upperBoundF = rd.nextFloat() * 20;
		System.out.println("upperBoundF: " + upperBoundF);
		
		//Làm tròn (rounding)
		// 1 --> DecimalFormat
		// 2 --> BigDecimal <-- BigDecimal(class) có thuộc tính value
		// vd: 
		//scale: làm tròn mấy số
		//rounding mode: chế độ làm tròn
		BigDecimal bd = BigDecimal.valueOf(upperBoundF)
				.setScale(2, RoundingMode.HALF_UP);
		System.out.println("rounding: " + bd);
		
		// [a, b) --> [5, 20)
		float boundNumberF = 5 + (rd.nextFloat()*17);
		System.out.println("boundNumberF: " + boundNumberF);
		
		// Tạo ra 1 giá trị boolean ngẫu nhiên --> true|false
		boolean boolValue = rd.nextBoolean();
		System.out.println("boolValue: " + boolValue);
		
		//Random 1 chuỗi(phần tử) ngẫu nhiên trong danh sách
		
		
		
	}

}
