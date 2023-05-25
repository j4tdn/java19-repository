package ex;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double a, b, x;

		while (true) {
			try {
				System.out.println("aX + b = 0");
				System.out.print("Nhập giá trị của a: ");
				a = Double.parseDouble(scanner.nextLine());
				System.out.print("Nhập giá trị của b: ");
				b = Double.parseDouble(scanner.nextLine());
				if (a == 0) {
					throw new IllegalArgumentException("Lỗi: a không được bằng 0. Vui lòng nhập lại.");
				}

				System.out.print("Result: ");
				x = -b / a;
				System.out.println("Kết quả: x = " + x);
				break;
			} catch (NumberFormatException e) {
				System.err.println("Lỗi: Vui lòng chỉ nhập số.");
			} catch (IllegalArgumentException e) {
				System.err.println(e.getMessage());
			} catch (ArithmeticException e) {
				System.err.println("Lỗi: Chia cho 0. Vui lòng nhập lại.");
			}
		}

		scanner.close();
	}
}
