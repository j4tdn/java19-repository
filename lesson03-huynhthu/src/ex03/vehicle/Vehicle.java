package ex03.vehicle;

public class Vehicle {
	private String id;
	private String vehicleName;
	private int displacement;
	private double price;

	public Vehicle() {
	}

	public Vehicle(String id, String vehicleName, int displacement, double price) {
		super();
		this.id = id;
		this.vehicleName = vehicleName;
		this.displacement = displacement;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public int getDisplacement() {
		return displacement;
	}

	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", vehicleName=" + vehicleName + ", displacement=" + displacement + ", price="
				+ price + "]";
	}

}
