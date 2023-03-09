package datastructure.primitive;

public class Ex02PrimitiveUpdateValue {
	public static void main(String[] args) {
		int a = 5; 
		int b = 7;
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("Giá trị của a: " + a);
		System.out.println("Giá trị của b: " + b);
	}
}
