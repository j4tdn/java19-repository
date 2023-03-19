package datastructure.primitive;

public class Ex03PrimitivePassingValue {
	public static void main(String[] args) {
		// Khai báo và gán giá trị
		int a = 5;
		int b = 7;
		
		// Cập nhật giá trị của a thành 9 thông qua hàm(phương thức)
		modify(a);   // modify(77);
		System.out.println("Giá trị của a: " + a);
		
		// Tìm tích của a và b
		int result = multiply(a, b);
		System.out.println("Kết quả a * b = " + result);
	}
	
	// Khai báo hàm
	// Có 1 tham số là number sẽ nhận giá trị khi có nơi g�?i hàm và
	// truy�?n giá trị cho tham số number
	// Nhiệm vụ là cập nhật giá trị của number thành 9
	// int number = 77; int number = a;
	private static void modify(int number) {
		number = 9;
	}
	
	// int a = a(5)
	// int b = b(7)
	private static int multiply(int a, int b) {
		return a * b;
	}
}
