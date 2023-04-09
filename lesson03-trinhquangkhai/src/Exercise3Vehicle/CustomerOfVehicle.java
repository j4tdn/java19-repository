package Exercise3Vehicle;

public class CustomerOfVehicle {
private String name;
public CustomerOfVehicle() {
}
public CustomerOfVehicle(String name) {
	super();
	this.name = name;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "CustomerOfVehicle [name=" + name + "]";
}

}
