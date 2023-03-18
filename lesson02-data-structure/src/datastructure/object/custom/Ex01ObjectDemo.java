package datastructure.object.custom;

public class Ex01ObjectDemo {
public static void main(String[] args) {
	// Khai báo nguyên thủy
	int digit = 10;
	char letter = 'A'; 
	
	// Khai báo đối tượng 
	// new Item -> khởi tạo một ô nhớ HEAP
	// Item itX = new Item();
	//  -> lấy địa chỉ của ô nhớ trên HEAP gán về cho biến itX 
	Item itX = new Item();
	itX.id = 10;
	itX.name = 'X';
	System.out.println("itX id -> " +itX.id);
	System.out.println("itX name -> " + itX.name);
	System.out.println("itX id -> " + itX.price);
	
	Item itY = new Item();
	itY.id = 99;
	itY.name = 'y';
	itY.price = 999f;
	System.out.println("itY -> " + itY);
	
	
	Item itZ = new Item(55, 'Z', 555);
	System.out.println("itZ -> " + itZ);
	System.out.println("itZ -> " + itZ.toString());
	
	// Trong JAVA  -> tất cả mọi class định nghĩa ra 
	// đều mặc định kế thừa từ class Object
	// Sử dụng mọi phương thức trong class Object
	
	// Khởi tạo và gán giá trị cho ô nhớ HEAP cùng lúc 
	
	
	
}
}
