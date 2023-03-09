package datastructure.primitive;

public class Ex02PrimitiveUpdateValue {
	public static void main(String[] args) {
		// khai bao
		int a = 7;
		int b = 5;
		
		// hoán vị 2 biến
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("Gia tri a: " + a);
		System.out.println("Gia tri b: " + b);
	}
}
