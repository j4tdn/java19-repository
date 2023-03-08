package datastructure.object.custom;

public class Ex02UpdateValue {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		
		a = b; //a = 10, b = 10
		Item itA = new Item(1, 'A', 25f); //H1
		Item itB = new Item(2, 'A', 35f); //H2
		
		System.out.println("itA code:" +System.identityHashCode(itA));
		System.out.println("itB code:" +System.identityHashCode(itB));
		
		//itA.name = 'W';
		itA = new Item(1, 'A', 15f); //itA = H3
		itB = itA; //gÁN ở STACK itA(H3) , itB(H3)
//		itA.price =45;
	
		System.out.println("itA code:" +System.identityHashCode(itA));
		System.out.println("itB code:" +System.identityHashCode(itB));
		
		System.out.println("itA" +itA);
		System.out.println("itB" +itB);
}

}
