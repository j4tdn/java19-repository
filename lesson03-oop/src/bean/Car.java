package bean;

public class Car {
	private String id;
	private String color;
	public static String model;
	private double price;
	
	//constructor rỗng, k có tham số
	public Car() {
		
	}
	//construtor vs đầy đủ tham số

	public Car(String id, String color, String model, double price) {
		this.id = id;
		this.color = color;
		this.model = model;
		this.price = price;
	}
	//getter ,setter

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
		this.model = model;
	}

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
