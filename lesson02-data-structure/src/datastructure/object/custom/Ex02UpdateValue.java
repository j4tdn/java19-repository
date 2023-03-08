package datastructure.object.custom;

public class Ex02UpdateValue {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		Item itA = new Item(1, 'A', 25f);//H4
		Item itB = new Item(2, 'B', 35f);//H5
		
		System.out.println("itA code Before " + System.identityHashCode(itA));
		System.out.println("itB code Before " + System.identityHashCode(itB));
		
		itB = itA;
		itA.price = 15f;
		
		System.out.println("itA code After " + System.identityHashCode(itA));
		System.out.println("itB code After " + System.identityHashCode(itB));
		
		System.out.println("itA: " + itA);
		System.out.println("itB: " + itB);


	}

}
