package datastructure.primitive;

public class Ex03PrimitivePassingValue {
	public static void main(String[] args) {
		//declare and create value
		int a = 5;
		int b = 7;
		
		//update a = 9
		a = modify(a);//parameter( direct value or variable)
		System.out.println("value of a: " + a);
		
		// multiple of a and b
		int result = multifly(a, b);
		System.out.println("result a * b = " + result);
	}
	
	//declare method
	//parameter is number
	//nhiệm vụ update number = 9
	private static int modify(int number) {
		number = 9;
		return number;
	}
	
	private static int multifly(int a,int b) {
		return a * b;
	}
}
