package datastructure.primitive;

public class Ex03PrimitivePassingValue {
	public static void main(String[] args) {
		//khai báo vào gán giá trị 
		int a = 5;
		int b = 7;
		
		
		// cập nhận giá tri của a thành 9 thông qua hàm (Phương thức)
		modify(a);//modify(77);
		System.out.println("Giá trị a :" +a);
		
		// tìm tích của a và b
		int result = multiply(a,b);
		System.out.println("Kết quả a* b = " + result);
		
 }
	
	//khai báo hàm
	// có 1 tham số là number sẽ nhận giá trị khi có nơi gọi hàm và
	//  truyền giá trị cho tham số number
	// cập nhận giá trị của number bằng 9
	//int number = 77; int number = a;

	private static int modify(int number) {
		number = 9;
		return number;
		
		
	}
	
	private static int multiply(int a, int b) {
     a = 5;
     b = 7;
     
		return multiply(a,b);
	}
		
	}