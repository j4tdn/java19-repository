package polymorphism.method;

public class Ex01OverloadingDemo {
	public static void main(String[] args) {
		
		System.out.println(sum(1, 2));
		
		System.out.println(sum(1.0f, 2.0f));
	}
	
	private static int sum(int a,int b) {
		return a + b;
	}
	private static float sum(float a,float b) {
		return a + b;
	}
	private static double sum(double... numbers) {
		double result = 0d;
		return result;
	}
}
