package ex03vehicletax;

import java.time.LocalDate;

public class Registration {
	private VehicleOwner owner;
	private Vehicle vehicle;
	private LocalDate registrationDate;

	public Registration(VehicleOwner owner, Vehicle vehicle, LocalDate registrationDate) {
		this.owner = owner;
		this.vehicle = vehicle;
		this.registrationDate = registrationDate;
	}

	public VehicleOwner getOwner() {
		return owner;
	}

	public void setOwner(VehicleOwner owner) {
		this.owner = owner;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

}
