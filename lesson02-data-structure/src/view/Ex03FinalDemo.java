package view;

import datastructure.object.custom.Item;

public class Ex03FinalDemo {
	public static void main(String[] args) {
		// Final (affected in STACK)
		// final int a; final Item x;
		// --> can't use = to set a, x in STACK
		// but can set in HEAP

		// Primitive type
		int digit = 18;
		final int age = 28;

		// age = digit;

		// object type with final
		final Item it1 = new Item(123, 'A', 252f);// H1
		Item it2 = new Item(234, 'B', 363f);// H2

		// it1 = it2;//it1(H2)
		it1.id = 474;

		System.out.println("it1: " + it1);
	}

}
