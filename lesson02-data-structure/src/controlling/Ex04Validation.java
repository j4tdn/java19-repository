package controlling;

import java.util.Scanner;

public class Ex04Validation {
	public static void main(String[] args) {
		// nhập số nguyên
		//ip.NextInt() --> trôi lệnh
		//Integer.pareseInt(ip.nextLine()) --> ko bị trôi lệnh
		
		//Yêu cầu: nhập vào số Nguyên n
		//user: nhập chữ, ký tự đặc biệt
		
		Scanner ip = new Scanner(System.in);
		String text = "";
		do {
			System.out.println("Enter Integer number: ");
			text = ip.nextLine();
		} while (!isValidNumber(text));
		
		int n = Integer.parseInt(text);
		System.out.println("Enter success!! --> n = " + n);

		System.out.println(isPrime(n)? n+ " is a prime number": n + " is not a prime number");

	}
	// check validation, is a number?
	//15   -->  ok
	//fdsg -->  fail

	private static boolean isValidNumber(String input) {
		if (input.length() == 0) {
			return false;
		}
		for (int i = 0; i < input.length(); i++) {
//			if (input.charAt(i) < '0' || input.charAt(i) > '9') {
			if (!Character.isDigit(input.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	//kiem tra so nguyen to
	private static boolean isPrime(int input) {
		boolean isPrime = true;
		for (int i = 2; i <= input/2; i++) {
			if (input % i == 0) {
				return false;
			}
		}
		return true;
	}
}
