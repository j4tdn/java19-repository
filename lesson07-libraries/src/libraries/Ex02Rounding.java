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
		System.out.println("result: " + df.format(result));

		
		/*
		 #,###.###
		 22222.1111 -->22,222.111
		 #,###.00000
		 22222.1111 -->22,222.11110
		 	DecimalFormat:
		 	--> float, double --> string
		 	- #: số (đại diện cho phần nguyên)
		 	- 0: số (đại diện cho phần thập phân)
		 	- .: ngăn cách nhóm của phần thập phân
		 	- ,: ngăn cách nhóm của phần nguyên
		 	
		 	BigDecimal
		 	-> Lớp bao bọc
			double/float: giá trị + phương thức
			-> hỗ trợ các phương thức tiện ích cộng/trừ/chia/bội số/setScale
		 */
		
		BigDecimal x = BigDecimal.valueOf(2.162323232d);
		BigDecimal y = new BigDecimal("3.3121121");
		BigDecimal z = new BigDecimal(2.1777);
		
		System.out.println("x: " + x); //x: 2.162323232
		System.out.println("y: " + y); //y: 3.3121121
		System.out.println("z: " + z); //z: 2.177700000000000191135995919466949999332427978515625
		
		//DECIMAL32 --> 7
		//DECIMAL64 --> 16
		//DECIMAL128 --> 34
		BigDecimal r1 = x.add(y, MathContext.DECIMAL32).setScale(5, RoundingMode.UP);
		BigDecimal r2 = x.divide(y, 4, RoundingMode.HALF_UP);
//				.multiply(bd(10)) //BigDecimal.valueOf(10);
//				.subtract(bd(2));
		
		System.out.println("r1: " + r1); //5.474435
		System.out.println("r2: " + r2); //5.474435
	}
	
	private static BigDecimal bd(double value) {
		return BigDecimal.valueOf(value);
	}
	

}
