package homework;

import java.util.Scanner;

public class BT05SymmetricNumber {
	public static void main(String[] args) {
		// enter valid number
		Scanner ip = new Scanner(System.in);
		String text = null;
		int i = 1;
		do {
			System.out.println("Enter number: ");
			text = ip.nextLine();
			if (text.matches("[0-9]+") && !text.matches("[0]+") && (text.length() >= 2)) {
				break;
			}
			System.out.println("ERROR: Invalid number");
			i++;
		} while (true);

		System.out.println(text + " is a symmetric number: " + isSymmertric(text));
	}

	public static boolean isSymmertric(String string) {
		String reverseString = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			reverseString = reverseString + string.charAt(i);
		}
		return string.equals(reverseString);
	}

}
