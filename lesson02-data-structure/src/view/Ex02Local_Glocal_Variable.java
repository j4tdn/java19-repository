package view;

import datastructure.object.custom.Item;
/*
 * Class
 *  + attribute(global variable)
 *  + method(funtion)
 * 
 * 
 */



public class Ex02Local_Glocal_Variable {
	
	 static int gA =999;
	
	
	public static void main(String[] args) {
		//Phạm vi sử dụng cảu biến --> block scope {}
		// Biến cục bộ : biến được khai báo trong 1 hàm nào đó
		// Biến toàn cục: Biến được khai báo trong 1 class nào đó 
		// cú pháp biến toàn cục
		// cú pháp biến cục bộ
		int a = 8;
		
		final float PI = 3.14f;
	
		
		String text = "hello";
		
		Item A = new Item();
		test(a);
		System.out.println("gA1 :" + gA);
		
		
	}
	private static void test(int input) {
		input = 10;
		System.out.println("gA2 :" + gA);
		
	}

}
