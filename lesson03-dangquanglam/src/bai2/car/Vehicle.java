package bai2.car;

public class Vehicle {
	private String name;
	private String nameCar;
	private double price;
	private int cylinderCapacity;

	public Vehicle(String make, String model, double price, int cylinderCapacity) {
		this.name = make;
		this.nameCar = model;
		this.price = price;
		this.cylinderCapacity = cylinderCapacity;
	}

	public String getMake() {
		return name;
	}

	public String getModel() {
		return nameCar;
	}

	public double getPrice() {
		return price;
	}

	public int getCylinderCapacity() {
		return cylinderCapacity;
	}

	public double calculateTax() {
		double taxRate;
		if (cylinderCapacity < 100) {
			taxRate = 0.01;
		} else if (cylinderCapacity <= 200) {
			taxRate = 0.03;
		} else {
			taxRate = 0.05;
		}
		return price * taxRate;
	}

}
