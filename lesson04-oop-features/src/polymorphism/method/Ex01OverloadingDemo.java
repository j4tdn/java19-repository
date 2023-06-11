package polymorphism.method;

public class Ex01OverloadingDemo {
	public static void main(String[] args) {
		double total = sum(2d, 4d);
		System.out.println("total: "+ total);
	}
	
	private static double sum(double... numbers) {
		double result = 0d;
		for(double number: numbers) {
			result += number;
		}
		return result;
	}
	
//	private static int sum(int a, int b) {
//		return a+b;
//	}
//	private static int sum(int a, int b, int c) {
//		return a+b+c;
//	}
}