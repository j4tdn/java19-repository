package bean;

public class Car {
	//attributes
	private String id;
	private String color;
	public static String modle;
	private double price;
	
	//constructor rỗng, k có tham số
	public Car() {
	}
	
	//constructor có tham số
	public Car(String id, String color, double price) {
		this.id = id;
		this.color = color;
		this.price = price;
	}

	// getter setter
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

	public String getModle() {
		return modle;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", color=" + color + ", modle=" + modle + ", price=" + price + "]";
	}
	
	
	
}
