package datastructure.primitive;

public class Ex02PrimitiveUpdateValue {
	public static void main(String[] args) {
		//declare value a and b
		int a = 9;
		int b = 5;
		
		//update value
		a = 7;
		
		// change value between a and b
		int temp = a;
		a = b;
		b = temp;
		
		//print value
		System.out.println("Value a is: " + a);
		System.out.println("Value b is: " + b);
	}
}
