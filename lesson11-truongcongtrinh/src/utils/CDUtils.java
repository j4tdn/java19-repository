package utils;

import java.util.Scanner;

import bean.CD;

public class CDUtils {
	private static final Scanner sc = new Scanner(System.in);

	private CDUtils() {
	}

	public static void main(String[] args) {
		inputCD();
	}

	private static CD inputCD() {
		System.out.println("\n===========ADD-CD===========\n");
		String id = "";
		while (true) {
			try {
				if(isValidId(id)) break;
				System.out.print("Enter CD Id: ");
				id = sc.nextLine();
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
				break;
			}
		}
		return new CD();
	}

	public static boolean isValidId(String id) {
		if (!id.matches("[0-9]+") && !id.isEmpty()) {
			throw new IllegalArgumentException("Id Must be a positive number!");
		}
		return id.matches("[0-9]+");
	}

}
