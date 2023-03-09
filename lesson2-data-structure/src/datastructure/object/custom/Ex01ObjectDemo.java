package datastructure.object.custom;

public class Ex01ObjectDemo {
	public static void main(String[] args) {
		//Nhac lai khai bao nguyen thuy
		int digit = 10;
		char letter = 'A';
		
		
		Item itX = new Item();
		//Lay dia chi o nho tren HEAP gan chi itX
		itX.id = 10;
		itX.name = 'X';
		itX.price = 2000;
		System.out.println("itX id => "+itX.id);
		System.out.println("itX name => "+itX.name);
		System.out.println("itX price => "+itX.price);
		
		System.out.println(itX.toString());
	}
}
