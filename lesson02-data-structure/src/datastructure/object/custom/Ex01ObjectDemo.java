package datastructure.object.custom;

public class Ex01ObjectDemo {
	public static void main(String[] args) {
		// Nhắc lại khai báo nguyên thủy
		int digit = 10;
		char letter = 'A';
		
		// Khai báo đối tượng
		// Item: id, name, price
		// Item item1 = 1, 'X', 15;
		// �?ể gán giá trị cho biến KDL đối tượng thì 
		// --> phải khởi tạo ô nhớ ở HEAP
		// Sau đó gán giá trị của từng thuộc tính vào
		
		// new Item(); constructor
		//  --> g�?i đến hàm khởi tạo rỗng(mặc định) trong class Item
		//  --> khởi tạo 1 ô nhớ(đối tượng) ở HEAP
		// Item itX = new Item();
		//  --> lấy địa chỉ của ô nhớ trên HEAP
		//      gán v�? cho biến itX
		
		Item itX = new Item(); // H1
		itX.id = 10;
		itX.name = 'X';
		System.out.println("itX id --> " + itX.id);
		System.out.println("itX name --> " + itX.name);
		System.out.println("itX price --> " + itX.price);
		
		// Tạo một biến itY có id=99, name=Y, price = 999;
		Item itY = new Item(); // H2
		itY.id = 99;
		itY.name = 'Y';
		itY.price = 999;
		System.out.println("itY --> " + itY);
		
		// int a = 5;
		// sout(a)
		
		// Khởi tạo và gán giá trị cho ô nhớ ở HEAP cùng lúc
		Item itZ = new Item(55, 'Z', 555);
		System.out.println("itZ --> " + itZ);
		// System.out.println("itZ toString --> " + itZ.toString());
		// Trong JAVA --> tất cả m�?i class định nghĩa ra
		// đ�?u mặc định kế thừa từ class Object
		// Sử dụng m�?i phương thức trong class Object
		// datastructure.object.Item@ad13820d
		
	}
}
