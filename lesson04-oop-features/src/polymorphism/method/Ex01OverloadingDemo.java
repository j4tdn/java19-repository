package polymorphism.method;

public class Ex01OverloadingDemo {
	public static void main(String[] args) {
		//double[] input = (2d,3d)
		//double total = sum(input)
		double total = sum(2d,3d);
		System.out.println("total: " + total);
	}

	// Tinh tong cho 2 so nguyen
	private static int sum(int a, int b) {
		return a + b;
	}
	/*
	 *2 hay N ham duowc goi la overloading neu
	 *- thuoc cung 1 class
	 *- cung ten
	 *- khac
	 *	+ KDL truyen vao cua tham so
	 *	+ Khac so luong tham so truyen vao
	 */
	//Tinh tong cua 3 so thuc
	private static int sum(int a, int b, int c) {
		return a + b + c;
	}
	// Tinh tong cho 2 so thuc
	private static float sum(float a, float b) {
		return a + b;
	}
	//Tinh tong cho n so thuc lon
	//... 'variables'  --> nhan vao 1 mang double
	//hoac nhan vao 0 hoac nhieu gia tri double cach nhau boi dau phai
	private static double sum(double... numbers) {
		double result = 0d;
		for(double number : numbers) {
			result+= number;
		}
		return result;
	}
	
	
}
