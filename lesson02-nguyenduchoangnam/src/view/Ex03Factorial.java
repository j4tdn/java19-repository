package view;

import java.util.Random;

import utils.NumberUtil;

public class Ex03Factorial {
	public static void main(String[] args) {
		// n [10, 20]
		int rand = 5 + new Random().nextInt(6);
		System.out.println("f(" + rand + ") --> " + NumberUtil.factorial(rand));
	}
}
