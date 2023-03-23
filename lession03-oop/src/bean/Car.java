package bean;

public class Car {
	//Scope : phạm vi class
	public static String model;
	
	//attributes thuộc tính
	
	private String id;
	private String color;
	private double price;
	
	//constructor rỗng, không có tham số
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	//Constructor đầy đủ tham số

	public Car(String id, String color, double price) {
		super();
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
	
//	public static void setModel(String model) {
//		Car.model = model;
//	}

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
