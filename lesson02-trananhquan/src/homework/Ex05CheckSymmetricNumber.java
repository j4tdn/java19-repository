package homework;

import java.util.Scanner;

public class Ex05CheckSymmetricNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String num = "";

		do {
			System.out.print("Nhập số nguyên dương có tối thiểu 2 chữ số N = ");
			num = sc.nextLine();
		} while (!Common.isPositiveInteger(num) || num.length() < 2);

		System.out.println(isSymmetricNumer(Integer.parseInt(num)));
	}

	private static boolean isSymmetricNumer(int input) {
		return inverseNumber(input) == input;
	}

	private static int inverseNumber(int input) {
		int n = 0;
		while (input > 0) {
			n = 10 * n + input % 10;
			input /= 10;
		}
		return n;
	}

}
