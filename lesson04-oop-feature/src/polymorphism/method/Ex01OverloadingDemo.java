package polymorphism.method;

public class Ex01OverloadingDemo {
	/*
	 * 2 hay nhiều hàm được gọi là overloading nếu:
	 * - cùng thuộc 1 class
	 * - cùng tên
	 * - khác KDL truyền vào của tham số hoặc số lượng tham số truyền vào
	 * 
	 */
	public static void main(String[] args) {
		//double[] input = {1d, 2d, 3d};
		//double total = sum(input);
		
		double total = sum(2d, 4d, 2d, 6d);
		System.out.println("total: " + total);
	}
	// Tính tổng cho n số thực lớn
	//truyền 1 hoặc nhiều tham số kiểu double tại hàm
	//... 'variables' --> nhập vào 1 mảng double
	// hoặc nhận vào 0 hoặc nhiều giá trị double cách nhau bởi dấu , 
	private static double sum(double... numbers) {
		double result = 0d;
		for (double number : numbers) {
			result += number;
		}
		return result;
	}
	// Tính tổng 2 số nguyên
	private static int sum(int a, int b) {
		return a + b;
	}
	 
	// Tính tổng 3 số nguyên
	private static int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	// Tính tổng 2 số thực
	private static float sum(float a, float b) {
		return a + b;
	}
}
