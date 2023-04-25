package polymorphism.method;

public class Ex01OverloadingDemo {
	public static void main(String[] args) {
		System.out.println(sum(1,2));
		System.out.println(sum(1.0f,2.0f));
		System.out.println(sum(1d,2d,3d,4d));
	}
	
	/*
	  2 hay N hàmd được gọi là overloading:
	  - Giống tên hàm
	  - Thuộc cùng class 
	  - Khác
	  	+ Số lượng tham số truyền vào
	  	+ Kiểu dữ liệu tham số truyền vào
	*/
	
	private static double sum(double... numbers) {
		double s = 0;
		for (double d : numbers) {
			s += d;
		}
		return s;
	}
	
	private static int sum(int a, int b) {
		return a + b;
	}
	
	private static float sum(float a, float b) {
		return a + b;
	}
	
}
