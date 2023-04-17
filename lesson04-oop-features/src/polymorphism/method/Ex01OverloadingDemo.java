package polymorphism.method;

public class Ex01OverloadingDemo {
	public static void main(String[] args) {
		double total = sum(2d, 4d);
		System.out.println("total: " + total);
	}

	/*
	 * 2 hay N methods là overloading khi: + Thuộc cùng class + Cùng tên - Khác: +
	 * KDL truyền vào của tham số + Số lượng tham số truyền vào
	 */

	// Tính tổng cho n số thực lớn
	// truyền 1 hoặc nhiều tham số kiểu double
	// ... 'variables' --> nhận vào 1 mảng double
	// hoặc nhận vào 0 hoặc nhiều giá trị double cách
	// nhau bởi dấu ,

	private static double sum(double... numbers) {
		double res = 0;
		for (double number : numbers) {
			res += number;
		}
		return res;
	}

	// Tính tổng 2 số nguyên
	private static int sum(int a, int b) {
		return a + b;
	}

	// Tính tổng 2 số thực
	private static float sum(float a, float b) {
		return a + b;
	}

}
