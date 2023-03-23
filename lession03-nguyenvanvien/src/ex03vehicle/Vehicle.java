package ex03vehicle;

public class Vehicle {
	private String ownerName;
	private String vehicleType;
	private int capacity; // dung tích
	private double cost;
	private double tax;

	public String getOwnerName() {
		return ownerName;
	}

	public Vehicle(String ownerName, String vehicleType, int capacity, double cost) {
		super();
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
		this.capacity = capacity;
		this.cost = cost;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void show() {
		if (this.capacity < 50) {
			System.out.println("capacity invalid !!!");
			System.exit(1);
		} else {
			if (this.capacity < 100)
				this.tax = this.cost * 0.01;
			else if (this.capacity >= 100 && this.capacity <= 200)
				this.tax = this.cost * 0.03;
			else
				this.tax = this.cost * 0.05;
		}
		System.out.printf("%-20s%-20s%-20s%-20s%s\n", this.ownerName, this.vehicleType, this.capacity, this.cost,
				this.tax);
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
}
