package polymorphism.method;

public class Ex01OverloadingDemo {

	public static void main(String[] args) {

	}
	/*
	 * 2 hay N hmà được gọi là overloading nếu - thuộc cùng 1 class - cùng tên -
	 * khác + KDL truyền vào của tham số + Số lượng tham số truyền vào
	 */

	private static int sum(int a, int b) {
		return a + b;
	}

	private static int sum(int a, int b, int c) {
		return a + b + c;
	}

	private static float sum(float a, float b) {
		return a + b;
	}

	private static double sum(double... numbers) {
		double result=0d;
		for (double number: numbers) {
			result+=number;
		}
		return result;
	}

}
