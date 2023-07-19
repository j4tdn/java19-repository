package view;

import functional.Calculate;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("sum = "  + calculate(2, 3, (a,b) -> a + b));
		System.out.println("subtract = "  + calculate(2, 3, (a,b) -> a - b));
		System.out.println("multiple = "  + calculate(2, 3, (a,b) -> a * b));
		System.out.println("divide = "  + calculate(2, 3, (a,b) -> a / b));
	}
	
	private static double calculate(int a, int b, Calculate cal) {
		return cal.cal(a, b);
	}
}
