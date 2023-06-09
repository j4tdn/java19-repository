package lesson02;

import java.util.Random;

import utils.NumberUntils;

public class Ex03Factorial {
	public static void main(String[] args) {
		int n = 5 + new Random().nextInt(10);
		System.out.println(n + " is factorial " + NumberUntils.factorial(n));
	}

}
