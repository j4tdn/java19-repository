package bean;

public class Car {
	// attributes(thuộc tính)
private String id;
private String colour;
public static String model;
private double price;
	// contructor rỗng, không có tham số 
public Car() {
	
}
	// constructor với đầy đủ tham số  
public Car(String id, String colour, double price) {
	this.id = id;
	this.colour = colour;
	this.price = price;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
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
@Override
public String toString() {
	return "Car [id=" + id + ", colour=" + colour + ", model=" + model + ", price=" + price + "]";
}

}
