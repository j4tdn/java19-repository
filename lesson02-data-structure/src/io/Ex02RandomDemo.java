package io;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex02RandomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A random number
		// Random - Tạo 1 số ngẫu nhiên

		Random rd = new Random();

		// range(phạm vi) : [min, max] int --> byte
		int noRestriction = rd.nextInt(); // min int --> max int
		System.out.println("noRestriction:" + noRestriction);

		// range: [0 -N] -->[0, 10)
		// From a(inclusive)[ to b(exclusive))
		int upperBount = rd.nextInt(10); // -->[0, 10)
		System.out.println("upperBount:" + upperBount);

		// range: [a-b] -->[6, 24)
		int bounder = 6 + rd.nextInt(18);
		System.out.println("bounder:" + bounder);

		System.out.println("\n===========================\n");

		// Tạo ra số thực ngẫu nhiên
		// [0.0f, 1f)
		float decimalNumber = rd.nextFloat();
		System.out.println("decimalNumber:" + decimalNumber);

		// [0.0f, 20)
		float upperBoundF = rd.nextFloat() * 20;
		System.out.println("upperBoundF:" + upperBoundF);
		
		// LÀM TRÒN -- rounding
		//1. --> DecimalFormat
		//2. --> BigDecimal <-- BigDicimal(class) có thuộc tính là value
		//VD: Integer -->Value --> BigDecimal(Value(float, double))
		//scale: làm tròn mấy số
		//rounding mode: chế độ làm tròn
		
		BigDecimal bd = BigDecimal.valueOf(upperBoundF)
				.setScale(2, RoundingMode.HALF_UP); //HALF_UP --> công thức chính xác
		System.out.println("BigDecima: " +upperBoundF);

		// [5, 23)
		float boundNumberF = 5 + (rd.nextFloat() * 18);
		System.out.println("boundNumberF:" + boundNumberF);
		
		//Tạo ra 1 giá trị boolean ngẫu nhiên --> true|false
		boolean boolValue = rd.nextBoolean();
		System.out.println("booleanValue:" +boolValue);
		
		//Random 1 chuỗi phần tử ngẫu nhiên trong danh sách

	}

}
