package ex03.view;

import java.util.ArrayList;
import java.util.Scanner;

import ex03.controller.DepartmentTransportation;
import ex03.model.Vehicle;

public class DepartmentManagement extends Menu {
	private static String[] options = { "Create a Vehicle", "Export registration tax", "Exit" };
	DepartmentTransportation dp = new DepartmentTransportation();
	ArrayList<Vehicle> vehicles = new ArrayList<>();
	public DepartmentManagement() {
		super(options);
	}
	
	public static void main(String[] args) {
		DepartmentManagement m = new DepartmentManagement();
		m.run();
	}

	public void run() {
		do {
			Scanner sc = new Scanner(System.in);
			Menu.displayMenu();
			int choice = Menu.getChoice();
			if (choice < 0 || choice > options.length) {
				System.out.println("Your choice must be a number in [0-" + options.length  + "]!");
			}
			if (choice == 3) {
				System.out.print("Do you want exit [y/n]: ");
				String confirm = sc.next().toLowerCase();
				if (confirm.equalsIgnoreCase("y")) {
					System.out.println("Thank you for using!!!");
					System.exit(0);
				}
			} else {
				execute(choice);
			}

		} while (true);

	}

	public void execute(int choice) {
		
		vehicles = dp.getVehiclesList();
		
		switch (choice) {
		case 1:
			dp.addVehicle(new Vehicle());
			break;
		case 2:
			if(vehicles.isEmpty()) System.out.println("You must add vehicle first!");
			else {
				dp.printRegisTax();
			}
			break;
		default:
			break;
		}
	}

}
