package ex05.view;

import java.util.Scanner;

import ex05.controller.BookStore;

public class BookStoreManagement extends Menu {
	private static final BookStore bStore = new BookStore();

	public static void main(String[] args) {
		BookStoreManagement bmgm = new BookStoreManagement();
		bmgm.run();
	}

	private BookStore store = new BookStore();
	private static String[] options = { "Show All Nhi Đồng's Books", "Show All Books Have Price Less Than 50",
			"Show All Books Have Price From 50 To 100", "Buy Book Demo", "Exit" };

	public BookStoreManagement() {
		super("Book Store Management System", options);
	}

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		options = new String[] { "Show All Nhi Đồng's Books", "Show All Books Have Price Less Than 50",
				"Show All Books Have Price From 50 To 100", "Giai Lap", "Exit" };
		while (true) {
			options = new String[] { "Show All Nhi Đồng's Books", "Show All Books Have Price Less Than 50",
					"Show All Books Have Price From 50 To 100", "Giai Lap", "Exit" };
			this.displayMenu();
			int choice = getChoice();
			if (choice == options.length) {
				System.out.print("Do you want exit [y/n]: ");
				String confirm = sc.next().toLowerCase();
				if (confirm.equalsIgnoreCase("y")) {
					System.out.println("Thank you for using!");
					break;
				}
				continue;
			}
			if (choice < 0 || choice > options.length) {
				System.out.println("Your selection must be a number in [1-" + options.length + "]");
				continue;
			}
			execute(choice);
		}
	}

	@Override
	public void execute(int choice) {
		switch (choice) {
		case 1:
			if (bStore.findBooksByPublisher().length == 0) {
				System.out.println("There is no Nhi Dong's Book");
			} else {
				System.out.println(">>>>> Nhi Dong's Books <<<<<<");
				bStore.printArray(bStore.findBooksByPublisher());
			}
			break;
		case 2:
			if (bStore.findBooksByPrice50().length == 0) {
				System.out.println("There is no book have price less than 50");
			} else {
				System.out.println(">>>Book have price less than 50<<<");
				bStore.printArray(bStore.findBooksByPrice50());
			}
			break;
		case 3:
			if (bStore.findTextBooksByPrice().length == 0) {
				System.out.println("There is no textbook have price from 50 - 100");
			} else {
				System.out.println(">>>Textbook have price from 50 - 100<<<");
				bStore.printArray(bStore.findTextBooksByPrice());
			}
			break;
		case 4:
			int[] quantity = new int[2];
			Scanner sc = new Scanner(System.in);
			boolean check = false;
			do {
				try {
					check = true;
					System.out.print("How many TextBook you want to buy: ");
					quantity[0] = Integer.parseInt(sc.nextLine());
					System.out.print("How many Reference you want to buy: ");
					quantity[1] = Integer.parseInt(sc.nextLine());
				} catch (NumberFormatException e) {
					check = false;
					System.out.println(">>>>Invalid Quantity<<<<");
				}
			} while (!check);
			System.out.println("Total: $" + bStore.calMoney(quantity));
			break;
		}

	}

}