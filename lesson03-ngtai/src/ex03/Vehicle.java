package ex03;

public class Vehicle {
	private String nameCarOwner;
	private String carName;
	private int capacity;
	private double price;
	private double tax;

	public Vehicle() {
	}

	public Vehicle(String nameCarOwner, String carName, int capacity, double price) {
		this.nameCarOwner = nameCarOwner;
		this.carName = carName;
		this.capacity = capacity;
		this.price = price;
	}

	public Vehicle(String nameCarOwner, String carName, int capacity, double price, double tax) {
		super();
		this.nameCarOwner = nameCarOwner;
		this.carName = carName;
		this.capacity = capacity;
		this.price = price;
		this.tax = tax;
	}

	public String getNameCarOwner() {
		return nameCarOwner;
	}

	public void setNameCarOwner(String nameCarOwner) {
		this.nameCarOwner = nameCarOwner;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
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

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "Name: " + this.getNameCarOwner() + " | Car Name: " + this.getCarName() + " | Capacity: " + this.getCapacity() + " | Price: " + this.getPrice() + " | Tax: " + this.getTax();
	}

}
