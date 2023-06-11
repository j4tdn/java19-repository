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
		System.out.println("result: " + result);
		
		DecimalFormat df = new DecimalFormat("#,###.###");
		System.out.println("formatted: " + df.format(result));
		
		/*
		 DeciamlFormat: chỉ dùng để hiển thị 
		 	input: float, double | output: string
		 	
		 	#: số(nên phần nguyên)
		 	): số(phần thập phân) 
		 	.: ngăn cách nhóm của phần thập phân 3,456.23 
		 	,: ngăn cách nhóm phân nguyên 3,456
		 	
		 	
		 BigDecimal:
		 	--> wrapper class
		 */
		
		BigDecimal x = BigDecimal.valueOf(22.167); // Cách 1
		BigDecimal y = new BigDecimal("3.345"); // Cách 2
		BigDecimal z = new BigDecimal(2.167); // unused
		
		
		System.out.println("x --> " + x);
		System.out.println("y --> " + y);
		System.out.println("z --> " + z);
		
		BigDecimal r1 = x.add(y, MathContext.DECIMAL64).setScale(5, RoundingMode.UP);
		BigDecimal r2 = x.divide(y, 4, RoundingMode.HALF_UP).multiply(bd(10)).subtract(bd(2));
		
		
		
	}
	private static BigDecimal bd(double value) {
		return BigDecimal.valueOf(value);
	}
}
