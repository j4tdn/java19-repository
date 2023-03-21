package view;

public class Ex03StaticMethodDemo {
	public static void main(String[] args) {
		System.out.println("sum --> " + Ex03StaticMethodDemo.sum(2, 4));
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}
}
