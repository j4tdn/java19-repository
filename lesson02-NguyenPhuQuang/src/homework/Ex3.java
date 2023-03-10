package homework;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		System.out.println("Bài 3: Viết chương trình tìm giai thừa của một số nguyên dương N\r\n"
				+ "Biết rằng: N có thể được nhập từ bàn phím hoặc khai báo sẵn\r\n" + "Ví dụ: Nhập N = 1  1! = 1\r\n"
				+ "Nhập N = 5  5! = 5.4.3.2.1 = 120");

		int n = Ex1.inputPositiveNumber();

		System.out.println(n + "! = " + factorial(n));
	}

	public static long factorial(int input) {
		long result = 1;
		while (input != 0 && input != 1) {
			result *= (int) input;
			input--;
		}
		return result;
	}
}
