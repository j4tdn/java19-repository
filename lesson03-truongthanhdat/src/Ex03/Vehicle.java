package Ex03;

public class Vehicle {
	private int id;
	private String typeVehicle;
	private int capacity;
	private Double cost;
	
	public Vehicle() {
	}

	public Vehicle(int id, String typeVehicle, int capacity, Double cost) {
		this.id = id;
		this.cost = cost;
		this.typeVehicle = typeVehicle;
		this.capacity = capacity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public String getTypeVehicle() {
		return typeVehicle;
	}

	public void setTypeVehicle(String typeVehicle) {
		this.typeVehicle = typeVehicle;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", typeVehicle=" + typeVehicle + ", capacity=" + capacity + ", cost=" + cost + "]";
	}

	

	
	
	
	
	
}
