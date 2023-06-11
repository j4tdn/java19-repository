package libraries;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Ex02Rounding {
	public static void main(String[] args) {
		double a = 13d;
		double b = 6d;

		double result = a / b;

		System.out.println("result --> " + result); // 2.1666666666666665

		// "#,###.###"
		// 2.1666666666666665 --> 2.167
		// 234.166666666666666d --> 234.167
		// 5672234.166666665666666d --> 5,672,234.167

		DecimalFormat df = new DecimalFormat("#,###.###");

		System.out.println("formatted --> " + df.format(result));

		/*
		 * DecimalFormat: - float, double -> String --> display
		 * 
		 * #: số (nên là phần nguyên) 0: phần thập phân .: phần ngăn giữa phần nguyên và
		 * phần thập phân (required) ,: phần ngăn nhóm của phần nguyên
		 * 
		 * 
		 * BigDecimal: --> wrapper class double/float: value + methods --> support
		 * utility methods add/subtract/divide/muiltiple/setScale...
		 */

		BigDecimal x = BigDecimal.valueOf(22.167d);
		BigDecimal y = new BigDecimal("3.345");
		BigDecimal z = new BigDecimal(2.167); // unused
		
		System.out.println("x --> " + x);
		System.out.println("y --> " + y);
		System.out.println("z --> " + z);
		
		BigDecimal r1 = x.add(y, MathContext.DECIMAL64).setScale(5,RoundingMode.HALF_UP);
		BigDecimal r2 = x.divide(y,4, RoundingMode.HALF_UP)
								.multiply(bd(10))
								.subtract(bd(2));
		
		
		System.out.println("r1 --> " + r1);
		System.out.println("r2 --> " + r2);
		
		
		

	}
	private static BigDecimal bd(double value) {
		return BigDecimal.valueOf(value);
	}
}
