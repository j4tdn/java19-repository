package homework;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		int countInput = 1;
		Scanner sr = new Scanner(System.in);
		do {
			try {
				System.out.println("Nhập lần thứ " + countInput + ": ");
				long n = Integer.parseInt(sr.nextLine());
				countInput++;
				System.out.println("Giai thừa của " + n + " là: " + calculateFactorial(n));
			} catch (NumberFormatException e) {
				System.out.println("Vui lòng nhập lại số");
			}
		} while (countInput <= 5);

	}

	public static long calculateFactorial(long n) {
		long factorial = 1;
		if (n == 0 || n == 1) {
			return factorial;
		} else {
			for (int i = 2; i <= n; i++) {
				factorial *= i;
			}
			return factorial;
		}
	}
}
