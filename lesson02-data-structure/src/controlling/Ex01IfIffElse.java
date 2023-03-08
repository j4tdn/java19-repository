package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex01IfIffElse {
	public static void main(String[] args) {
		Random rd = new Random();
		int n = rd.nextInt(12);
		System.out.println("Value of n is : " + n);
		
		//if(isEven)  --> nhận biến
		//if(n % 2 == 0) --> nhận biểu thức
		//if(isEven()) --> nhận hàm
		
		if(isEven(n)) {
			System.out.println("n is a even number");
		}
		
		System.out.println("=========================");
		
		String password = "curtis123";
		int length = password.length();
		if(length >= 8) {
			System.out.println("password valid");
		}else {
			System.out.println("password with at least 8 characters, please enter again!");
		}
		
		BigDecimal avgPointBd = BigDecimal.valueOf(rd.nextFloat() * 10).setScale(1,RoundingMode.HALF_UP);
		float avgPoint = avgPointBd.floatValue();
		System.out.println("avgPoint : " + avgPoint);
		
		if(avgPoint < 5) {
			System.out.println("Học lực yếu");
		}else if(avgPoint < 6.5) {
			System.out.println("Học lực trung bình");
		}else if(avgPoint < 8.0) {
			System.out.println("Học lực khá");
		}else {
			System.out.println("Học lực giỏi");
		}
		
		System.out.println("======================================");
		
		System.out.println("End program");
		
	}
	private static boolean isEven(int input) {
		return input % 2 == 0;
	}
}
