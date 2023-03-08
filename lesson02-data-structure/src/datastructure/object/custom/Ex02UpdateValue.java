package datastructure.object.custom;

public class Ex02UpdateValue {
	public static void main(String[] args) {
		//== --> set value in Stack
		int a = 5;
		int b = 10;
		
		a = b;//a =10, b = 10;
		a = 15;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		Item itA =  new Item(1, 'A',25f);//H4
		Item itB =  new Item(2, 'B',35f);//H5
		
		System.out.println("itA CODE BEFORE: " + System.identityHashCode(itA));
		System.out.println("itB CODE BEFORE: " + System.identityHashCode(itB));
		
		//itB.name = 'Z'; //H5 --> Z
		//itA.name = 'W';
		itA = new Item(3, 'C', 15f);// itA(H6)
		itB = itA;// cả 2 đều trỏ đến H6
		//itA.price = 45;
		
		System.out.println("itA CODE AFTER: " + System.identityHashCode(itA));
		System.out.println("itB CODE AFTER: " + System.identityHashCode(itB));
		
		System.out.println("itA: " + itA);
		System.out.println("itB: " + itB);
	}
}
