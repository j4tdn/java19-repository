package throw_throws_trycatch;

import java.util.Scanner;

/**
 * Yêu cầu: Thực hiện phép chia 2 số a, b
 * 
 * @author qphan
 *
 */
public class Ex03MultipleException {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		// Lưu ý khi try nhiều catch
		// Khối catch đứng trước/trên phải là
		// 1. không liên quan gì đến khối catch đứng sau
		// 2. con của khối catch phía sau
		
		try {
			int result = inputAndDivide();
			System.out.println("result --> " + result);
		} catch (NumberFormatException | ArithmeticException e) {
			System.out.println("exception --> " + e.getMessage());
		}
		
		System.out.println("*** ___ finished ___ ***");

		ip.close();
	}

	private static int inputAndDivide() {
		int a = input("Enter A");
		int b = input("Enter B");
		return divide(a, b);
	}

	private static int input(String prefix) {
		System.out.print(prefix + ": ");
		return Integer.parseInt(ip.nextLine());
	}

	private static int divide(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("b should not be zero !!!");
		}
		return a / b;
	}
}
