package homework;

import java.util.Scanner;

public class BT02PowerOfTwo {
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

		System.out.println(n + " is power of 2: " + isPowerOfTwo(n));
	}

	public static boolean isPowerOfTwo(int number) {
		// Check multiples of 2, log2 n = loge n / loge 2
		double log2n = Math.log(number) / Math.log(2);
		return log2n % 1 == 0;
	}

}
