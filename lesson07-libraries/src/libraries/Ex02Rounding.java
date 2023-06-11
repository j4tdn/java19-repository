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
	result = 2.25;
	System.out.println("result -> " + result);
	
	DecimalFormat fm = new DecimalFormat("#,###.000");
	System.out.println("formatted: " + fm.format(result));
	/*
	 DecimalFormat:
	 -> float, double -> String 
	 -> display
	nên dùng # -> phần nguyên 
	 0: phần thập phân 
	 .: ngăn cách nhóm của phần thập phân
	 ,: ngăn cách nhóm của phần nguyên 3,456
	 
	 BigDecimal:
	 -> Wrapper class 
	  	double/float: value + methods
	  	-> support utility methods add/subtract/divide/multiple/setScale
	 */
	BigDecimal x = BigDecimal.valueOf(2.167d);
	BigDecimal y = new BigDecimal("2.167");
	System.out.println("x -> " + x);
	System.out.println("y -> " + y);
	
	BigDecimal r1 = x.add(y,MathContext.DECIMAL64).setScale(5,RoundingMode.UP);
	BigDecimal r2 = x.divide(y, 4, RoundingMode.HALF_UP)
							.multiply(bd(10))
							.subtract(bd(2));
	
	System.out.println("r1 -> " + r1);
	System.out.println("r2 -> " + r2);
						
	
	
}
private static BigDecimal bd(double value) {
	return BigDecimal.valueOf(value);
}
}
