package polymorphism.method;

public class Ex01OverloadingDemo {
	public static void main(String[] args) {
		System.out.println("");
	}
	
	private static double sum(double... numbers) {
		double result = 0d;
		for(double number: numbers) {
			result += number;
		}
		return result;
	}
	
	// Sum for two prime number
	private static int sum(int a, int b) {
		return a + b;
	}
	
	private static int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	private static float sum(float a, float b) {
		return a + b;
	}
}