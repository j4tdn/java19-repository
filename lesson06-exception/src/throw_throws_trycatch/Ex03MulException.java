package throw_throws_trycatch;

import java.util.Scanner;

public class Ex03MulException {
	
	private static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		try {
			int result = inputAndDivide();
			System.out.println("result: " + result);
		} catch (NumberFormatException | ArithmeticException e) {
			System.out.println("Exception --> " + e.getMessage());
		}
		System.out.println("***___finished___***");
		in.close();
	}
	
	private static int inputAndDivide() {
		int a = input("Enter a");
		int b = input("Enter b");
		
		return divide(a, b);
	}
	
	private static int input(String prefix) {
		System.out.print(prefix + " : ");
		return Integer.parseInt(in.nextLine());
	}
	
	
	
	private static int divide(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("b should not be zero!!! ");
		}
		return a / b;
	}
}
