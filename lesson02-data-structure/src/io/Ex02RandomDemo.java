package io;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex02RandomDemo {
	public static void main(String[] args) {
		//Random - tạo ra 1 số ngẫu nhiên
		// a random number
		
		Random rd = new Random();
		
		//range: [min,max] of int --> 4byte 
		
		int noRestriction = rd.nextInt();
		System.out.println("noRestricton: " + noRestriction);
		
		//range: [0 - N) --> [0,10) --> inclusive 0, exclusive 10
		int upperBound = rd.nextInt(10);
		System.out.println("upperBound: " + upperBound);
		
		//range: [a,b) --> [6,24)
		int bounder = 6 + rd.nextInt(18);
		System.out.println("bounder: " + bounder);
		
		System.out.println("\n=================\n");
		
		//create random double number
		//[0.0f,1f)
		float decimalNumber = rd.nextFloat();
		System.out.println("decimalNumber:" + decimalNumber );
		
		//[0.0f,20) 
		float upperBoundF = rd.nextFloat()*20;
		System.out.println("upperBoundF: " + upperBoundF);
		
		//rounding: BigDecimal,DecimalFormat
		BigDecimal bd = BigDecimal.valueOf(upperBoundF)
				.setScale(2,RoundingMode.HALF_UP);//commercial round
		
		//[a,b)--> [5,22)
		float boundNumberF = 5 + rd.nextFloat()*17;
		System.out.println("boundNumberF: " + boundNumberF);
		
		//create a boolean --> true,false
		boolean boolValue = rd.nextBoolean();
		System.out.println("boolValue: " +  boolValue);
		
		//Random a String, element in list
		
		
	}
}
