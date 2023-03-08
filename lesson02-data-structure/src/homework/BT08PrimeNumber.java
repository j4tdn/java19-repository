package homework;

import java.util.Scanner;

public class BT08PrimeNumber {
	public static void main(String[] args) {
		// enter valid number
		Scanner ip = new Scanner(System.in);
		String text = null;
		int i = 1;
		do {
			System.out.println("Enter number: ");
			text = ip.nextLine();
			if (text.matches("[0-9]+") && !text.matches("[0]+")) {
				break;
			}
			System.out.println("ERROR: Invalid number");
			i++;
			if (i > 5) {
				System.out.println("Invalid number exceeds 5 times!");
				return;
			}

		} while (true);

		int n = Integer.parseInt(text);
		System.out.println(n + " is prime number: " + isPrimeNumber(n));
	}

	public static boolean isPrimeNumber(int number) {
		if (number < 2) {
			return false;
		}
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
