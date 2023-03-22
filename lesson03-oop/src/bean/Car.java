package bean;

public class Car {
	
	//scope:class
	public static String model;
	
	//attributes
	private String id;
	private String color;
	private double price;
	
	//Constructor default
	public Car() {
	}

	//constructor full 
	public Car(String id, String color, double price) {
		this.id = id;
		this.color = color;
		this.price = price;
	}

	//getter,setter
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

	public void setModel(String model) {
		Car.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	//toString
	@Override
	public String toString() {
		return "Car [id=" + id + ", color=" + color + ", model=" + model + ", price=" + price + "]";
	}

}
