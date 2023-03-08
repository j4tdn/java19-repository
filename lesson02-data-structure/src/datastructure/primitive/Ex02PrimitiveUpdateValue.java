package datastructure.primitive;

public class Ex02PrimitiveUpdateValue {
	public static void main(String[] args) {
		// all demo in the same method
		
		//declare and create value
		int a = 7;
		int b = 5;
		
		//update variable's value
		//using operator = 
		//left = right --> set value (in STACK) of right to left
		a = 9; // a = 9, b = 5
		
		//Hoán vị giá trị của 2 biến
		int tmp = a; //tmp = 9
		a = b; // a = 5
		b = tmp;// b = 9
		
		//call and print
		System.out.println("value of a: " + a);
		System.out.println("value of b: " + b);
	}
}
