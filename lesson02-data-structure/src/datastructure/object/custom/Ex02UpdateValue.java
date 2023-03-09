package datastructure.object.custom;

public class Ex02UpdateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item itA = new Item(1, 'A', 25f);
		Item itB = new Item(2, 'B', 35f);
		
		System.out.println("itA: " + itA);
		System.out.println("itB: " + itB);
		
		System.out.println("itA address: " + System.identityHashCode(itA));
		System.out.println("itB address: " + System.identityHashCode(itB));
		
		itB = itA;
		System.out.println("After itB = itA");
		System.out.println("itA address: " + System.identityHashCode(itA));
		System.out.println("itB address: " + System.identityHashCode(itB));
		
		itB.price = 45;		
		System.out.println("itA: " + itA);
		System.out.println("itB: " + itB);
	}

}
