package view;

import datastructure.object.custom.Item;

public class Ex02Local_Global_Variable {
	
	public static int gA = 999;
	
	public static void main(String[] args) {
		
		//Phạm vi của biến --> block scope {}
		//Biến cục bộ được khai báo trong hàm nào đó
		//Biến toàn cục(thuộc tính) được khai báo trong 1 class nào đó
		
		// Cú pháp biến toàn cục: [acces modifier][static][final]data_type variable_name
		// Cú pháp biến cục bộ: [final]data_type variable_name
		int a = 8;
		String text = "Hello";
		Item itA = new Item();
		test(a);
		System.out.println("gA1: " + gA);
	}
	private static void test(int input) {
		input = 10;
	}
}
