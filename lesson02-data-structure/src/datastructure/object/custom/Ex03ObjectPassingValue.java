package datastructure.object.custom;

public class Ex03ObjectPassingValue {
	public static void main(String[] args) {
		Item itE = new Item(1,'A',22f);// H6 999f
		
		modify(itE);
		
		System.out.println("itE price: " + itE.price);
	}
	
	//Item itInput(H6) = itE(H6);
	//JAVA --> Pass by value in STACK 
	//-->> truyen bien cho tham so cua ham
	//tham chieu(coppy địa chỉ), tham trị(coppy giá trị)
	private static void modify(Item itInput) {
		// truyền vô, gán cho --> toán tử = -->pass by value in STACK
		//KNT(VALUE), Object( địa chỉ)
		itInput.price = 999f;
		
		Item itZ = new Item(7,'K',77f);//H7
		itInput = itZ;// itInput(H7)
		itZ.price = 88;
	}
}
