package datastructure.object.custom;

public class Ex01ObjectDemo {
	public static void main(String[] args) {
		int digit = 10;
		char letter = 'A';
		
		Item itX = new Item(); // H1
		itX.id = 10;
		itX.name = 'X';
		System.out.println("itX  id --> " + itX.id);
		System.out.println("itX name -->  " + itX.name);
		System.out.println("itX price -->  " + itX.price);
		
		// touch a biến  có id = 99, name = Y, price = 999
		
		Item itY = new Item(); // H2
		itY.id = 99;
		itY.name = 'Y';
		itY.price = 999;
		System.out.println("itY  id --> " + itY.id);
		System.out.println("itY name -->  " + itY.name);
		System.out.println("itY price -->  " + itY.price);
		Item itZ = new Item(55, 'Z', 555);
		
		System.out.println("itZ -->  " + itZ.toString());
		
	}
}
