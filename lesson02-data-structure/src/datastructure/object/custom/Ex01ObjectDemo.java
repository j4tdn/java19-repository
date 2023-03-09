package datastructure.object.custom;

public class Ex01ObjectDemo {
	public static void main(String[] args) {
		// nhắc lại khai báo nguyên thủy
		int digit =10;
		char letter ='A';
		
		
		// khai báo đối tượng
		// item : id, name, price
		Item itx = new Item();
		itx.id=10;
		itx.name= 'X';
		System.out.println("itX id --> "+itx.id);
		System.out.println("itX name --> "+itx.name);
		System.out.println("itX price --> "+itx.price);
		
	}
}
