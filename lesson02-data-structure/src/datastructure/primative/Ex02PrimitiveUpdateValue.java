package datastructure.primative;

public class Ex02PrimitiveUpdateValue {
	
	
	public static void main(String[] args) {
		//Khai báo
		
		int a = 7;
		int b = 5;
		
		// Update value
		// Use operator '='
		a = 9;
		
		// Hoán vị value of 2 biến
		int tmp = a;
		a = b;
		b = tmp;
		
		//Call and print out
		
		System.out.println("Giá trị của a: " + a);
		System.out.println("Giá trị của b: " + b);
	}
}
