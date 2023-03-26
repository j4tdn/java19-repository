package ex03.model;

public class Vehicle {
	private String owner;
	private String model;
	private double capacity;
	private double price;
	
	public Vehicle() {}
	
	public Vehicle(String owner,String model,double capacity,double price) {
		this.owner = owner;
		this.model = model;
		this.capacity = capacity;
		this.price = price;
	}
	
	

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [Owner=:" + owner +  ", Model=" + model + ", Capacity=" + capacity + ", Price=" + price + "]";
	}
	
	
	
}
