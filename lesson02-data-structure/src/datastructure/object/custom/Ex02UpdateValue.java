package datastructure.object.custom;

public class Ex02UpdateValue {

	public static void main(String[] args) {
		// toán tử = dùng để gán giá trị ở vùng nhớ STACK
		int a = 5;
		int b = 10;
		
		a = b; //a=10, b=10
		a = 15;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		Item itA = new Item(1, 'A', 25f); //H4
		Item itB = new Item(2, 'B', 35f); //H5
		
		System.out.println("itA code BEF: " + System.identityHashCode(itA)); //H4 
		System.out.println("itB code BEF: " + System.identityHashCode(itB)); //H5
		
		//itB.name = 'Z';
		//itA.name = 'W';
		itA = new Item(3, 'C', 15f); // itA -> H6
		itB = itA; //gán ở STACK itB -> itA -> H6
		//itA.price = 45;
				
		System.out.println("itA code AFT: " + System.identityHashCode(itA)); //H4
		System.out.println("itB code AFT: " + System.identityHashCode(itB)); //H4

		
		System.out.println("itA: " + itA); 
		System.out.println("itB: " + itB); 
	}

}
