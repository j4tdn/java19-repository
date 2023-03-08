package datastructure.object.custom;

public class Ex01ObjectDemo {
	public static void main(String[] args) {
		//declare primitive data
		int digit = 10;
		char letter = 'A';
		
		//declare object data
		//Item: id, name, price
		
		Item itX = new Item();
		itX.id = 10;
		itX.name = 'X';
		itX.price = 100;
		
		System.out.println("itX id: " + itX.id);
		System.out.println("itX name: " + itX.name);
		System.out.println("itX price: " + itX.price);
		
		//create itY has id = 99, name = Y, price = 999;
		Item itY = new Item();
		itY.id = 99;
		itY.name = 'Y';
		itY.price = 999;
		
		System.out.println("itY id: " + itY.id);
		System.out.println("itY name: " + itY.name);
		System.out.println("itY price: " + itY.price);
		System.out.println("itY --> " + itY);
		
		//Khởi tạo và gán giá trị cho ô nhớ ở HEAP cùng lúc
		Item itZ = new Item(55,'Z',555);
		System.out.println("itZ : " + itZ.toString());
		
	}
}
