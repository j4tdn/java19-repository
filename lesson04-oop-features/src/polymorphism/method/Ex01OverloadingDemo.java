package polymorphism.method;

public class Ex01OverloadingDemo {
	public static void main(String[] args) {
		double total = sum(2d,4d,4d);
		System.out.println("total: " + total);
	}
	
//  sum n so thuc lon
	// truyen 1 hoac nhieu tham so double
	//...'variables'
	private static double sum(double... numbers) {
		double result = 0;
		for (double number : numbers) {
			result += number;
		}
		return result;
	}
	
//  sum 2 so nguyen
	private static int sum(int a, int b) {
		return a + b;
	}
	
//  sum 3 so nguyen
	private static int sum(int a, int b, int c) {
		return a + b + c;
	}
	
//	sum 2 so thuc
	private static double sum(double a, double b) {
		return a + b;
	}
}
