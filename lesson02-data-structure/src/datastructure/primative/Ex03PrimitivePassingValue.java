package datastructure.primative;

public class Ex03PrimitivePassingValue {
	public static void main(String[] args) {
		//Khai báo và gán value
		int a = 5;
		int b = 7;
		modify(a);
		int result = multiply(a, b);
		System.out.println("Kết quả a * b: " + result);
		
	}
	//Update value of a for 9 with hàm
	// Have a tham số is number
	// Truyền giá trị cho tham số number
	private static int modify(int number) {
		number = 9;
		return number;
	}
	
	private static int multiply(int a, int b) {
		return a * b;
	}
}
