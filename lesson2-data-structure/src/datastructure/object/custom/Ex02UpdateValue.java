package datastructure.object.custom;

public class Ex02UpdateValue {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;

		a = b; // a=10, b=10;
		System.out.println("a: "+ a);
		System.out.println("b: "+ b);
		
		Item itA = new Item(1, 'A', 25);
		Item itB = new Item(2, 'B', 35);
		
		System.out.println("itA code before: "+ System.identityHashCode(itA));
		System.out.println("itB code before: "+ System.identityHashCode(itB));
		
		itA = new Item(2, 'Z', 45); //lấy itA tr�? tới new Item tạo ở HEAP
		itB = itA; // gán ở STACK
//		itA.price = 45;
//		System.out.println(itA.price);
//		System.out.println(itB.price);
		System.out.println("itA code after: "+ System.identityHashCode(itA));
		System.out.println("itB code after: "+ System.identityHashCode(itB));
		
		System.out.println("itA = " + itA);
		System.out.println("itB = " + itB);
	}
}
