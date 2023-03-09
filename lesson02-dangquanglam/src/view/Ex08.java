package view;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "";
		int count = 0;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Nhập số nguyên dương N : ");
			input = sc.nextLine();
			if (numberInput(input)) {
				break;
			} else {
				System.out.println("N không hợp lệ , vui lòng nhập lại");
				count++;
			}

		} while (count < 5);

		if (count >= 5) {
			System.out.println("Bạn đã nhập sai quá 5 lần.");
		} else {
			int n = Integer.parseInt(input); // chuyển đổi giá trị kiểu chuỗi trong biến `input` sang giá trị kiểu số nguyên trong biến `n`.
			if (isPrimeNumber(n) == true) {
				System.out.println(input + " là số nguyên tố.");
			} else {

				System.out.println(input + " là không phải là số nguyên tố.");
			}
		}
	}

	public static boolean numberInput(String input) {
		if (input == "") {
			return false;
		} else {
			for (int i = 0; i < input.length(); i++) {
				if ((input.charAt(i) < '0') || (input.charAt(i) > '9')) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean isPrimeNumber(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
