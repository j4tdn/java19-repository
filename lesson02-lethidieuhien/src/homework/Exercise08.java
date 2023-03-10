package homework;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		int countInput = 1;
		Scanner sr = new Scanner(System.in);
		do {
			try {
				System.out.println("Nhập lần thứ " + countInput + ": ");
				int n = Integer.parseInt(sr.nextLine());
				if (isPrimeNumber(n)) {
					System.out.println("TRUE");
					countInput++;
				} else {
					System.out.println("FALSE");
					countInput++;
				}
			} catch (NumberFormatException e) {
				System.out.println("Vui lòng nhập lại số");
			}
		} while (countInput <= 5);

	}

	public static boolean isPrimeNumber(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i < (n - 1); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
