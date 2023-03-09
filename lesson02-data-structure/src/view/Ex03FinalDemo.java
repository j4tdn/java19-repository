package view;

import datastructure.object.custom.Item;

public class Ex03FinalDemo {
	public static void main(String[] args) {
		//Final
		//Khi thêm từ khoá final vào trước phần khai báo biến
		//Vd: final int a; final Item x;
		// --> thì mình không thể dùng toán tử = để gán giá trị khác cho a hay x nữa
		
		//KDL nguyên thuỷ
		int digit = 28;
		final int age = 19;
		
		// age = digit --> ko dc
		
		
		
		// KDL đối tượng
		final Item it1 = new Item(123,'a',252f);
		Item it2 = new Item(123,'a',252f);
		
		//it1 = it2
		it1.id = 174;
		System.out.println("it1 - "+ it1);
		
		
		
	}
}
