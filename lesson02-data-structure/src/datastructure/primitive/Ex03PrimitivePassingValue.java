package datastructure.primitive;

public class Ex03PrimitivePassingValue {
	public static void main(String[] args) {
		//khai báo và gans giá trị 
		int a = 5;
		int b = 7;
		
		// cập nhật giá trị của a thành  9 thông qua hàm(phương thức)
		a = modify(a);
		
		System.out.println("Giá trị của a :" + a);
		
		//Tìm tích của a và b
	
		int result = multiply(a , b);
		System.out.println("Kết quả a *b = " + result );
		
		
		
		
		
		
	}
	// có 1 tham số là number sẽ nhận giá trị khi có nơi gọi hàm và
	//truyền giá trị cho tham số number
	// Nhiệm vụ là cập nhật giá trị của number thành 9
	//int number = 77; int number = a;
	private static int modify(int number) {
		number = 9;
		return number;
		
	}
	// int a = a(5)
	// int b = b(7)
	private static int multiply(int a, int b) {
		return a * b;
		
	}

}
