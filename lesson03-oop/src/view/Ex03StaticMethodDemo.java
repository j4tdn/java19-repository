package view;

public class Ex03StaticMethodDemo {
	public static void main(String[] args) {
		int result = sum(9, 5);
		System.out.println(result);
	}
	
	
	public static int sum(int a, int b) {
		return a + b;
	}
}
