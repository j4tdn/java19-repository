package homework;

import java.util.Scanner;

public class Ex5 {

	public static boolean checkNumber(String input) {
//		String regex = "\\d+";
		if (input == null || input.isEmpty() || input.length() < 2) {
			return false;
		}
		for (int i = 0; i < input.length(); i++) {
			if (!Character.isDigit(input.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean symmetricalNumber(int n) {
		int reverse = 0;
		int tmp = n;
		while(n != 0) {
			int digit = n % 10;
			reverse = reverse * 10 + digit;
			n /= 10;
		}
		if(reverse == tmp) {
			return true;
		}else {
			return false;
		}	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		int countErr = 0;
		do {
			System.out.println("Enter number: ");
			str = sc.nextLine();
			countErr++;
			if (countErr >= 5) {
				System.out.println("You entered wrong " + countErr + " times");
				return;
			}
			if (!checkNumber(str)) {
				System.out.println("Enter number >= 0: ");
				System.out.println();
			}
		} while (!checkNumber(str));
		int number = Integer.parseInt(str);
		if(symmetricalNumber(number)) {
			System.out.println(number + " is a symmetrical number");
		}else {
			System.out.println(number + " is not a symmetrical number");
		}
	}

}
