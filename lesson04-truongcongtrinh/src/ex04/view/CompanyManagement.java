package ex04.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ex04.controller.Company;
import ex04.model.Employee;
import ex04.model.Leader;
import ex04.model.Manager;
import ex04.model.Person;

public class CompanyManagement extends Menu {
	
	public static void main(String[] args) {
		CompanyManagement cmgm = new CompanyManagement();
		cmgm.run();
	}
	
	private Company company = new Company();
	private static String[] options = { "Input Information", "Show Information", "Calculate And Print out Salary",
			"Exit" };

	
	
	
	public CompanyManagement() {
		super("Company Management System", options);
	}

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		options = new String[] { "Input Information", "Show Information", "Calculate And Print out Salary",
		"Exit" };
		while (true) {
			options = new String[] { "Input Information", "Show Information", "Calculate And Print out Salary",
			"Exit" };
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
			this.menuInput();
			break;
		case 2:
			this.menuShow();
			break;
		case 3:
			company.printAllSalary();
			break;
		}

	}

	public void menuInput() {
		options = new String[] { "Input Information for Manager", "Input Information for Leader",
				"Input Information for Employee", "Exit" };

		Menu menu = new Menu("Input Information", options) {

			@Override
			public void run() {
				Scanner sc = new Scanner(System.in);
				while (true) {
					this.displayMenu();
					int choice = getChoice();
					if (choice == 4)
						break;
					if (choice < 0 || choice > options.length) {
						System.out.println("Your selection must be a number in [1-" + options.length + "]");
						continue;
					}
					execute(choice);
				}
			}

			@Override
			public void execute(int choice) {
				List<Person> employs = new ArrayList<>();
				Person p;
				switch (choice) {
				case 1:
					System.out.println("Manage(name,dateOfBirth,coefficientSalary,coefficientJob)");
					p = new Manager();
					company.inputInfo(p);
					employs.add(p);
					break;
				case 2:
					System.out.println("Leader(name,dateOfBirth,coefficientSalary,numberOfEmployee)");
					p = new Leader();
					company.inputInfo(p);
					employs.add(p);
					break;
				case 3:
					System.out.println("Leader(name,dateOfBirth,coefficientSalary,department)");
					p = new Employee();
					company.inputInfo(p);
					employs.add(p);
					break;
				default:
					break;
				}
			}
		};
		menu.run();
	}

	public void menuShow() {
		options = new String[] { "Manager", "Leader", "Employee","Show all role", "Exit" };

		Menu menu = new Menu("Show Information", options) {

			@Override
			public void run() {
				Scanner sc = new Scanner(System.in);
				while (true) {
					this.displayMenu();
					int choice = getChoice();
					if (choice == options.length)
						break;
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
					company.showInfo(choice);
					break;
				case 2:
					company.showInfo(choice);
					break;
				case 3:
					company.showInfo(choice);
					break;
				case 4:
					company.printAllEmployees();
				default:
					break;
				}
			}
		};
		menu.run();
	}

}
