package datastructure.object.custom;

public class Ex03ObjectPassingValue {
	public static void main(String[] args) {
		Item itE = new Item(1, 'A', 22f);
		modify(itE);

		System.out.println("itE price: " + itE.price);
	}
	//Item itInput(H6)=itE(H6);
	//Pass by value ? Pass by reference
	//--> Truyền biến cho tham số của hàm thì sẽ truyền giá trị hay tham chiếu
	//Tham chiếu, tham trị
	//Pass by value at STACK(KNT(giá trị),KTD(địa chỉ)
	private static void modify(Item itInpput) {
		itInpput.price = 999f;
		Item itZ = new Item(7, 'K', 77f);
		itInpput = itZ;
		itZ.price = 88;
	}

}
