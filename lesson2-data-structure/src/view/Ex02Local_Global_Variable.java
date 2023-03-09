package view;

import datastructure.object.custom.Item;

public class Ex02Local_Global_Variable {
	
	public static int gA = 999;
	
	public static void main(String[] args) {
		int a = 8;
		String text = "hello";
		Item itA = new Item();
		Test(a);
		
		System.out.println("gA1: " + gA);
	}
	
	private static void Test(int a) {
		
	}
}
