package view;

import datastructure.object.custom.Item;

public class Ex02Local_Global_Variable {
	public static int gA = 999;
	
	public static void main(String[] args) {
		//Phajm vi sử dụng của biến -- > block scope {}
		//Biến cục bộ : Biến được khai báo trong 1 hàm nào đó
		//Biến toàn cục (thuộc tính) : Biến được khai báo trong 1 class nào đó
		
		
		int a =8;
		
		
		String text = "hello";
		
		 Item itA = new Item();
		
		test(a);
	}
	private static void test(int x) {
		
	}
}
