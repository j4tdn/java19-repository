package vehicle;

public class Vehicle {
	private String vehicleOwnerName;
	private String type;
	private int capacity;
	private double price;
	private double tax;
	
	public Vehicle() {
		
	}

	public Vehicle(String vehicleOwnerName, String type, int capacity, double price, double tax) {
		this.vehicleOwnerName = vehicleOwnerName;
		this.type = type;
		this.capacity = capacity;
		this.price = price;
		this.tax = tax;
	}

	public String getVehicleOwnerName() {
		return vehicleOwnerName;
	}

	public void setVehicleOwnerName(String vehicleOwnerName) {
		this.vehicleOwnerName = vehicleOwnerName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return this.vehicleOwnerName + "\t\t"  + this.type + "\t\t"  + 
				this.capacity + "\t\t" + this.price + "\t\t"+this.tax;
	}
	
	
	

}
