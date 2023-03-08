package datastructure.primitive;

public class Ex02PrimitiveUpdateValue {
	public static void main(String[] args) {
		int a = 7;
		int b =5;
		//a = b;
		a = 9;
		
		//swap
		int tmp = a;
		a = b;
		b= tmp;
		
		
		System.out.println("Gia tri a: " + a);
		System.out.println("Gia tri b: " + b);
		
	}
}
