package datastructure.primitive;

public class Ex03PrimitivePassingValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 7;
		
		// Cập nhật giá trị của a thành 9 thông qua hàm (phương thức)
		a = modify(a);
		System.out.println(a);
	}

	// khai báo hàm
	// có 1 tham số là number sẽ nhận giá trị khi có nơi g�?i hàm
	// và truy�?n giá trị cho tham số number
	// Nhiệm vụ là cập nhật giá trị của number thành 9
	private static int modify(int number) {
		number = 9;
		return number;
	}
}
