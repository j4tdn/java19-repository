package view;

import datastructure.obiect.custom.Item;

public class Ex02Local_Global_Variable {
	// Cú pháp-biến toàn cục: [access modifier][static][final] data_type varible_name;
	
	public static int gA = 999;
	
	public static void main(String[] args) {
		//Phạm vi sử dụng của biến -->block scope {}
		//Biến cục bộ: biến được khai báo trong 1 hàm nào đó
		//Biến toàn cục(thuộc tính): biến được khai báo trong 1 class nào đó
		
		//Cú pháp-biến cục bộ: [final] data_type varible_name;

		int a = 8;
		
		final float PI = 3.14f;
		
		//PI = 1.2f;
		
		String test = "hello";
		
		Item itA = new Item();
		
		test(a);
	}
	
	private static void test(int input) {
		input = 10;
	}

}
