package view;

import java.util.Scanner;

public class Ex01 {

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
			int n = Integer.parseInt(input); //chuyển đổi giá trị kiểu chuỗi trong biến `input` sang giá trị kiểu số nguyên trong biến `n`.
			if (isEvenNumber(n) == true) {
				System.out.println(input + " là bội của 2.");
			} else {

				System.out.println(input + " là không phải là bội của 2.");
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

	public static boolean isEvenNumber(int input) {
		if (input % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
