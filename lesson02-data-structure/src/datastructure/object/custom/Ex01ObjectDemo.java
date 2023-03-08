package datastructure.object.custom;

public class Ex01ObjectDemo {

	public static void main(String[] args) {
		// nhắc lại khai báo nguyên thủy
		int digit =10;
		char letter='A';
		
		
		//Khai báo đối tượng
		//new Item()--> khởi tạo ô nhớ ở HEAP
		Item itX =new Item(); 
		itX.id=10;
		itX.name='X';
		System.out.println("itX id-->"+itX.id);
		System.out.println("itX name-->"+itX.name);
		System.out.println("itX price-->"+itX.price);
		// tạo một biến itY có id=99, name =Y, price=999
		Item itY =new Item(); 
		itY.id=99;
		itY.name='Y';
		itY.price=999;
		System.out.println("itY id-->"+itY.id);
		System.out.println("itY name-->"+itY.name);
		System.out.println("itY price-->"+itY.price);
		//
		Item itZ=new Item(55,'Z',555);
		System.out.println("itZ -->"+itZ);
	}

}
