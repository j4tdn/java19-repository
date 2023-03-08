package view;

import datastructure.object.custom.Item;

public class Ex03Final_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Final
		//Khi thêm final vào trước phần khai boá biến
		//VD: final int a; final Item x;
		//--> Thì mình không thể dùng toán tử = đến gán giá trị khác
		// cho a hay x nữa
		
		//KDL nguyên thuỷ - primitive type
		int digit = 18;
		
		final int age = 22;
		
//		age = digit;
		//KDL đối tượng
		
		final Item it1 = new Item(123,'A', 22f); //H1
		Item it2 = new Item(234,'B', 23f); //H2
		
		//it1 = it2; //it1(H2)
		it1.id = 789;
		
		System.out.println("it1 --> " +it1);

	}

}
