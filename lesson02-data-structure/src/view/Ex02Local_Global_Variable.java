package view;

import datastructure.object.custom.Item;

public class Ex02Local_Global_Variable {
	// global variable (attribute): declare in class
	// Ở bất kỳ đâu(phương thức) trong class,
	// được dùng bên ngoài class hiện tại(phụ thuộc vào access modifier)
	// syntax: [access modifier][static][final]data_type variable name
	public static int gA = 999;

	public static void main(String[] args) {
		// local variable: declare in method
		// area --> block scope {}
		// syntax: [final] data_type variable name

		int a = 8;
		String text = "hello";

		Item itA = new Item();

		test(a);

		System.out.println("gA1: " + gA);
	}

	private static void test(int input) {
		input = 10;
	}

}
