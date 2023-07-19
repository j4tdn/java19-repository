package view.test02;

import java.util.Random;

public class Ex02HappyNumber {
	public static void main(String[] args) {
		
		int number = new Random().nextInt(10,100);
		
		System.out.println("is " + number + " a happy number --> " + isHappyNumber(number));
	}
	
	private static boolean isHappyNumber(int number) {
		
		while(true) {
			
			if(number == 1) {
				return true;
			}
			
			number = sumOfSquare(number);
			if (count++ ==20) {
				return false;
			}
		}
		
		
	}
	
	//123 = 1^2 + 2^2 + 3^2
	private static int sumOfSquare(int number) {
		int sum = 0;
		String numberAsString = String.valueOf(number);
		
		for (int i = 0; i < numberAsString.length(); i++ ) {
			int digit = Integer.parseInt(numberAsString.charAt(i) + "");
			sum = sum + digit* digit;
		}
		
		return sum;
	}
		
	
	
}
