package bean;

public class Car {
	
	
	public static String model;
	
	private String id;
	private String color;
//	private static String model; // cac bien dung chung gia tri, nen dc truy cap tu class
	private double price;
	public Car() {
		
	}
	public Car(String id, String color, double price) {
		this.id = id;
		this.color = color;
		this.price = price;
	}
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
	public String getModel() {
		return model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car: id=" + id + ", color=" + color + ", model=" + model + ", price=" + price;
	}
	
	
}
