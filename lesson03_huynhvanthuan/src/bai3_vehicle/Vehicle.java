package bai3_vehicle;

public class Vehicle {
	private String vehicleOwnerName;
	private String typeOfVehicle;
	private int capacity;
	private double price;
	
	public Vehicle() {

	}
	
	public Vehicle(String vehicleOwnerName, String typeOfVehicle, int capacity, double price) {
		this.vehicleOwnerName = vehicleOwnerName;
		this.typeOfVehicle = typeOfVehicle;
		this.capacity = capacity;
		this.price = price;
	}

	public String getVehicleOwnerName() {
		return vehicleOwnerName;
	}

	public void setVehicleOwnerName(String vehicleOwnerName) {
		this.vehicleOwnerName = vehicleOwnerName;
	}

	public String getTypeOfVehicle() {
		return typeOfVehicle;
	}

	public void setTypeOfVehicle(String typeOfVehicle) {
		this.typeOfVehicle = typeOfVehicle;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public double calculateTax() {
		double tax;
        if(capacity < 100) {
        	tax = price * 0.01;
        }
        else if (capacity >= 100 && capacity<=200) {
        	tax = price * 0.03;
        }
        else {
        	tax = price * 0.05;
        }
        return tax;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleOwnerName=" + vehicleOwnerName + ", typeOfVehicle=" + typeOfVehicle + ", capacity="
				+ capacity + ", price=" + price + "]";
	}
	
	public void show() {
		System.out.printf("%-20s%-20s%20s%20s%20s \n", vehicleOwnerName, typeOfVehicle, capacity, price, calculateTax());
	}
	
}
