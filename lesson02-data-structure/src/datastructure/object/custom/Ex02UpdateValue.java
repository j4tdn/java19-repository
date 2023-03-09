package datastructure.object.custom;

public class Ex02UpdateValue {
	public static void main(String[] args) {
		int a =5;
		int b =10;
		
		a = b; // a=10, b=10
		a = 15;
		
		System.out.println("a:" +a);
		System.out.println("b :"+10);
		
		Item itA = new Item(1, 'A', 25f);
		Item itB = new Item(1,'B', 25f);
		
		
		System.out.println("itA code BEF"+System.identityHashCode(itA));
		System.out.println("itB code BEF"+System.identityHashCode(itB));
		 
		itA = new Item(3,'c',15f);
		itB = itA;
		System.out.println("itA code AFT"+System.identityHashCode(itA));
		System.out.println("itB code AFT"+System.identityHashCode(itB));
		 
		System.out.println("itA:" +itA);
		System.out.println("itB : "+itB);
	
	}
}
