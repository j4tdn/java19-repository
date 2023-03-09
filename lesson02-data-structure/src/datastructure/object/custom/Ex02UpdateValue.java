package datastructure.object.custom;

public class Ex02UpdateValue {
	
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		
		a = b;
		a = 15;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		Item itA = new Item(1, 'A', 25f);
		Item itB = new Item(2, 'B', 35f);
		
		
		System.out.println("itA code BFT: " + System.identityHashCode(itA));
		System.out.println("itB code BFT: " + System.identityHashCode(itB));
		itA = new Item(3,'C',15f);
		itB = itA;
		
		System.out.println("itA code BFT: " + System.identityHashCode(itA));
		System.out.println("itA code BFT: " + System.identityHashCode(itB));

	}
	
}
