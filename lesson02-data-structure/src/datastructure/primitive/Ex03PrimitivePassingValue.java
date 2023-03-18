package datastructure.primitive;

public class Ex03PrimitivePassingValue {
public static void main(String[] args) {
	int a = 5;
	int b = 7;
	modify(77);
	a = modify(a);
	System.out.println("giá trị của a: " + a);
	int result = multiply(a, b);
	System.out.println("kết quả là: " + result);
	// khai báo hàm
	// có 1 giá trị tham số là number sẽ nhận giá trị khi có nơi gọi hàm 
	//và truyền giá trị cho tham số number
	
}
private static int modify(int number) {
	number = 9;
	return number;
}
private static int multiply(int a, int b) {
	return a * b;
}

}
