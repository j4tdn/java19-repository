package datastructure.primitive;

public class Ex03PrimitivePassingValue {
	public static void main(String[] args) {
		//declare value a and b
		int a = 9;
		int b = 5;
		
		//update value b = 9 by function updateValue
		b = updateValue(b);
		mul(a, b);
		
		//print value
		System.out.println("Value b after update is: " + b);
		System.out.println("result a * b is: " + mul(a, b));
	}
	
	private static int updateValue(int number) {
		number = 9;
		return number;
	}
	
	private static int mul(int a, int b) {
		return a * b;
	}
}
