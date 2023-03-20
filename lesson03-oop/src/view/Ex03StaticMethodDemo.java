package view;

public class Ex03StaticMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("sum1 --> " +Ex03StaticMethodDemo.sum(2, 3));
		System.out.println("sum2 --> " +Ex03StaticMethodDemo.sum(2, 4));
		System.out.println("sum3 --> " +Ex03StaticMethodDemo.sum(2, 5));

	}
	
	private static int sum(int a, int b) {
		return a + b;
	}

}
 