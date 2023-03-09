package homework;

import java.util.Scanner;

public class Ex02CheckPowerOfTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int countInput = 0;
		String num = "";

		do {
			System.out.print("Nhập số nguyên dương N = ");
			num = sc.nextLine();
			countInput++;
			if (countInput == 5) {
				System.out.println("Bạn đã nhập sai tối đa 5 lần! Kết thúc chương trình.");
				return;
			}
		} while (!Common.isPositiveInteger(num));

		System.out.println(isPowerOfTwo(Integer.parseInt(num)));

	}

	private static boolean isPowerOfTwo(int input) {
		if (input == 0) {
			return false;
		}

		while (input % 2 == 0 && input != 1) {
			input = input / 2;
		}

		if (input == 1) {
			return true;
		}

		return false;
	}

}
