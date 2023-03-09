package datastructure.object.custom;

public class Ex01ObjectDemo {
	public static void main(String[] args) {
		// Nhắc lại khai báo nguyên thủy
		int digit = 10;

		char letter = 'a';
		// Khai báo đối tượng
		// Item: id, name, prive
		// Để gán giá trị cho biến KDL đối tượng --> phải khởi tạo ô nhớ ở Heap
		// Sau đó gán giá trị của từng thuộc tính vào

		// new Item(); contructor()
		// --> gọi đến hàm khởi tạo rỗng (mặc định) trong class Item
		// --> khởi tạo 1 ô nhớ(đối tượng) ở HEAP
		// Item itX = new Item();
		// --> lấy địa chỉ của ô nhớ trên HEAP
		// gán về cho biến itX
		Item itX = new Item();
		itX.id = 10;
		itX.name = 'X';
		System.out.println("itX id -->" + itX.id);
		System.out.println("itX id -->" + itX.name);
		System.out.println("itX id -->" + itX.price);

		// Tạo một biến itX có id=99, name=Y, price =999;
		Item itY = new Item();
		itY.id = 99;
		itY.name = 'Y';
		itY.price = 999;
		System.out.println("itX id -->" + itY.id);
		System.out.println("itX id -->" + itY.name);
		System.out.println("itX id -->" + itY.price);
		System.out.println("itY --> " + itY);
		// Khởi tạo và gán giá trị cho ô nhớ ở HEAP cùng lúc
		Item itZ = new Item(55, 'Z', 555);
		System.out.println("itX id -->" + itZ.id);
		System.out.println("itX id -->" + itZ.name);
		System.out.println("itX id -->" + itZ.price);

		System.out.println("it Z --> " + itZ);
		// Trong JAVA --> tất cả mọi class định nghĩa ra
		// đều mặc định kế thừa từ class Object
		//
	}

}
