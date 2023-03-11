package view;

import java.util.Scanner;

public class Ex01MultiplesOf2 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String text = "";
		int ipAgain = 1;
		do {
			
			System.out.println("Input number (valid): ");
			text = ip.nextLine();
			
			if(!isValidNumber(text)) {
				if(ipAgain == 5) {
					System.out.println("You input failed 5 times, exit program!!!");
					System.exit(0);
				}
				System.out.println("number is not valid, input again~~~");
				ipAgain++;
			} else break;
		} while(true);
		
		System.out.print("Number is valid ==>  ");
		
		int n = Integer.parseInt(text);
			
		if(n % 2 == 0) {
			System.out.println(n + " is multiplier of 2");
		} else {
			System.out.println(n + " not is multiplier of 2");
		}

		
	}

	private static boolean isValidNumber(String input) {
		int textLength = input.length();
		if (textLength == 0) {
			return false;
		}
		for (int i = 0; i < textLength; i++) {
			char letter = input.charAt(i);
			if (!Character.isDigit(letter)) {
				return false;
			}
		}
		return true;

	}
}
