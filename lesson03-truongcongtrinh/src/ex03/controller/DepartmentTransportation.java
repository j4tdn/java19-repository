package ex03.controller;

import java.util.ArrayList;
import java.util.Scanner;

import ex03.model.Vehicle;

public class DepartmentTransportation {
	private ArrayList<Vehicle> vehicles;
	
	public DepartmentTransportation() {
		vehicles = new ArrayList<>();
		vehicles.add(new Vehicle("Truong Cong Trinh","Future Neo",100,35000000));
		vehicles.add(new Vehicle("Truong Cong Bao","Ford Ranger",3000,250000000));
		vehicles.add(new Vehicle("Truong Cong A","Landscape",1500,1000000000));
	}

	// Implement Add Vehicle
	public Vehicle inputVehicle(Vehicle vehicle) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Owner: ");
		vehicle.setOwner(sc.nextLine());
		System.out.print("Enter Model: ");
		vehicle.setModel(sc.nextLine());
		System.out.print("Enter Capacity: ");
		vehicle.setCapacity(Double.parseDouble(sc.nextLine()));
		System.out.print("Enter Price: ");
		vehicle.setPrice(Double.parseDouble(sc.nextLine()));
		return vehicle;
	}

	public void addVehicle(Vehicle vehicle) {
		vehicles.add(this.inputVehicle(vehicle));
	}

	// Implement get vehicle list
	public ArrayList<Vehicle> getVehiclesList() {
		return this.vehicles;
	}

	// Implement calculate tax
	public double calTax(Vehicle vehicle) {
		if (vehicle.getCapacity() < 100) {
			return vehicle.getPrice() / 100.0f;
		} else if (vehicle.getCapacity() >= 100 && vehicle.getCapacity() < 200) {
			return (vehicle.getPrice() * 3) / 100.0f;
		} else {
			return (vehicle.getPrice() * 5) / 100.0f;
		}
		
	}
	
	//Implement print Export registration tax
	public void printRegisTax() {
		System.out.printf("%-30s%-20s%-20s%-20s%s\n","Ten chu xe","Loai Xe", "Dung tich", "Tri gia", "Thue phai nop");
		System.out.printf("==========================================================================================================\n");
		vehicles.forEach(vehicle -> {
			System.out.printf("%-30s%-20s%-20.2f%-20.2f%.2f\n",vehicle.getOwner(),vehicle.getModel(),vehicle.getCapacity(),vehicle.getPrice(),this.calTax(vehicle));
		});
		System.out.printf("==========================================================================================================\n");
		System.out.println("Number of vehicle: " + this.vehicles.size());
	}
}
