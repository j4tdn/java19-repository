package bean;

public class Car {
	private String id;
	private String color;
	public static String model;
	private double price;

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String id, String color, double price) {
		this.id = id;
		this.color = color;
//		this.model = model;
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

//	public void setModel(String model) {
//		this.model = model;
//	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", color=" + color + ", model=" + model + ", price=" + price + "]";
	}

}
