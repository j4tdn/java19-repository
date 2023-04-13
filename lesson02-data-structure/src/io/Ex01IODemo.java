package io;

import java.util.Scanner;

public class Ex01IODemo {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Input ID: ");
		int id = Integer.parseInt(ip.nextLine());

		System.out.print("Input username: ");
		String username = ip.nextLine();
		System.out.print("Input password: ");
		String password =  ip.nextLine();
		System.out.print("Input Average point: ");
		float avgPoint = Float.parseFloat(ip.nextLine());
		
		System.out.println("---------=---------");
		System.out.println("1.ID: " + id);
		System.out.println("2.Username: " + username);
		System.out.println("3.Password " + password);
		System.out.println("4.Average point: " + avgPoint);
	}
}
