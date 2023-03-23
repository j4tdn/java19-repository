package view;

public class Ex03StaticMethodDemo {

	public static void main(String[] args) {
		// Viết hàm tính tổng 2 số a và b dùng ở mọi nơi
		System.out.println("sum1-->"+Ex03StaticMethodDemo.sum(10,20));
		System.out.println("sum2-->"+Ex03StaticMethodDemo.sum(15,20));
		System.out.println("sum3-->"+Ex03StaticMethodDemo.sum(10,25));
		
		

	}
	public static int sum(int a, int b) {
		return a+b;
	}

}
