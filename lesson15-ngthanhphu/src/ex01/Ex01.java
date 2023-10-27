package ex01;

import java.math.BigDecimal;
import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		
		while (true) {
		      System.out.print("Enter element: ");
		      BigDecimal element = scanner.nextBigDecimal();
		      if (getDecimalPart(element).compareTo(BigDecimal.ZERO) == 0) {
		        System.out.println(element + " is not a float number !!!");
		        System.out.println("You need to enter again!");
		        count++;
		        if (count > 3) {
		          System.out.println("Entered incorrectly more than 3 times. End program.");
		          return;
		        }
		      
		        continue;
		      }
		      else {
		    	  System.out.println(element + " has fraction = " + getMinFract(element));
		      }
		}     
		
	}
	
	private static BigDecimal getDecimalPart(BigDecimal value) {
		int intPart = value.intValue(); 
		return value.subtract(bd(intPart));
	}
	
	private static String getMinFract(BigDecimal element) {
		String[] tokens = element.toString().split("\\.");
		int intPart = Integer.parseInt(tokens[0]);
		int decPart = Integer.parseInt(tokens[1]);
		int decPartAmount = tokens[1].length();
		int numerator = intPart * (int)Math.pow(10, decPartAmount) + decPart;
		int denominator = (int)Math.pow(10, decPartAmount);
		int gcd = gcd(numerator, denominator);
		return (numerator/gcd) + "/" + (denominator/gcd);
	}
	
	private static int gcd(int a, int b) {
		while(a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}
	
	private static BigDecimal bd(double value) {
		return BigDecimal.valueOf(value);
	}
	
}
