package io;

import java.util.Random;

public class Ex02RandomDemo {

	public static void main(String[] args) {
		// Random- tạo ra một số ngẫu nhiên
		Random rd =new Random();
		// range(phạm vi) : [min,max] int -->
		int noRestriction =rd.nextInt();
		System.out.println("noRestriction:"+noRestriction);
		// range:[o,N)
		int upperBound =rd.nextInt(10);
		System.out.println("upperBound:"+upperBound);
		int bounder=6+rd.nextInt(18);
		System.out.println("bounder:"+bounder);
		//tạo ra số thực ngẫu nhiên
		float decimalNumber=rd.nextFloat();
		System.out.println("decimalNumber:"+decimalNumber);
		//[0.0->20]
		float upperBoundF =rd.nextFloat()*20;
		System.out.println("upperBoundF:"+upperBoundF);
		//làm tròn
		//1. DecimalFormat
		//2.BigDecimal
		// scale : làm trong mấy số
		
		//[5-->22]
		float boundNumberF = 5+rd.nextFloat()*17;
		System.out.println("boundNumberF:"+boundNumberF);
		// tạo ra một giá trị boolean ngẫu nhiên
		boolean booleanValue = rd.nextBoolean();
		System.out.println("booleanValue:"+booleanValue);
		//random chuỗi

	}

}
