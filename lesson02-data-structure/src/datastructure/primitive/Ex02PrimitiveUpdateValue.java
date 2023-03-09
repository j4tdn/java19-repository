package datastructure.primitive;

public class Ex02PrimitiveUpdateValue {
	public static void main(String[] args) {
		int a = 7;
		int b = 5;
		
		// Cập nhật lại giá trị của biến
		// Sử dụng toán tử = (Chỉ gán ở vùng nhớ STACK)
		int tmp = a;
		a = b;
		b = tmp;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		System.out.println("================");
		abc(a);
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
	public static void abc(int a) {
		a = 100;
	}
}
