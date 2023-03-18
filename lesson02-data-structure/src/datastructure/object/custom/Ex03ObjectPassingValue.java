package datastructure.object.custom;

public class Ex03ObjectPassingValue {
	public static void main(String[] args) {
		Item itE = new Item(1, 'A', 22f);
		modify(itE);
		System.out.println("itE: " + itE.price);
		
	}
	//Item itInput(H6) =  itE(H6);
	//Pass by value at STACK(KNT(địa chỉ), KDT(giá trị)): truyền thông tin cho tham số của hàm 
	private static void modify(Item itInput) {
		itInput.price = 999f;
		Item itZ = new Item(7,'K', 77f);
		itInput = itZ;
		itZ.price = 88;
	}

}