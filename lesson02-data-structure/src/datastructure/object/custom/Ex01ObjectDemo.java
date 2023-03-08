package datastructure.object.custom;

public class Ex01ObjectDemo {
	public static void main(String[] args) {
		int digit = 10;
		char letter = 'A';
		// new Item(); -> khởi tạo 1 ô nhớ(đối tượng) ở HEAP
		//             -> gọi đến hàm khởi tạo rỗng(mặc định) trong class Item
		// Item itX = new Item(); 
        // -> lấy địa chỉ của ô nhớ trên HEAP
		// -> gán về cho biến itX
		Item itX = new Item();
		itX.id = 10;
		itX.name = 'X';
		System.out.println("itX id: " + itX.id);
		System.out.println("itX id: " + itX.name);
		System.out.println("itX id: " + itX.price);
		//Tạo một biến itY có id = 99, name = Y, price = 999
		Item itY = new Item();
		itY.id = 99;
		itY.name = 'y';
		itY.price = 999;
		System.out.println("itY:" + itY);
		// Khởi tạo và gán giá trị cho ô nhớ ở HEAP cùng lúc
		Item itZ = new Item(55, 'Z', 555);
		System.out.println("itZ:" + itZ);
		
	}

}
