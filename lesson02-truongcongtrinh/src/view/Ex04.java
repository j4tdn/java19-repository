package view;

import java.util.Random;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter numbers of random number: ");
		Integer randomNumber = Integer.parseInt(sc.nextLine());
		System.out.println("Result: " + calRandomFraction(randomNumber));
	}

	public static long calRandomFraction(int numOfRandom) {
		int[] randomArray = new int[numOfRandom];
		Random rd = new Random();
		for (int i = 0; i < numOfRandom - 1; i++) {
			randomArray[i] = 10 + rd.nextInt(10);
			System.out.println("Random " + (i+1) + ":" + randomArray[i]);
		}
		long res = 0;
		for (int i = 0; i < numOfRandom - 1; i++) {
			res += Ex03.calFraction(randomArray[i]);
		}
		return res;

	}
}
