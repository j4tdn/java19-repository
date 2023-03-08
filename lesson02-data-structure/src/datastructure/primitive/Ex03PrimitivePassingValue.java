package datastructure.primitive;

public class Ex03PrimitivePassingValue {

	public static void main(String[] args) {
		// Khai báo và gán giá trị
		int a = 5;
		int b = 7;
		
		// Cập nhật giá trị của a thành 9 thông qua hàm(phương thức)
		a = modify(a); // modify(77);
		
		System.out.println("Giá trị của a: " + a);
		
		//Tìm tích của a và b
		int result = multiply(a, b); //multiply(77, b);
		System.out.println("Kết quả a*b= "+ result);
	}
	// Khai báo hàm:
	// Có 1 tham số number sẽ nhận giá trị khi có nơi gọi hàm và truyền giá trị cho tham số number
	// Nhiệm vụ là cập nhật giá trị number thành 9
	private static int modify(int number) {
		number = 9;
		return number;
	}
	
	// int a = a
	// int b = b
	private static int multiply(int a, int b) {
		return a * b;
	}
}
