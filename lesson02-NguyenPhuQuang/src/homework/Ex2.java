package homework;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		System.out.println("Bài 2: Viết chương trình(hàm) kiểm tra số nguyên N có phải là lũy thừa của 2 hay không\r\n"
				+ "Biết rằng N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N không hợp lệ\r\n"
				+ "(tối đa 5 lần) hoặc khai báo biến có sẵn giá trị hợp lệ\r\n"
				+ "VD: Nhập N = abc  báo lỗi, yêu cầu nhập lại\r\n"
				+ "\r\n"
				+ "= 4  true\r\n"
				+ "= 6  false\r\n"
				+ "= 8  true\r\n"
				+ "= 9  false");
		
		int n = Ex1.inputPositiveNumber();

		if (isPowerOfTwo(n) == true) {
			System.out.println(n + " là bội của 2.");
		} else {

			System.out.println(n + " không là bội của 2.");
		}

	}

	public static boolean isPositiveInt(String input) {
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

	public static boolean isPowerOfTwo(int input) {
		if (input==1 || input == 0) {
			return false;
		}
		while (Ex1.isEvenNumber(input)) {
			input /= 2;
			if (input == 1) {
				return true;
			}
		}
		return false;
	}
}
