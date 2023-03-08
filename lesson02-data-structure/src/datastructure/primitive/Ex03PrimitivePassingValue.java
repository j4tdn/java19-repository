package datastructure.primitive;

public class Ex03PrimitivePassingValue {
	public static void main(String[] args) {
		
		int a = 5;
		int b = 7;
		a = modify(a);
		
		System.out.println("Gia tri cua a: " + a);
		
		//Tim tich a,b
		int result = mul(a,b);
		System.out.println("Ket qua: " + result);
	}
	
	private static int modify(int number) {
		number = 9;
		return number;
	}
	private static int mul(int a, int b) {
		return a*b;
	}
}
