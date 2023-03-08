package datastructure.object.custom;

public class Ex02UpdateValue {

	public static void main(String[] args) {
		Item itA = new Item(1,'A',25f);
		Item itB = new Item(2,'B',35f);
		System.out.println("itA code Before:"+System.identityHashCode(itA));
		System.out.println("itA code Before:"+System.identityHashCode(itB));	
		itA= new Item(3,'Z',15f);
		itB=itA;
		System.out.println("itA code After:"+System.identityHashCode(itA));
		System.out.println("itB code After:"+System.identityHashCode(itB));
		System.out.println("itA:"+itA);
		System.out.println("itB:"+itB);
		
	}

}
