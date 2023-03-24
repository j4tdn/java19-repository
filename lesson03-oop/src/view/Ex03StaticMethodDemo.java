package view;

public class Ex03StaticMethodDemo {
	public static void main(String[] args) {
		System.out.println(Ex03StaticMethodDemo.sum(1, 2));
		System.out.println(Ex03StaticMethodDemo.sum(2, 3));
		System.out.println(Ex03StaticMethodDemo.sum(3, 4));
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}
}
