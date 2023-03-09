   package datastructure.object.custom;

public class Ex03ObjectPassingValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item itA = new Item(1, 'A', 22f);
		modify(itA);
		System.out.println(itA);
		Integer a = null;
		System.out.println(a);
	}
	
	// pass by value / pass by reference --> Truyen bien cho tham so
	// cua ham thi se truyen gia tri hay tham chieu
	// tham chieu, tham tri
	// Java: pass by value at STACK (kieu nguyen thuy: gia tri, kieu obj: diachi)
	private static void modify(Item itInput) {
		itInput.price = 99.9f;
		Item itZ = new Item(7, 'K', 77f);
		itInput = itZ;
		itZ.price = 11f;
	}

}
