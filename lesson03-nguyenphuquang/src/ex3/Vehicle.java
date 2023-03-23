package ex3;

public class Vehicle {
	private String model;
	private int engineCapacity;	//cc
	private double price;	
	
	public Vehicle() {

	}

	public Vehicle(String model, int engineCapacity, double price) {
		this.model = model;
		this.engineCapacity = engineCapacity;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [model=" + model + ", engineCapacity=" + engineCapacity + ", price=" + price + "]";
	}
	
	
}
