package polymorphism.methor;

public class Ex01OverLoadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum =sum(2d,3d,5d,6d,8d);
		System.out.println(sum);

	}
	//2 hay nhiều hàm được gọi là overloading nếu :
	//-thuộc cùng 1 class
	//-cùng tên
	//-khác :
	//	+kiểu dữ kiệu truyền vào của tham số
	//  +số lượng tham số truyền vào
	
	private static double sum (double... numbers) {
		double result =0d;
		for (double number:numbers) {
			result+=number;
		}
		return result;
	}
	
	private static int sum (int a,int b) {
		return a+b;
	}
	private static float sum (float a,float b) {
		return a+b;
	}
	private static int sum (int a,int b,int c) {
		return a+b+c;
	}
}
