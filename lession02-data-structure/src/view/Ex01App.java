package view;

import java.math.BigDecimal;

public class Ex01App {
	public static void main(String[] args) {
		System.out.print("Cheers from JAVA19 class");
		
		BigDecimal b1 = new BigDecimal("0.0000000");
		System.out.println("b1 --> " + b1);
		
		System.out.println("equals zero : " + (b1.compareTo(BigDecimal.ZERO) ==0));	
		}
}
