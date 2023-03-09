package controling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex01IfIfElse {
	public static void main(String[] args) {
		
		// check number is odd or even number
		Random rd = new Random();
		int n = rd.nextInt(18);
		System.out.println("n value: " + n);
		
		if(isEven(n)) {
			System.out.println("n is even number");
		}
		
		
		// check password is valid or not valid
		String password = "blabla";
		int length = password.length();
		System.out.println("Password length: " + length);
		
		if(length >= 8) {
			System.out.println("password is valid");
		} else {
			System.out.println("password is not valid, input again");
		}
		
		System.out.println("\n=======================\n");
		
		BigDecimal avgPointBd = BigDecimal.valueOf(rd.nextFloat() * 10)
								.setScale(1, RoundingMode.HALF_UP);
		float avgPoint = avgPointBd.floatValue();
		System.out.println("avgPoint: " + avgPoint);
		
		if(avgPoint < 5) {
			System.out.println("Học lực yếu");
		} else if(avgPoint < 6.5) {
			System.out.println("Học lực trung bình");
		} else if(avgPoint < 8) {
			System.out.println("Học lực khá");
		} else if(avgPoint <= 10) {
			System.out.println("Học lực giỏi");
		}
		
		System.out.println("\n=======================\n");
		// thay thế if else bằng toán tử 3 ngôi, nên làm cho TH đơn giản
		String message1st = isEven(n) ? "n is even number" : "";
		System.out.println("VD1: message --> " + message1st);
		
		String message2nd = password.length() >= 8 ? "Password is valed" : "Password is not valid";
		System.out.println("VD2: message --> " + message2nd);
		System.out.println("End program");
	}
	private static boolean isEven(int input) {
		return input % 2 == 0;
	}
}
