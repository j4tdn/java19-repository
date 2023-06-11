package librearies;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Ex02Rouding {
	public static void main(String[] args) {
		double a = 13d;
		double b = 6d;
		
		double result = a/b;
		
		result = 2.25d;
		System.out.println("result : " + result); 
		
		// #,###.###
		// 2.1666666666666665 --> 2.167
		// 234.1666666666666665 --> 234.167
		// 5567345.1666666666665 --> 5,567,345.167
		// 2.25 --> 2.25
		
		// #,###.000
		// 2.1666666666666665 --> 2.167
		// 2.25 --> 2.250
		
		DecimalFormat fm = new DecimalFormat("#,###.000");
		
		System.out.println("formated : " + fm.format(result));
		
		/**
		 * Decimal : 
		 * 	--> float, double --> string
		 * 	--> display
		 * 	
		 * 	# : số (optional)
		 * 	0 : số (required)
		 * 	. : ngăn cách nhóm của phần thập phân 3,456.23
		 * 	, : ngăn cách nhóm của phần nguyên : 3,456
		 * 
		 * 	--> khuyến khích : 
		 * 	phần nguyên  --> #
		 * 
		 * BigDecimal : 
		 * 	--> Wrapper class
		 * 			double/float : value + methods
		 * 			--> support utility methods add/subtract/divide/multiple/setScale
		 * 
		 * 
		 * */
		
		BigDecimal x = BigDecimal.valueOf(22.1673456d);
		BigDecimal y = new BigDecimal("13.34545432");
		BigDecimal z = new BigDecimal(2.167); // unused
		
		System.out.println("x -- > " + x);
		System.out.println("y -- > " + y);
		System.out.println("z -- > " + z);
		
		// DECIMAL32 --> 7 (max integer & decimal part)
		// DECIMAL64 --> 16 --> best practice
		// DECIMAL128 --> 34
		BigDecimal r1 = x.add(y,MathContext.DECIMAL64).setScale(5,RoundingMode.HALF_UP);
		BigDecimal r2 = x.divide(y,4,RoundingMode.UP)
							.multiply(bd(10))
							.subtract(bd(2))
							;
		System.out.println("r1 --> " + r1);
		System.out.println("r2 --> " + r2);
		
	}
	
	private static BigDecimal bd(double value) {
		return BigDecimal.valueOf(value);
	}
}
