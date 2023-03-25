package datastructure.object.custom;

public class Ex01ObjectDemo {
	public static void main(String[] args) {
		// Nhắc lại khai báo nguyên thủy
		int digit = 10;
		char letter = 'A';
		//khai báo đối tượng
		//Item:id, name,price
		//Item item1 =1,'A',15;
		//Để gán giá trị cho biến kdl đối tượng thì
		//--> khởi tạo ô nhớ ở HEAP
		//sau đó gán giá trị cho từng thuộc tính
		
		// new Item(); constructor
		//--> gọi đến hàm khởi tạo rỗng(mặc định) trong class Item
		  //   --> khởi tạo ô nhớ(đối tượng) ở HEAP
		//Iten itX = new Item();
		//--> lấy địa chỉ của ô nhớ trên heap
		// gán về cho biến itX
		Item itX = new Item();//H1
		itX.id = 10;
		itX.name = 'X';
		System.out.println("itX id--> " + itX.id);
		System.out.println("itX name--> " + itX.name);
		System.out.println("itX price--> " + itX.price);
		
		//Tạo 1 biến mới itY có id=99, name=y, price =99;
		Item itY = new Item();//H2
		itY.id = 99;
		itY.name = 'y';
		itY.price = 999;
		System.out.println("itY --> " + itY);
		//System.out.println("itY id--> " + itY.id);
		//System.out.println("itY name--> " + itY.name);
		//System.out.println("itY price--> " + itY.price);
		//int a= 5;
		//sout(a);
		// khởi tạo và gán giá trị cho ô nhớ ở HEAP cùng lúc
		Item itZ = new Item(55,'Z',555);
		System.out.println("itZ --> " + itZ);
	//	System.out.println("itZ name--> " + itZ.name);
	//	System.out.println("itZ price--> " + itZ.price);
		//System.out.println("itZ toString--> " + itZ.toString());
		// trong java --> tất cả mọi class định nghĩa ra
		//
		
	}

}
