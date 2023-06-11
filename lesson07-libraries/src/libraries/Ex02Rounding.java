package libraries;

import java.text.DecimalFormat;

public class Ex02Rounding {
	public static void main(String[] args) {
		double a = 13d;
		double b = 6d;
		double result = a/b;
		System.out.println("result: " + result);
		
		DecimalFormat df = new DecimalFormat("#,###.###");
		System.out.println("formatted: " + df.format(result));
		
		/**
		 * DecimalFormar:
		 *  --> float, double --> string
		 *  --> display
		 *  #: so
		 *  0: so
		 *  .: ngan cach nhom cua phan thap phan 3.456.23
		 *  ,: ngan cach nhom cua phan nguyen 3,345
		 *  
		 *   --> khuyen khich
		 *   	Phan nguyen --> #
		 *  
		 * BigDecimal
		 *  --> Wrapper class
		 *  		double/float: value + methods
		 *  	--> support utility methods add/subtract/divide/multiple/setScale
		 */
	}
}
