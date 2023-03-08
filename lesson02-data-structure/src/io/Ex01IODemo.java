package io;

import java.util.Scanner;

public class Ex01IODemo {
	public static void main(String[] args) {
		//ERROR: troi lenh non-string --> string
		//nextLine: gan gia tri vao bien + xoa enter
		//!nextLine: gan gia tri vao bien, khong xoa enter
		
		
		//viec nhap se ket thuc khi
		// .string --> end khi enter
		// .!string --> phai nhap gia tri gi do roi enter --> end
		
		//input, output --> created by java
		//int, double, char, string
		
		//create an object to input from keyboard
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter id number: ");
//		int id = ip.nextInt();
//		ip.nextLine();// xoa enter
		int id = Integer.parseInt(ip.nextLine());
		
		//1. input a string
		System.out.println("Enter username: ");
		String userName = ip.nextLine();
		
		System.out.println("Enter password: ");
		String passWord = ip.nextLine();
		
		//2. input int number
		System.out.println("Enter age: ");
		int age = Integer.parseInt(ip.nextLine());
		
		//3.input double number
		System.out.println("enter average score: ");
		float average = Float.parseFloat(ip.nextLine());
		
		System.out.println("\n***__-----__***");
		System.out.println("1. id: " + id);
		System.out.println("2. username: " + userName);
		System.out.println("3. password: " + passWord);
		System.out.println("4. age: " + age);
		System.out.println("5. average score: " + average);
		System.out.println("***__-----__***");
	}

}
