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
		System.out.println(result);
		DecimalFormat df = new DecimalFormat("#,###.###");
		System.out.println("formatted: "+ df.format(result));
		
		
		/**
		 decimalFormat
		 	--> float, double --> string--> hiển thị lên display
		 	#: luôn đại diện cho phần nguyên
		 	0: phần thập phân
		 	.: ngăn cách nhóm của phần thập phân
		 	,: ngăn cách phần nguyên
		 	ex: 3,456.789
		 	
		 bigdecimal=:
		 	double/float: value + method
		 	--> support utility method add/sub/div/mul
		 */
		BigDecimal x = BigDecimal.valueOf(22.1675632156451d);
		BigDecimal y = new BigDecimal("3.34545345321353");
		BigDecimal z = new BigDecimal(2.356);
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		BigDecimal r1 = x.add(y, MathContext.DECIMAL32);
		BigDecimal r2 = x.divide(y, 4, RoundingMode.HALF_UP).multiply(BigDecimal.valueOf(10)).subtract(BigDecimal.valueOf(2));
		System.out.println(r1);
		
	}

}
