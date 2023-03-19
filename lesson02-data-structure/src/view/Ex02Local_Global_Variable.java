package view;

import datastructure.object.custom.Item;

/**
 * Class
 *   + attribute(global variable)
 *   + method(function) 
 *
 */
public class Ex02Local_Global_Variable {
	
	// Cú pháp-biến toàn cục: [access modifier][static][final] data_type variable_name;
	public static int gA = 999;
	
	public static void main(String[] args) {
		// Phạm vi sử dụng của biến --> block scope {}
		// Biến cục bộ: Biến được khai báo trong 1 hàm nào đó
		// Biến toàn cục(thuộc tính): Biến được khai báo trong 1 class nào đó
		
		// Cú pháp-biến cục bộ:   [final] data_type variable_name;
		int a = 8;
		
		final float PI = 3.14f;
		
		// PI = 1.2f;
		
		String text = "hello";
		
		Item itA = new Item();
		
		test(a);
		
		System.out.println("gA1: " + gA);
	}
	
	public static void test(int input) {
		input = 10;
		
		System.out.println("gA2: " + gA);
	}
}
