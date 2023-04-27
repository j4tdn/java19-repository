package car;

public class Vehicle {
	private String name;
	private String nameCar;
	private double cylinder;
	private double price;
	
	
	public Vehicle() {
	}


	public Vehicle(String name, String nameCar, double cylinder, double price) {
		super();
		this.name = name;
		this.nameCar = nameCar;
		this.cylinder = cylinder;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getNameCar() {
		return nameCar;
	}


	public void setNameCar(String nameCar) {
		this.nameCar = nameCar;
	}


	public double getCylinder() {
		return cylinder;
	}


	public void setCylinder(double cylinder) {
		this.cylinder = cylinder;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", nameCar=" + nameCar + ", cylinder=" + cylinder + ", price=" + price + "]";
	}
	
	

}
