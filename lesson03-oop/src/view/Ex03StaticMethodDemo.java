package view;

public class Ex03StaticMethodDemo {
	public static void main(String[] args) {
		System.out.println("sum1 --> " + Ex03StaticMethodDemo.sum(3, 4));
		System.out.println("sum2 --> " + Ex03StaticMethodDemo.sum(5, 5));
		System.out.println("sum3 --> " + Ex03StaticMethodDemo.sum(7, 9));
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}
  
}
