package homework;

import java.util.Scanner;

public class Ex1 {

	public static boolean checkNumber(String input) {
//		String regex = "\\d+";
		if (input == null || input.isEmpty()) {
			return false;
		}
		for (int i = 0; i < input.length(); i++) {
			if (!Character.isDigit(input.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	private static boolean isMultipleOfTwo(int num) {
		if (num % 2 != 0) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		System.out.println(
				isMultipleOfTwo(number) ? number + " is multiples of two" : number + " is not multiples of two");
	}

}
