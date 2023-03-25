package bean;

public class Car {
	
	//scope: class
	public static String model;
	
	// attributes thuoc tinh
	private String id;
	private String color;
	private double price;
	
	// default (no parameter) constructor
	public Car() {
		
	}
	
	// all parameters constructor
	public Car(String id, String color, double price) {
		this.id = id;
		this.color = color;
		this.price = price;
	}

	// getter, setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [id=" + this.id + ", color=" + this.color + ", model=" + model + ", price=" + this.price + "]";
	}
	

}
