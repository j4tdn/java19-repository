package datastructure.obiect.custom;

public class Ex01ObjiectDemo {
	public static void main(String[] args) {
		//nhắc lại khai báo nguyên thuỷ 
		int id = 10;
		char name = 'A';
		
		//khai báo đối tượng
		//Item item1 = 1, 'X', 15;
		//để gán giá trị cho biến KDL đối tượng thì 
		//--> phải gán giá trị cho 
		Item itX = new Item(); //H1
		itX.id = 10;
		itX.name = 'X';
		System.out.println("itX id --> " + itX.id);
		System.out.println("itX name--> " + itX.name);
		System.out.println("itX price--> " + itX.price);
		
		//tạo 1 biến itY có id = 99, name = y, price = 999,
		Item itY = new Item(); //H1
		itY.id = 99;
		itY.name = 'y';
		itY.price = 999;
		System.out.println("itY id --> " + itY.id);
		System.out.println("itY name--> " + itY.name);
		System.out.println("itY price--> " + itY.price);
		
		
		//khởi tạo và gán giá trị cho ô nhớ ở HEAP cùng lúc
		Item itZ = new Item(55, 'Z', 555);
		System.out.println("itZ --> " + itZ);
		//System.out.println("itZ toString --> "+ itZ.toString());
		//Trong Java --> tất cả mọi class định nghĩa ra 
		//đều mặc định kế thừa từ class Object
		//Sử dụng mọi phương thức trong class Object
		//datastructure.object.Item@ad13830d
	}
	

}
