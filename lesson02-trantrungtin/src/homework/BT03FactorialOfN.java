package homework;

import java.util.Scanner;

public class BT03FactorialOfN {
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
		factorialOfN(n);

	}

	public static void factorialOfN(int number) {
		// fatorial of number
		int result = 1;
		String str = "";
		for (int i = number; i >= 1; i--) {
			result *= i;
			str = str + i;
			if (i > 1) {
				str = str + ".";
			}
		}
		System.out.println(number + "! = " + str + " = " + result);
	}

}
