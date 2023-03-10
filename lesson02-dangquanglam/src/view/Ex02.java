package view;

import java.util.Scanner;

public class Ex02 {

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
			if (isExponentiationNumber(n) == true) {
				System.out.println(input + " là luỹ thừa của 2.");
			} else {

				System.out.println(input + " là không phải là luỹ thừa của 2.");
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

	public static boolean isExponentiationNumber(int input) {
		if (input <= 0 || (input & (input - 1)) != 0) { //(n & (n - 1)) != 0 kiểm tra xem giá trị `n` có phải là luỹ thừa của 2 hay không. Nếu kết quả trả về khác 0, tức là `n` không phải là luỹ thừa của 2. 
														//Biểu thức `n <= 0` kiểm tra xem giá trị `n` có phải là số dương hay không, nếu là số không dương (bằng 0 hoặc nhỏ hơn 0) thì `n` không phải là luỹ thừa của 2.
            return false;
        }
        return true;
	}
}
