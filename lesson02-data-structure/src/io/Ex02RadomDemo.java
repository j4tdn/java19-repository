package io;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex02RadomDemo {
	public static void main(String[] args) {
		//A Radom number
		//Random - Tạo ra 1 số ngẫu nhiên
		
		Random rd = new Random();
		//range(phạm vi): [min, max]int --> 4 byte
		
		int noRestriction = rd.nextInt();// từ min của int --> max của int
		System.out.println("noRestriction: " + noRestriction );
		
		
		//range: [0 -> N) - [0,10)
		// From a(inclusie)[ to b(exclusie))
		int upperBound = rd.nextInt(10); // --> [ 0 ,10)
		
		//range: [a-b) --> [ 6,21)
		int bounder = 6 + rd.nextInt(18);// a -> b-a
		System.out.println("upperBound: " + upperBound);
		System.out.println("bounder: " + bounder);
		
		 
		// n\ break line
		System.out.println("\n====================");
		
		// tạo ra số thực ngẫu nhiên
		
		//[0.0f - 1.0f)
		
		float decimalNumber = rd.nextFloat();
		System.out.println("decimalNumber: " +decimalNumber);
		
		// [0.0,20)
		
		float upperBoundF = rd.nextFloat() * 20;
		System.out.println("upperBoundF: " + upperBoundF);
		
		//làm tròn -- rouding
		//1 -> DecimalFomat
		//2 ->BigDecimal <-- BigDecimal thuộc tính của value
		//VD:  Integer --> Value --> BigDecimal(Value, Double);
		//scale : làm tròn nhiêu số
		//rounding mode: chế độ làm tròn
		
		
		BigDecimal bd = BigDecimal.valueOf(upperBoundF)
				             .setScale(2,RoundingMode.HALF_UP);//half_up--> commercial round
		System.out.println("rounding: " + bd);
		 
		//range: [a - b) -> [5,22)
		
		float NumberBoundF = 5 + (rd.nextFloat() *17);
		System.out.println("NumberBoundF: " + NumberBoundF);
		
		System.out.println("\n============");
		
		// Tạo ra 1 giá trị boolean ngẫu nhiên : true || false
		boolean boolvalue = rd.nextBoolean();
		System.out.println("boolvalue " + boolvalue);
		
		//random 1 chuổi(phần tử) ngẫu nhiên trong danh sách
		
		
		
		
		
		
		
	}

}
