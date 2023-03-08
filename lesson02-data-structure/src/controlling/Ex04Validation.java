package controlling;

import java.util.Scanner;

public class Ex04Validation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		System.out.print("Enter a integer number:");
		
		String text = "";
		do {
			System.out.println("Nhập số nguyên n(hợp lệ):");
			text = in.nextLine();
		}while(!isValidNumber(text));
		
		int n = Integer.parseInt(text); 
		System.out.println("Nhập thành công số nguyên là : " + n);
		
	
		System.out.println(isPrime(n) ? "N là số nguyên tố" : "N k phải là số nguyên tố");
	}
	
	private static boolean isPrime(int input) {
		for(int i = 2; i <= input/2; i++) {
			if(input % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean isValidNumber(String input) {
		int textLength = input.length();
		if(textLength == 0) {
			return false;
		}
		for (int i = 0; i < textLength; i++) {
			char letter = input.charAt(i);
			//letter < '0' || letter > '9'
			if(!Character.isDigit(letter)) {
				return false;
			}
		}
		return true;
	}
}
