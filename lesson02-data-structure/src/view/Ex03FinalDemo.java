package view;

import datastructure.object.custom.Item;

public class Ex03FinalDemo {
	public static void main(String[] args) {
		//Final
		//Khi thêm từ khoá final vào trước khai báo biến
		//VD: final int a; final Item x;
		//--> thì mình không thể dùng toán tử = để gán giá trị khác cho a hay x nữa
		
		
		//KDL nguyên thuỷ - primitive type
		int digit = 18;
		final int age = 28;
		
		//age = digit;
		
		//Kdl đối tượng
		final Item it1 = new Item(123, 'A', 252f);
		Item it2 = new Item(234, 'B', 363f);
		
		//it1 = it2;
		it1.id = 474;
		System.out.println("it1 --> " + it1);
	}
}
