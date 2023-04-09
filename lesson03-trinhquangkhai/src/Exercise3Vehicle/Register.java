package Exercise3Vehicle;

public class Register {
private CustomerOfVehicle customers;
private Vehicle vehicle;
public Register() {
}
public Register(CustomerOfVehicle customers, Vehicle vehicle) {
	super();
	this.customers = customers;
	this.vehicle = vehicle;
}
public CustomerOfVehicle getCustomers() {
	return customers;
}
public void setCustomers(CustomerOfVehicle customers) {
	this.customers = customers;
}
public Vehicle getVehicle() {
	return vehicle;
}
public void setVehicle(Vehicle vehicle) {
	this.vehicle = vehicle;
}
@Override
public String toString() {
	return "Register [customers=" + customers + ", vehicle=" + vehicle + "]";
}

}
