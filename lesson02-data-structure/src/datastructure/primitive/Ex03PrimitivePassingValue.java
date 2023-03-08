package datastructure.primitive;

public class Ex03PrimitivePassingValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Khai báo và gán giá trị
		int a = 5;
		int b = 7;
		// Cập nhật giá trị của a thành 9 thông qua hàm
		a = modify(a); // modify(77)

		System.out.println("Giá trị " + a);

		// Tìm tích của a và b
		int result = mul(a, b);
		System.out.println("tích của a và b: " + result);
	}

	// Khai báo hàm
	// Có 1 tham số là number sẽ nhận giá trị khi có nơi gọi hàm
	// Truyền giá trị cho tham số number
	// Nhiệm vụ là cập nhật giá trị của number thành 9
	// Int number = 77 ; int number = a;

	private static int modify(int number) {
		number = 9;
		return number;
	}

	private static int mul(int a, int b) {
		return a * b;
	}
}
