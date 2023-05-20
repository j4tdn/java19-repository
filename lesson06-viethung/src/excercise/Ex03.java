package excercise;

import java.util.Scanner;

public class Ex03 {
	private static boolean checkCharacter(char c) {
		return c == '_' || c == '-' || c == '.';
	}
	private static boolean checkValidEmail(String s) {
		for (int i = 0; i < s.length() - 9; i++) {
			char c = s.charAt(i);
			if (i < s.length() - 10 && checkCharacter(c)
					&& checkCharacter(s.charAt(i + 1))) {
				return false;
			}
			if (!Character.isDigit(c) && !Character.isLetter(c) && !checkCharacter(c)) {
				return false;
			}
			if (i == 0 && checkCharacter(c)) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter email: ");
			String s = sc.nextLine();
			if (s.subSequence(s.length() - 9, s.length()).equals("@mail.com") && checkValidEmail(s)) {
				System.out.println(s);
				break;
			} else
				System.out.println("Invalid email, please re-enter !!!");
		} while (true);
	}

}
