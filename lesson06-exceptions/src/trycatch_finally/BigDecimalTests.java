package trycatch_finally;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTests {
	public static void main(String[] args) {
		double v1 = 23.872301832d;
		System.out.println("b1 --> " + BigDecimal.valueOf(v1));
		System.out.println("b2 --> " + new BigDecimal(String.valueOf(v1)));
	
		System.out.println("\n");
		
		// This is fine, remember that using the constructor of BigDecimal 
		// to declare a value can be dangerous when it's not of type String. 
		// Consider the below...
		
		double v2 = 23.8723d;
		System.out.println("b1 --> " + BigDecimal.valueOf(v2));
		System.out.println("b2 --> " + new BigDecimal(String.valueOf(v2)));
		System.out.println("b3 --> " + new BigDecimal(v2)); // 23.872299999999999187
		
		System.out.println("\n");
		
		System.out.println("iv1 --> " + BigDecimal.valueOf(1.22).intValue());
		System.out.println("iv2 --> " + BigDecimal.valueOf(1.82).intValue());
		
		System.out.println("\n");
		
		System.out.println("lv1 --> " + BigDecimal.valueOf(1.22).setScale(0, RoundingMode.HALF_UP).longValue());
		System.out.println("lv2 --> " + BigDecimal.valueOf(1.82).setScale(0, RoundingMode.HALF_UP).longValue());
	}
}
