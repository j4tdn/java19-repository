package exercise03.vehicle;

public class Vehicle {
	private String owner;
	private String range;
	private int capacity;
	private double price;
	private String tax;
	
	public Vehicle() {
	}

	public Vehicle(String owner, String range, int capacity, double price, String tax) {
		super();
		this.owner = owner;
		this.range = range;
		this.capacity = capacity;
		this.price = price;
		this.tax = tax;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTax() {
		return tax;
	}

	public void setTax(String tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "Vehicle [owner=" + owner + ", range=" + range + ", capacity=" + capacity + ", price=" + price + ", tax="
				+ tax + "]";
	}
	
	public double counttax() {
		double tax;
		if(capacity < 100) tax = price * 0.01;
		else if (capacity >= 100 && capacity <= 200) tax = price * 0.03;
		else tax = price * 0.05;
		return tax;	
	}
	
	void intax(){
		System.out.printf("%5d %-20s %5d %10.2f %10s %8.5f \n ", owner, range, capacity, price, tax); 
	}
}
