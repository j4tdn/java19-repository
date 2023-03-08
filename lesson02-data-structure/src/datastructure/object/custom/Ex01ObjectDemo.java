package datastructure.object.custom;

public class Ex01ObjectDemo {
	public static void main(String[] args) {
		
		
		//new Item(); contructor
		// -->goi den ham khoi tao rong
		Item itX = new Item();
		itX.id = 10;
		itX.name = 'X';
		
		System.out.println("itx id --> " + itX.id);
		System.out.println("itx name --> " + itX.name);
		System.out.println("itx price --> " + itX.price);
		
		
		Item itY = new Item();
		itY.id = 99;
		itY.name = 'Y';
		itY.price = 999;
		
		System.out.println("ity id --> " + itY.id);
		System.out.println("ity name --> " + itY.name);
		System.out.println("ity price --> " + itY.price);
		System.out.println("ity -->" + itY);
		
		//khoi tao va gan gia tri cho o nho o HEAP cung luc
		Item itZ = new Item(55, 'Z', 555);
		System.out.println("itz id --> " + itZ.id);
		System.out.println("itz name --> " + itZ.name);
		System.out.println("itz price --> " + itZ.price);
		
		System.out.println("itz -->" + itZ);
		
		
		//trong java --> tat ca moi class dinh nghia ra 
		//deu mac dinh ke thua tu class object
		
	}
}
