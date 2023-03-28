package view;

public class Ex03StaticMethodDemo {
	public static void main(String[] args) {
		System.out.println("sum1 --> "+Ex03StaticMethodDemo.sum(10, 50));
		System.out.println("sum2 --> "+Ex03StaticMethodDemo.sum(15, 20));
		System.out.println("sum3 --> "+Ex03StaticMethodDemo.sum(25, 30));
	}
	public static int sum(int a, int b) {
		return a + b;
	}

}
