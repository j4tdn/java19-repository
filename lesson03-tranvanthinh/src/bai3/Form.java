package bai3;

// Đơn đăng kí mua xe
public class Form {
	private People people;
	private Vehicle vehicle;
	
	public Form() {
		// TODO Auto-generated constructor stub
	}

	public Form(People people, Vehicle vehicle) {
		this.people = people;
		this.vehicle = vehicle;
	}

	public People getPeople() {
		return people;
	}

	public void setPeople(People people) {
		this.people = people;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public double taxCal() {
		double tax = getVehicle().getCost();
		if (getVehicle().getCapacity() < 100) tax = tax*0.01; 
		if (getVehicle().getCapacity() >= 100 && getVehicle().getCapacity() <= 200) tax = tax*0.03; 
		if (getVehicle().getCapacity() > 200) tax = tax*0.05; 
		return tax;
	}
}
