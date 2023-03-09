package view;

import datastructure.object.custom.Item;

/*
 * 
 * */

public class Ex02Local_Global_Variable {
	
	static int gA = 999;
	

	public static void main(String[] args) {
		// pham vi su dung cua bien --> block scope {}
		// bien cuc bo la bien duoc khai bao trong 1 ham nao do
		// bien toan cuc (thuoc tinh) la bien duoc khai bao trong 1 class nao do
		
		// cu phap: [access modifier][static][final] data_type variable_name;
		int a = 11;
		
		String text = "Hello";
		
		Item itA = new Item();
		System.out.println(gA);
	}
	
	private static void test() {
		
	}

}
