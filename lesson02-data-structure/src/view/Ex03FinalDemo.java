package view;

import datastructure.object.custom.Item;

public class Ex03FinalDemo {

	public static void main(String[] args) {
		//Final
		//	Khi thêm final vào trước phần khai báo biến
		//	vd: final int a; final Item x;
		//		--> không thể thêm toán tử = đển gán giá trị khác cho a và x nữa
		
		//KDL nguyên thủy- primitive type
		int digit = 18;
		final int age = 28;
		
		//age = digit; //ko thực hiện được
		
		final Item it1 = new Item(123, 'A', 252f);	//H1
		Item it2 = new Item(234, 'B', 363f);	//H2
		
		//it1 = it2; //it1(H2) ko thực hiện được 
		// tuy nhiên có thể thay đổi giá trị của object tại HEAP (nếu truy cập được)
		
	}

}
