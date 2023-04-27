package polymorphism.method;

public class Ex01OverloadingDemo {
	public static void main(String[] args) {
		double total = sum(2d,4d);
		System.out.println(total);
		
	}
	
	/*
	 * 2 hay nhiều hàm được gọi là overloading nếu 
	 * 		+ Thuộc cùng 1 lớp
	 * 		+ Khác kiểu dữ liệu truyền vào của tham số
	 * 		+ Khác số lượng tham số truyền vào 
	 * */
	
	private static double sum(double... numbers) {
		double result = 0;
		for (double number : numbers) {
			result += number;
		}
		return result;
	}
	
	//Tính tổng 2 số thực
	private static int sum(int a, int b) {
		return a + b;
	}
	
	//Tính tổng 3 số thực
	private static int sum(int a, int b, int c) {
		return a + b;
	}
	
	//Tính tổng 2 số thực
	private static float sum(float a, float b) {
		return a + b;
	}
}
