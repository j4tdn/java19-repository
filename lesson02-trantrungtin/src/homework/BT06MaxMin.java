package homework;

import java.util.Scanner;

public class BT06MaxMin {
	public static void main(String[] args) {
		// enter valid number
		Scanner ip = new Scanner(System.in);
		for (int i = 1; i <= 3; i++) {
			String text = null;
			do {
				System.out.println("Enter number " + i);
				text = ip.nextLine();
				if (text.matches("[0-9]+") && text.length() == 1) {
					break;
				}
				if (text.matches("[0-9]+") && text.length() == 2
						&& ((text.charAt(0) == '0' || text.charAt(0) == '1'))) {
					break;
				}
				System.out.println("ERROR: Invalid number");
			} while (true);

			int n = Integer.parseInt(text);
			int[] abc = new int[3];
			abc[i - 1] = n;
		}

	}

}
