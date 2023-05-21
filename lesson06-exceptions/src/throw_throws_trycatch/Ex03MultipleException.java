package throw_throws_trycatch;

import java.util.Scanner;

public class Ex03MultipleException {
	
	private static  Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		try {
			System.out.println(inputAndDivide());
		} catch (NumberFormatException | ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
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
		if( b == 0) {
			throw new ArithmeticException("b should not be zero");
		}
		return a / b;
	}
}
