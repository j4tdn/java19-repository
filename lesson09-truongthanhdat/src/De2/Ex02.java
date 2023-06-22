package De2;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhập số nguyên dương: ");
		int number = Integer.parseInt(in.nextLine());

		if (isHappyNumber(number)) {
			System.out.println(number + " là số hạnh phúc");
		} else {
			System.out.println(number + " không là số hạnh phúc");
		}
		in.close();
	}

	public static boolean isHappyNumber(int number) {
		int sum = 0;
		int digit;

		while (number > 0) {
			digit = number % 10;
			sum += digit * digit;
			number /= 10;
		}

		if (sum == 1) {
			return true;
		} else if (sum == 4) {
			return false;
		} else {
			return isHappyNumber(sum);
		}
	}
}