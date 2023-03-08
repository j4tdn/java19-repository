package datastructure.primitive;

public class Ex03PrimitivePassingValue {

	public static void main(String[] args) {
		//khai báo và gán giá trị
		int a=5;
		int b=7;
		//cập nhật giá trị của a thành 9 thông qua hàm
		a=modify(a);
		System.out.println("giá trị của a:"+a);
		//tìm tích a và b
		int result=multiply(a, b);
		System.out.println("kết quả a*b = "+result);

	}
	//có 1 tham số là number sẽ nhận giá trị khi có nơi gọi hàm và truyền giá trị cho tham số number
	//cập nhật giá trị của number thành 9
	private static int modify(int number) {
		number =9;
		return number;
	}
	// hàm tìm tích
	private static int multiply(int a,int b) {
		return a*b;
	}
}
