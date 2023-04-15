package io;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex02RandomDemo {
      public static void main(String[] args) {
		//Random - Tạo ra 1 số ngẫu nhiên
    	//A random number
    	  
    	  Random rd = new Random();
    	// range (phạm vi): [min, max]int --> 4 byte 
    	  int noRestriction = rd.nextInt();
    	  System.out.println("noRestriction: " + noRestriction);
	    // range: [0 - N) ---> [0, 10)
    	// From a(inclusive)[to b(exclusive))
    	  int upperBound = rd.nextInt(10);
    	  System.out.println("upperBound: " + upperBound);
    	 // range:[a-b)--> [6, 24)
    	  int bounder = 6 + rd.nextInt(18);// a -> b-a
    	  System.out.println("bounder: " + bounder);
    	  
    	  //\n break line
    	  System.out.println("\n================\n");
    	  
    	  
    	  //Tạo ra số thực ngẫu nhiên
    	  float decimalNumber = rd.nextFloat();
    	  System.out.println("decimalNumber: " + decimalNumber);
    	  
    	  // [0.0f, 1f)
    	  float decimalNumber1 = rd.nextFloat();
    	  System.out.println("decimalNumber1: " + decimalNumber1);
    	  
    	  //[0.0, 20)
    	  float upperBoundF = rd.nextFloat() * 20;
    	  System.out.println("upperBoundF: " + upperBoundF);
    	  
          //Làm tròn --> rounding
    	  //1 --> DecimalFormat
    	  //2 --> BigDecimal :BigDecimal(class) có thuộc tính là value
    	  //VD: Integer --> value --> BigDecimal(value(float, double))
    	  // scale: làm tròn mấy số
    	  // rounding mode : chế độ làm tròn
    	  BigDecimal bd = BigDecimal.valueOf(upperBoundF)
    			              .setScale(2, RoundingMode.HALF_UP);//half_up --> commercial round
    	  System.out.println("rounding: " + bd);
    	   
    	  
    	  
    	  //[a, b) --> [5, 22)
    	  float boundNumberF = 5 + (rd.nextFloat() * 17);
    	  System.out.println("boundNumberF: " + boundNumberF);
    	  
          // Tạo ra 1 giá trị boolean ngẫu nhiên --> true/ false
    	  boolean boolValue = rd.nextBoolean();
    	  System.out.println("boolValue: " + boolValue);
    	  
    	  // Random 1 chuỗi (phần tử) ngẫu nhiên trong danh sách
     }
}
