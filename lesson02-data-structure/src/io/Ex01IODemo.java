package io;

import java.util.Scanner;

public class Ex01IODemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your name:");
		String name = in.nextLine();
		System.out.print("Enter your age:");
		int age = Integer.parseInt(in.nextLine());
		System.out.print("Enter your salary:");
		float salary = Float.parseFloat(in.nextLine());
		System.out.print("Enter your address:");
		String address = in.nextLine();
		System.out.println("-------------------------------------");
		System.out.println("Your name is : " + name + "\nYour age is : " + age + "\nYour salary is : " + salary +
				"\nYour address is : " + address);
		
	}
}
