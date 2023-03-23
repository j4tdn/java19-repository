package view;

public class Ex03StaticMethodDemo {
	public static void main(String[] args) {
		System.out.println("sum1 -- > " + Ex03StaticMethodDemo.sum(10,20));
		System.out.println("sum2 -- > " + Ex03StaticMethodDemo.sum(10,27));
		System.out.println("sum3 -- > " + Ex03StaticMethodDemo.sum(17,20));
	}
	
	public static int sum(int a, int b) {
		return a+ b;
		
	}
}
