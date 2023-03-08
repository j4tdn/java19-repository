package datastructure.primitive;

public class Ex03PrimitivePassingValue {
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		//Cập nhật giá trị của a thành 9 thông qua hàm (phương thức)
		a = modify(a);
		System.out.println("Giá trị của a: " + a);
		int result = multiply(a,b);
		System.out.println("kết quả a*b = " + result);
	}
	// Có 1 tham số là number sẽ nhận giá trị khi có nơi gọi nó và truyền giá trị cho tham số m
	//Nhiệm vụ là cập nhật giá trị của number thành 9
	private static int modify(int number) {
		number = 9;
		return number;
	}
	private static int multiply(int a, int b) {
		return a*b;
	}

}
