package datastructure.object.custom;

public class Ex03ObjectPassingValue {
	public static void main(String[] args) {
		Item itE = new Item(1, "A", 22f);
		
		modify(itE);
		
		System.out.println(itE);
		
	}
	
	//Pass by value ? Pass by reference
	// -->Truyền biến cho tham số của hàm thì sẽ truyền gias trị tham chiếu
	
	//Tham trị là truyền giá trị và gám giá trị
	//Tham chiếu là truyền địa chỉ và gán địa chỉ
	
	//Pass by value at STACK(KNT(giá trị), KDT(địa chỉ))
	
	private static void modify (Item itInput) {
		itInput.price = 999f;
		
		Item itZ = new Item(7,"K", 77f);
		itInput = itZ;
		itZ.price = 88;
	}
}
