package ex03.view;

import java.util.Scanner;

public class Menu {
	private static String[] options;

	public Menu() {
	}

	Menu(String[] options) {
		Menu.options = options;
	}

	public static void displayMenu() {
		for (int i = 0; i < options.length; i++) {
			System.out.println((i + 1) + "." + options[i]);
		}
		System.out.println("--------------------------");
	}

	public static int getChoice() {
		boolean check;
		int choice = 0;
		do {
			try {
				check = true;
				System.out.print("Enter your selection..");
				Scanner sc = new Scanner(System.in);
				choice = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				check = false;
				System.out.println("Your choice must be a number in [0-" + options.length + "]!");
			}

		} while (!check);
		return choice;

	}

}
