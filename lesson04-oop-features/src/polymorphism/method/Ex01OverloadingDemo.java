package polymorphism.method;

public class Ex01OverloadingDemo {
	public static void main(String[] args) {
		double total = sum(2d, 4d, 5d);
		System.out.println("total: " + total);
	}
	
	private static int sum(int a, int b) {
		return a + b;
	}
	
	private static float sum(float a, float b) {
		return a + b;
	}
	
	private static double sum(double...numbers) {
		double result = 0d;
		for (double number : numbers) {
			result += number;
		}
		return result;
	}
}
