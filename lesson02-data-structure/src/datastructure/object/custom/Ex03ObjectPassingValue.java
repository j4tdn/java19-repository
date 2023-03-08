package datastructure.object.custom;

public class Ex03ObjectPassingValue {

	public static void main(String[] args) {
		Item itE = new Item(1,'E', 22f); //H6
		
		//modify(new Item(1,'E', 22f))
		modify(itE); 
		
		System.out.println("itE price: " + itE.price);
		
	}
	
	/*
	 * Item itInput -> itE -> H6
	 * Pass by value ? pass by reference
	 * in JAVA, pass by value at STACK (KDL nguyên thủy: giá trị, KDL object: địa chỉ)
	 */
	//
	private static void modify(Item itInput) {
		itInput.price = 999f;
		Item itZ = new Item(7, 'K', 77f);
		itInput = itZ;
		itZ.price = 88;
	}
	
}
