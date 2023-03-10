package homework;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {

		int countInput = 1;
		Scanner sr = new Scanner(System.in);
		do {
			try {
				System.out.println("Nhập lần thứ " + countInput + ": ");
				int n = Integer.parseInt(sr.nextLine());
				if (isMultiples(n)) {
					System.out.println("TRUE");
					countInput++;
				} else {
					System.out.println("FALSE");
					countInput++;

				}
			} catch (NumberFormatException e) {
				System.out.println("Vui lòng nhập lại số");
				countInput++;
			}
		} while (countInput <= 5);

	}

	public static boolean isMultiples(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 0; i <= n; i++) {
			if (n % 2 == 0) {
				return true;
			}
		}
		return false;
	}

}
