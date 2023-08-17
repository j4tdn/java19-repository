package view;

import functional.Operator;

public class Ex02Numerator {
	
	public static void main(String[] args) {
		// Given the 2 numbers a, b
		// Write a method to add, subtract, multiple, divide, etc
		
		int x = 10;
		int y = 20;
		
		System.out.println("add --> " + process(x, y, Ex02Numerator::sum));
		System.out.println("subtract --> " + process(x, y, (a, b) -> a - b));
		System.out.println("multiply --> " + process(x, y, (a, b) -> a * b));
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	// a + b
	// a - b
	// a * b + b - a
	// --> int operate(int a, int b)
	
	private static int process(int a, int b, Operator operator) {
		return operator.operate(a, b);
	}
}
