package view;

import functional.Processor;

public class Ex02Numerator {
	public static void main(String[] args) {
		// Given 2 number a and b
		// Write program to add, sub,multiply,divide,etc
		
		int a = 10;
		int b = 20;
		
		display("Number 1", a);
		display("Number 2", b);
		
		// Add 2 numbers
		display("1. Add 2 numbers", compute(a,b,Ex02Numerator::sum));
		
		// Subtract 2 numbers
		display("2. Subtract 2 numbers", compute(a,b,(x,y) -> x-y));
		
		// Multiply 2 numbers
		display("3. Multiply 2 numbers", compute(a,b,(x,y) -> x*y));
		
		// Divide 2 numbers
		display("4. Divide 2 numbers", compute(a,b,(x,y) -> x/y));
		

	}
	
	//  Method references
	public static int sum(int a,int b) {
		return a + b;
	}
	
	private static int compute(int a,int b,Processor process) {
		return process.process(a, b);
	}
	
	private static void display(String prefix,int content) {
		System.out.println(prefix + " --> " + content);
	}
	
}
