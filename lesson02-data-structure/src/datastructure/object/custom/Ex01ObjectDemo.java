package datastructure.object.custom;

public class Ex01ObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Nhắc lại khai báo nguyên thuỷ
		int digit = 10;
		char letter = 'A';
		
		//Khai báo đối tượng
		//Item: id, name, price
		//Để gán giá trị cho biến kiểu dữ liệu đối tượng thì --> phải khởi tạo ô nhớ ở HEAP
		// new Item(); --> CONSTRUCTOR -->khởi tạo ở ô nhớ HEAP;
//		Item item1 = new Item();
//		//lấy địa chỉ của ô nhớ trên HEAP
//		//GÁN VỀ CHO BIẾN item1
//		item1.id = 10;
//		item1.name = 'X';
//		item1.price = 99;
//		
//		System.out.println("item1 id -->" +item1.id);
//		System.out.println("item1 name -->" +item1.name);
//		System.out.println("item1 price -->" +item1.price);
		
		//Khởi tạo và gán giá trị cho ô nhớ ở HEAP cùng lúc
		Item item1 = new Item(10, 'Y', 99);
		System.out.println("item1 id -->" +item1.id);
		System.out.println("item1 name -->" +item1.name);
		System.out.println("item1 price -->" +item1.price);
		
		//Trong java --> tất cả mọi class định nghĩa ra 
		//đều mặc định kế thừa từ class object
		//sử dụng mọi phương thức trong class object
		
		System.out.println("Item : " + item1);
		
	}

}
