package datastructure.object;

public class Ex01ObjectDemo {
	public static void main(String[] args) {
		// Nhắc lại khai báo nguyên thuỷ
		int Digit = 10;
		char letter = 'a';
		
		// Khai báo đối tượng
		
		// new Item() : constructor
		// --> gọi đến hà khởi tạo rỗng (mặc định) trong class Item
		// --> Khởi tạo 1 ô nhớ (đối tượng) ở HEAP
		// Item itX = new Item();
		//		--> lấy giá trị của ô nhớ trên HEAP gán về cho biến itX

		Item itY = new Item();
		itY.id = 99;
		itY.name = 'Y';
		itY.price = 999;
		System.out.println(itY);
		
		// Tạo một biến itY có id = 11, name = y, price = 999
		//Item itY = new Item(); //H1
		
		/*
			Item itX = new Item(); //H1
			itX.id = 10;
			itX.name = 'X';
			System.out.println("itX id: " + itX.id);
			System.out.println("itX name: " + itX.name);
			System.out.println("itX price: " + itX.price);
			
			System.out.println("=================");
			itY.id = 99;
			itY.name = 'Y';
			itY.price = 999;
			System.out.println("itX id: " + itY.id);
			System.out.println("itX name: " + itY.name);
			System.out.println("itX price: " + itY.price);
		 */

		System.out.println("=================");
		
		Item itZ = new Item(55, 'Z', 555);
		System.out.println(itZ);
	}
}
