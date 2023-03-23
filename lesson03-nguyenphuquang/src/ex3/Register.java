package ex3;

public class Register {
	private Owners owners;
	private Vehicle vehicle;
	
	public Register() {

	}

	public Register(Owners owners, Vehicle vehicle) {
		this.owners = owners;
		this.vehicle = vehicle;
	}

	public Owners getOwners() {
		return owners;
	}

	public void setOwners(Owners owners) {
		this.owners = owners;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "register [owners=" + owners + ", vehicle=" + vehicle + "]";
	}
	
	
}
