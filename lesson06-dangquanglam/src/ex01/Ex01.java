package ex01;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b;
		while (true) {
			try {
				System.out.print("Nhập a: ");
				a = Double.parseDouble(sc.nextLine());
				if (a == 0) {
					throw new ArithmeticException();
				}
				System.out.print("Nhập b: ");
				b = Double.parseDouble(sc.nextLine());

				double x = -b / a;
				System.out.println("Nghiệm của phương trình " + a + "x + " + b + " = 0 là x = " + x);
				break;
			} catch (NumberFormatException e) {
				System.out.println("Bạn phải nhập đúng kiểu dữ liệu số...");
			} catch (ArithmeticException ae) {
				System.out.println("Không thể chia cho 0. Vui lòng nhập a khác 0....");
			}
		}
	}
}
