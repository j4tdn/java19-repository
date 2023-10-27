package exercise;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		double input = inputinput();
		if (input == -1) {
			System.out.println("Vượt quá số lần nhập sai cho phép. Kết thúc chương trình.");
			return;
		}

		int denominator = 1;
		while (input * denominator % 1 != 0) {
			denominator *= 10;
		}
		int numerator = (int) (input * denominator);
		int gcd = findGCD(numerator, denominator);
		numerator /= gcd;
		denominator /= gcd;

		System.out.printf("Phân số tối giản của %.2f là %d/%d.", input, numerator, denominator);

	}

	public static double inputinput() {
		Scanner scanner = new Scanner(System.in);
		int count = 1;
		while (count <= 3) {
			try {
				System.out.print("Nhập vào một số thực có phần thập phân khác 0: ");
				double input = scanner.nextDouble();
				if (input != 0 && input % 1 != 0) {
					return input;
				} else {
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println("Số không hợp lệ. Vui lòng nhập lại.");
				count++;
			}
		}
		return -1;
	}

	public static int findGCD(int a, int b) {
		if (b == 0) {
			return a;
		}
		return findGCD(b, a % b);
	}
}
