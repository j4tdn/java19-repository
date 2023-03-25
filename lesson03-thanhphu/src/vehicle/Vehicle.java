package vehicle;

public class Vehicle {
	
	private String ownerOfTheVehicle;
	private String vehicleType;
	private int capacity;
	private double cost;
	private double tax;
	
	public Vehicle() {
	}

	public Vehicle(String ownerOfTheVehicle, String vehicleType, int capacity, double cost, double tax) {
		this.ownerOfTheVehicle = ownerOfTheVehicle;
		this.vehicleType = vehicleType;
		this.capacity = capacity;
		this.cost = cost;
		this.tax = tax;
	}

	public String getOwnerOfTheVehicle() {
		return ownerOfTheVehicle;
	}

	public void setOwnerOfTheVehicle(String ownerOfTheVehicle) {
		this.ownerOfTheVehicle = ownerOfTheVehicle;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return " " + ownerOfTheVehicle + "\t"+ "\t" + vehicleType + "\t"+ "\t"
				+ capacity + "\t"+ "\t" +  cost + "\t"+ "\t" + tax+ "\t";
	}
	
	
}
