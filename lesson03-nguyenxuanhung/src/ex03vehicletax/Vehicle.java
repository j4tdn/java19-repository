package ex03vehicletax;

public class Vehicle {
	private String id;
	private String name;
	private String color;
	private double cylinderCapacity;
	private double price;
	
	public Vehicle(String id, String name, String color, double cylinderCapacity, double price) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.cylinderCapacity = cylinderCapacity;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getCylinderCapacity() {
		return cylinderCapacity;
	}

	public void setCylinderCapacity(double cylinderCapacity) {
		this.cylinderCapacity = cylinderCapacity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
