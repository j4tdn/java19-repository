package io;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex02RandomDemo {
	public static void main(String[] args) {
		// A random number
		//Random - Tạo ra 1 số ngẫu nhiên
		
		Random rd = new Random();
		
		//range(phạm vi): [min,max] int --> 4 bytes
		int noRestriction = rd.nextInt();
		System.out.println("noRestriction: " + noRestriction);
	
		// range: [0 - N) --> [0,10)
		//From a(inclusive)[ to b(exclusive)
		int upperBound = rd.nextInt(10); //--> [0,10)
		System.out.println("upperBound: " + upperBound);
		//range: [a-b) --> [6,24)
		int bounder = 6 + rd.nextInt(18);// a -> b - a
		System.out.println("bounder: " + bounder);
		
		//\n break line: xuống hàng
		System.out.println("\n=============\n");
		
		// Tạo ra số thực ngẫu nhiên
		
		//[0.0f, 1f)
		float decimalNumber = rd.nextFloat();
		System.out.println("decimalNumber : " + decimalNumber);
		
		//[0.0, 20) -->
		float upperBoundF =	rd.nextFloat() * 20;
		System.out.println("upperBound: " + upperBoundF);
		
		//làm tròn --> rouding
		// 1 --> DecimalFormat
		// 2 --> BigDecimal <-- BigDecimal() cos thuộc tính value
		//VD: Integer --> value --> BigDecimal(value(float, double))
		BigDecimal bd = BigDecimal.valueOf(upperBoundF)
							.setScale(2, RoundingMode.HALF_UP);//half_up --> commercial round
		System.out.println("rounding" + bd);
		//
		
		//[a,b)-->[5,22)
		float boundNumberF = 5 + rd.nextFloat()*17;
		System.out.println("boundNumberF :" + boundNumberF);
		
		//Tạo ra 1 giá trị boolean ngẫu nhiên --> true | false
		boolean boolvalue = rd.nextBoolean();
		System.out.println("boolvalue : "+ boolvalue );
		
		//Random 1 chuỗi(phần tử) ngẫu nhiên trong danh sách
		
		
		
	}
}
