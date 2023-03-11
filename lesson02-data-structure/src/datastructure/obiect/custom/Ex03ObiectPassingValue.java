package datastructure.obiect.custom;

public class Ex03ObiectPassingValue {
	public static void main(String[] args) {
		Item itE = new Item(1, 'A', 22f); //H6
		
		modify(itE);
		System.out.println("itE Price: " + itE.price);
	}
	
	//Item itInput(H6) = itE(H6)
	//Pass by value ? Pass by reference
	//--> truyền biến cho tham số của hàm thì sẽ truyền giá trị hay tham chiếu
	//tham chiếu, tham trị
	//Pass by value at STACK(KNT(giá trị), KDT(địa chỉ))
	private static void modify(Item itInput) {
		itInput.price = 999f;
		Item itZ = new Item(7, 'H', 77f); //H7
		itInput = itZ; //Input(H7)
		itZ.price = 88;
	}

}
