package car;

public class Vehicle {
	private String carOwnerName;
	private String rangeOfVehicle;
	private double capacity;
	private double price;

	public Vehicle() {
	}

	public Vehicle(String carOwnerName, String rangeOfVehicle, int capacity, int price) {
		this.carOwnerName = carOwnerName;
		this.rangeOfVehicle = rangeOfVehicle;
		this.capacity = capacity;
		this.price = price;
	}

	public String getCarOwnerName() {
		return carOwnerName;
	}

	public void setCarOwnerName(String carOwnerName) {
		this.carOwnerName = carOwnerName;
	}

	public String getRangeOfVehicle() {
		return rangeOfVehicle;
	}

	public void setRangeOfVehicle(String rangeOfVehicle) {
		this.rangeOfVehicle = rangeOfVehicle;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [carOwnerName=" + carOwnerName + ", rangeOfVehicle=" + rangeOfVehicle + ", capacity=" + capacity
				+ ", price=" + price + "]";
	}

}
