package datastructure.primitive;

public class Ex03PrimitivePassingValue {
	public static void main(String[] args) {
		//khai báo và gán giá trị
		int a = 5;
		int b = 7;
		
		//cập nhật giá trị của a thành 9 thông qua hàm(phương thức)
		a = modify(a); //modify(77);
		System.out.println("Giá trị của a: " + a);
		
		//tìm tích của a và b
	    int result = multiply(a, b);
	    System.out.println("kết quả a * b: " + result);
	}
	//khai báo hàm
	//có 1 tham số là number sẽ nhận giá trị khi ó nơi gọi hàm và 
	//truyền giá trị cho number
	//nhiệm vụ là cập nhật giá trị của number thành 9
	private static int modify(int number) {
		number = 9;
		return number;
	}
	
	private static int multiply(int a, int b) {
		return a * b;
	}

}
