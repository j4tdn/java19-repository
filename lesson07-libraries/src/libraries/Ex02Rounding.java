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
		result = 234.16666666666666d; //234.167
		result = 5672234.16666666666666d; //5,672,234.167
		System.out.println("result --> " + result);
		
		DecimalFormat decimalFormat = new DecimalFormat("#,###.###");
		System.out.println(decimalFormat.format(result));
		
		
		
		/*
		 * DecimalFormat:
		 * -->float,double ---> String (display)
		  #: phan nguyen
		  0: phan thap phan
		  ,: ngan cach phan nguyen
		  ."phan cach phan thap phan
		  
		 * BigDecimal:
		 * -->Wrapper class
		 * 		double/float: value + methods
		 * --> support utility methods add/subtract/setScale
		 */
		
		BigDecimal x = BigDecimal.valueOf(22.167d);
		BigDecimal y = new BigDecimal("3.345");
		BigDecimal z = new BigDecimal(2.167);// chu y
		
		System.out.println("x --> " + x);
		System.out.println("y --> " + y);
		System.out.println("z --> " + z);
		
		BigDecimal result1 = x.add(y, MathContext.DECIMAL64)
				.setScale(5, RoundingMode.HALF_UP);
		
		BigDecimal result2= x.divide(y, 4 , RoundingMode.HALF_UP)
							.multiply(bd(10))
							.subtract(bd(2));
		
		
		System.out.println("result1 --> " + result1);
		System.out.println("result2 --> " + result2);
		
	}
	
	private static BigDecimal bd(double value) {
		return BigDecimal.valueOf(value);
	}
}
