package view;

import java.util.Scanner;

import bean.Equation1st;

/**
 * Bài 1: Giải phương trình bậc nhất ax + b = 0 . Các hệ số nhập vào từ bàn
 * phím. Sử dụng try - catch để bẫy các lỗi khi nhập sai kiểu dữ liệu, ví dụ
 * nhập số nhưng nhập chữ. Bẫy lỗi chia 0, trường hợp xảy ra lỗi phải thông báo
 * cho người dùng biết và nhập lại đến khi a b hợp lệ thì in ra kết qua x = -b/a
 * 
 * @author Admin
 *
 */
public class Ex1 {

	public static void main(String[] args) {
		Equation1st eq = inputEquation1st();
		System.out.println(eq);
		System.out.println("x = " + division(eq.getA(), eq.getB()));
	}

	private static Equation1st inputEquation1st() {
		Equation1st result = new Equation1st();
		Scanner ip = new Scanner(System.in);
		while (true) {

			System.out.println("Enter a");
			try {
				result.setA(Double.parseDouble(ip.nextLine()));
				if (result.getA() == 0) {
					throw new ArithmeticException("a must be !0");
				}
				break;
			} catch (NumberFormatException nfe) {
				System.out.println("Please input valid number");
				continue;
			} catch (ArithmeticException ame) {
				System.out.println("Please enter a: must be !0");
				continue;
			}
		}
		while (true) {

			System.out.println("Enter b");
			try {
				result.setB(Double.parseDouble(ip.nextLine()));
				break;
			} catch (NumberFormatException nfe) {
				System.out.println("Please input valid number");
				continue;
			}

		}
		return result;
	}

	private static double division(double a, double b) {
		return -b / a;

	}
}
