package libraries;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Ex02Rounding {
	
	public static void main(String[] args) {
		double a = 13d;
		double b = 6d;
		double result = a/b;
		result = 2.25d;
		System.out.println("result: " + result); 
		
		// #,###.###
		// 2.1666666666666665 --> 2.167
		// 234.166666666666666d --> 234.167
		// 5672234.166666666666666d --> 5,672,234.167
		// 2.25 --> 2.25
		
		// #,###.000
		// 2.1666666666666665 --> 2.167
		// 2.25 --> 2.250
		
		DecimalFormat df = new DecimalFormat("#,###.000");
		System.out.println("formatted: " + df.format(result));
		
		/*
		 DecimalFormat:
		 	--> float, double --> string
		 	--> display
		 	#: số(optional)
		 	0: số(required)
		 	.: ngăn cách nhóm của phần thập phân 3,456.23
		 	,: ngăn cách nhóm của phần nguyên 3,456
		 	
		 	--> khuyến khích
		 	phần nguyên --> #
		 	phần thập phân --> #, 0
		 */
		
		BigDecimal x = BigDecimal.valueOf(2.167898654d);
		BigDecimal y = new BigDecimal("3.345562891");
		BigDecimal z = new BigDecimal(2.167); // unused
		
		System.out.println("x --> " + x);
		System.out.println("y --> " + y);
		System.out.println("z --> " + z);
		
		BigDecimal r1 = x.add(y, MathContext.DECIMAL64).setScale(5, RoundingMode.UP);
		BigDecimal r2 = x.divide(y, 4, RoundingMode.HALF_UP)
						 .multiply(bd(10))
						 .subtract(bd(2));
		System.out.println("r1 --> " + r1);
		System.out.println("r2 --> " + r2);
		
		/*
		 BigDecimal:
	     --> Wrapper class
	          double/float: value + methods
	     --> support utility methods add/subtract/divide/multiple/setScale
	     
	     RoundingMode.HALF_UP --> commercial round
		 DECIMAL32 --> 7 (max integer & decimal part)
		 DECIMAL64 --> 16 --> best practice
		 DECIMAL128 --> 34
		  
		 */
	}
	
	private static BigDecimal bd(double value) {
		return BigDecimal.valueOf(value);
	}
}
