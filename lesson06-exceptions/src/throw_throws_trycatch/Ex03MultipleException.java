package throw_throws_trycatch;

import java.util.Scanner;

public class Ex03MultipleException {
	/**
	 * Yêu cầu: Thực hiện phép chia a/b
	 * 
	 */
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		// lưu ý khi try nhiều catch
		// khối catch đứng trên phải là:
		// 1. không liên quan đến khối catch đứng sau
		// 2. Con của khối catch phía sau

//		try {
		// int result = inputAndHandle();
		// System.out.println("result: " + result);

		// } catch (NumberFormatException nfe) {
		// System.out.println("NumberFormatException: " + nfe.getMessage());
		// } catch (ArithmeticException ame) {
		// System.out.println("ArithmeticException: " + ame.getMessage());
		// }
		try {
			int result = inputAndHandle();
			System.out.println("result: " + result);

		} catch (NumberFormatException | ArithmeticException e) {
			System.out.println("NumberFormatException: " + e.getMessage());
		}
	}

	private static int inputAndHandle() {
		int a = input("Enter A");
		int b = input("Enter B");
		return divide(a, b);
	}

	private static int input(String prefix) {
		System.out.println(prefix + ": ");
		return Integer.parseInt(ip.nextLine());
	}

	// tương tự Integer.parseInt(text);
	private static int divide(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("b should not be zero");

		}
		return a / b;}
}