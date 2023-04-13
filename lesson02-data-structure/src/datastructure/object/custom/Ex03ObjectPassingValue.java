package datastructure.object.custom;


public class Ex03ObjectPassingValue {
	public static void main(String[] args) {
		Item itE = new Item(1, 'A', 22);
		modify(itE);
		System.out.println(itE.price);
	}
	
	// tham trị là truy�?n và gán giá trị
	//tham chiếu là truy�?n và gán địa chỉ
	private static void modify(Item itInput) {
		itInput.price = 999f;
		Item itZ = new Item(7, 'K', 77f);
		itInput = itZ;
		itZ.price = 88;
	}
}
