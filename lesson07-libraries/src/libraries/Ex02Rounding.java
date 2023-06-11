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
		
		
		/*/
		 * Decimal Format --> khong support tinh toan
		 *  format--> float, double --> string
		 *  --> display
		 *  #: so (nen la phan nguyen) optional
		 *  0: so (nen la phan thap phan) required
		 *  .: ngan cach nhom cua phan thap phan 3,456.23
		 *  ,: ngan cach nhom cua phan nguyen 3,456
		 * 
		 * BigDecimal: vua luu tru vua support ham tinh toan
		 *   --> Wrapper class
		 *        double/float: value + methods
		 *        --> support utility methods add/subtract/divide/multiple/setScale
		 *        
		 * 
		 */
		//RoundingMode.HALF_UP --> commercial round
		
		BigDecimal x = BigDecimal.valueOf(22.16734568d);
		BigDecimal y = new BigDecimal("3.245");
		System.out.println("x --> " + x);
		System.out.println("y --> " +y);
		
		BigDecimal r1 = x.add(y, MathContext.DECIMAL64).setScale(5, RoundingMode.UP);
		BigDecimal r2 = x.divide(r1, 4, RoundingMode.HALF_UP)
		                 .multiply(bd(10))
		                 .subtract(bd(2));
		System.out.println("r1 --> " + r1);
		System.out.println("r2 --> " + r2);

	}
    private static BigDecimal bd (double value) {
    	return BigDecimal.valueOf(value);
    }
}
