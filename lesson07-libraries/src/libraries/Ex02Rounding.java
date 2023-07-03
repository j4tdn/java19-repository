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
		
		
		DecimalFormat df = new DecimalFormat("#,###.000");
		System.out.println("formatted: " + df.format(result));
		
		BigDecimal x = BigDecimal.valueOf(2.167898654d);
		BigDecimal y = new BigDecimal("3.345562891");
		BigDecimal z = new BigDecimal(2.167); // unused
		
		System.out.println("x --> " + x);
		System.out.println("y --> " + y);
		System.out.println("z --> " + z);
		
		// RoundingMode.HALF_UP --> commercial round
		
		// DECIMAL32 --> 7 (max integer & decimal part)
		// DECIMAL64 --> 16 --> best practice
		// DECIMAL128 --> 34
		BigDecimal r1 = x.add(y, MathContext.DECIMAL64).setScale(5, RoundingMode.UP);
		BigDecimal r2 = x.divide(y, 4, RoundingMode.HALF_UP)
						 .multiply(bd(10))
						 .subtract(bd(2));
		System.out.println("r1 --> " + r1);
		System.out.println("r2 --> " + r2);
	}
	
	private static BigDecimal bd(double value) {
		return BigDecimal.valueOf(value);
	}
}
