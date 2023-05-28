package ex01;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float a;
		float b;
		do {
			try {
				System.out.print("Nhập vào hệ số a= ");
				a = Integer.parseInt(input.nextLine());
				System.out.print("Nhập vào hệ số b= ");
				b = Float.parseFloat(input.nextLine());
				divide(a,b);
				break;
			} catch (NumberFormatException e) {
				System.out.println("Hệ số nhập không hợp lệ, vui lòng nhập lại");
			} catch (ArithmeticException e) {
				System.out.println("Lỗi: Không thể chia cho 0, vui lòng nhập lại.");
			}
		} while (true);
		input.close();
		System.out.println("Finish");

	}
	private static double divide(double a, double b) {
		if (a == 0) {
			throw new ArithmeticException("a should not be zero");
		}
		return -b/a;
	}

}
