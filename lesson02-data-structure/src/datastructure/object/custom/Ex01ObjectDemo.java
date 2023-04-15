package datastructure.object.custom;

public class Ex01ObjectDemo {
     public static void main(String[] args) {
		//Nhắc lại khai báo nguyên thủy
    	int digit = 10;
    	char letter = 'A';
    	 
    	// Khai báo đối tượng
    	// Item: id, name, price
    	// Để gán giá trị cho biến KDL đối tượng thì --> phải khởi tạo ô nhớ ở HEAP, sau đó gán giá trị của từng thuộc tính vào
    	// new Item(); constructor --> gọi đến hàm khoeri tạo rỗng (mặc định) trong class Item
    	//--> khởi tạo 1 ô nhớ (đối tượng) ở HEAP
    	// Item itX = new Item();--> lấy địa chỉ của ô nhớ trên HEAP gán về cho biến itX

    	Item itX = new Item(); // H1
    	itX.id = 10;
    	itX.name = 'X';
    	System.out.println("itX id --> " + itX.id );
    	System.out.println("itX name --> " + itX.name );
    	System.out.println("itX price --> " + itX.price );
    	
    	
    	// Tạo một biến itY có id=99, name=Y, Price=999;
    	Item itY = new Item(); // H2
    	itY.id = 99;
    	itY.name = 'Y';
    	itY.price = 999;
    	System.out.println("itY --> " + itY);
	
        // Khởi tạo và gán giá trị cho ô nhớ ở HEAP cùng lúc
    	Item itZ = new Item(55, 'Z', 555);
        System.out.println("itZ --> " + itZ);
        //System.out.println("itZ toString --> " + itZ.toString());
        
        //Trong Java --> tất cả mọi class định nghĩa ra đều mặc định kế thừa từ class Object
        //Sử dụng mọi phương thức trong class Object

     }
}
