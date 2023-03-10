package homework;

import java.util.Scanner;

public class Exercise05 {
	public static void main(String[] args) {
		int countInput = 1;
		Scanner sr = new Scanner(System.in);
		do {
			try {
				int n = Integer.parseInt(sr.nextLine());
				countInput++;
				if (daoSo(n) == n) {
					System.out.println("TRUE");
				} else {
					System.out.println("FALSE");
				}
			} catch (NumberFormatException e) {
				System.out.println("Vui lòng nhập lại số");
			}
		} while (countInput <= 5);

	}

	public static int daoSo(int n) {
		int x, s = 0;
		while (n != 0) {
			x = n % 10;
			n /= 10;
			s = s * 10 + x;
		}
		return s;
	}
}
