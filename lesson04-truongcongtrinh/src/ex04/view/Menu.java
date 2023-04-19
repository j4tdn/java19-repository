package ex04.view;

import java.util.Scanner;


public abstract class Menu {
	private String[] options;
	private String title;

	public Menu(String title, String[] options) {
		this.title = title;
		this.options = options;
	}

	public void displayMenu() {
		System.out.println();
		System.out.println(title);
		System.out.println("================================");
		for (int i = 0; i < options.length; i++) {
			System.out.println(i + 1 + "." + options[i]);
		}
		System.out.println("================================");
	}

	public int getChoice() {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		try {
			System.out.print("Enter selection..");
			choice = Integer.parseInt(sc.nextLine());			
		} catch (Exception e) {
			System.out.println("Your selection must be a number in [1-" + options.length + "]");
		}
		return choice;
	}

	public abstract void run();

	public abstract void execute(int choice);
	
	
	

}
