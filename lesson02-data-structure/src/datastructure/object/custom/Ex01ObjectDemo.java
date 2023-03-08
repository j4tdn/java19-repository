package datastructure.object.custom;

public class Ex01ObjectDemo {

	public static void main(String[] args) {
		// Nhắc lại khai báo nguyên thủy
		int digit = 10;
		char letter = 'A';
		
		// Khai báo đối tượng
		// Item: id, name, price
		// Để gán giá trị cho biến KDL object thì
		// phải khởi tạo ô nhớ (đối tượng) ở HEAP
				
		// new Item(); 
				//--> khởi tạo 1 ô nhớ ở HEAP
				// gọi đến hàm khởi tạo rỗng (constructor mặc định) trong class Item
		// Item itX = new Item();
				// --> lấy địa chỉ của ô nhớ trên HEAP gán về cho biến itX
		// itX nằm ở STACK, có giá trị là địa chỉ của ô nhớ trên HEAP		
		Item itX = new Item(); // H1
		itX.id = 10;
		itX.name = 'X';
		
		System.out.println("itX id --> " + itX.id);
		System.out.println("itX name --> " + itX.name);
		System.out.println("itX price --> " + itX.price);
		
		// Tạo 1 biến itY có id=99, name=Y, price=999
		Item itY = new Item(); // H2
		itY.id = 99;
		itY.name = 'Y';
		itY.price = 999;
		
		System.out.println("itY id --> " + itY.id);
		System.out.println("itY name --> " + itY.name);
		System.out.println("itY price --> " + itY.price);
		
		
		// Khởi tạo vào gán giá trị cho ô nhớ HEAP cùng lúc
		Item itZ = new Item(55, 'Z', 555);
		System.out.println("itZ --> " + itZ);
		// itZ --> datastructure.object.Item@2c7b84de

		//System.out.println("itZ --> " + itZ.toString());
		// itZ --> datastructure.object.Item@2c7b84de
		
		//Trong JAVA, mọi class định nghĩa ra đều mặc định kế thừa từ class Object

	}

}
