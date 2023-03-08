package view;

import datastructure.object.custom.Item;

public class Ex03FinalDemo {
	public static void main(String[] args) {
		// Final
		//Khi thêm từ khóa final vào trước phần khai báo biến
		//VD: final int a; final int x;
		//--> Thì mình không thể dùng toán tử = đến gán giá trị khác
		//cho a hay x nữa
		
		// KDL nguyên thủy - primitive type
		int digit = 18;
		final int age = 28;
		
		//age = digit;
		
		//KDL đối tượng
		final Item it1 = new Item(123, 'A', 252f);//H1
		Item it2 = new Item(234, 'B', 363f);//H2
		//it1 = it2;
		
		it1.id = 474;
		System.out.println("it1 -->" + it1);
	}

}
