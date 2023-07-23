package datastructure.object.custom;

public class Ex03ObjectPassingValue {
	public static void main(String[] args) {
		Item itE = new Item(1, 'A', 22f);//H6
		
		modify(itE);
		
		System.out.println("itE price: " + itE.price);
	}
	
	// Item itInput(H6) = itE(H6);//H6
	//Pass by value ? Pass  by reference --> truyền biến cho tham số của hàm
	//thì sẽ truyền giá trị hay các tham chiếu, tham trị
	//java là pass by value at STACk(KNT(giá trị), KDT(địa chỉ))
	
	private static void modify(Item itInput) {
		itInput.price = 999f;
		
		Item itZ = new Item(7, 'k', 77f);
		itInput = itZ;
		itZ.price = 88f;
	}
}
