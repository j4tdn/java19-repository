package bean;

public class Car {
	// attributes thuộc tính
	
	// scope: class
	public static String model;
	
	// scope: object
	private String id;
	private String color;
	private double price;
	
	// constructor rỗng, ko có tham số
	public Car() {
	}

	// constructor với đầy đủ tham số
	// this: đối tượng, ô nhớ hiện tại đang truy cập
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
		return "Car [id=" + id + ", color=" + color + ", model=" + model + ", price=" + price + "]";
	}
}