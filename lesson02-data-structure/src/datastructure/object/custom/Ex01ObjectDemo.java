package datastructure.object.custom;

public class Ex01ObjectDemo {
	public static void main(String[] args) {
		//nhắc lại kiểu nguyên thủy
		int digit = 10;
		char letter = 'A';
		
		//khai báo đối tượng
		//Item: id, name, price
		// để gán giá trị cho biến KDL đối tượng thig
		//--> pải khơi tạo ô nhớ HEAP
		//Sau đó gán giá trị cho từng thuộc tính vào
		
		//New Item(); constructor
		//--> gọi đển hàm khởi tạo  rỗng(mặc định) trong class Item
		//--> khởi tạo giá trị ô nhớ(đối tượng) ở HEAP
		//Item itX = new Item();
		//--> lấy địa chỉ của ô nhớ trên HEAP
		//	gán về cho biến itX
		
		
		Item itX = new Item();//H1
		itX.id = 10;
		itX.name = 'X';
		//itX.price = 999.f;
		System.out.println("itX id --> " + itX.id);
		System.out.println("itX name --> " + itX.name);
		System.out.println("itX price --> " + itX.price);
		
		//  Tạo một biến itX có id=99, name=Y, price= 999;
		
		Item itY = new Item();//H2
		itY.id = 99;
		itY.name = 'Y';
		itY.price = 999.f;
		System.out.println("itY id --> " + itY.id);
		System.out.println("itY name --> " + itY.name);
		System.out.println("itY price --> " + itY.price);
		
		//int a = 5;
		//sout(a);
		
		// khởi tạo và gán giá trị cho ô nhớ ở HEAP cùng lúc
		Item itZ = new Item(55, 'Z' , 555);
		System.out.println("itZ --> " + itZ);
	//	System.out.println("itZ to String --> " + itZ.toString());
		// trong JAVA --> tấc cả mọi class đều mặc định
		
		
		//datastructure.object.Item@53bd815b
	}
}
