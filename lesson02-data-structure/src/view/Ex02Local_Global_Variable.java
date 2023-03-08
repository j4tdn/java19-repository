package view;

import datastructure.object.custom.Item;

public class Ex02Local_Global_Variable {
	// Cú pháp- biến toàn cục: [access modifier][static][final] dta_type variable_name
	public static int gA = 999;
	
	public static void main(String[] args) {
		// Phạm vi sử dụng của biến --> block code{}
		// Biến cục bộ: Biến được khai báo trong 1 hàm nào đó
		// Biến toàn cục(thuộc tính): Biến được khai báo trong 1 class nào đó
		
		// Cú pháp- biến cục bộ : [final] dta_type variable_name
		int a = 10;
		
		String text = "Hello";
		
		Item itA = new Item();
		
		test(a);
		
		System.out.println("gA1: " + gA);

	}
	
	public static void test(int input) {
		input = 10;
	}
}
