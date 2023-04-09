package Exercise3Vehicle;

public class Vehicle {
private String rangeofvehicle;
private int capacity;
private double value;
public Vehicle() {
}
public Vehicle(String rangeofvehicle, int capacity, double value) {
	super();
	this.rangeofvehicle = rangeofvehicle;
	this.capacity = capacity;
	
}
public String getRangeofvehicle() {
	return rangeofvehicle;
}
public void setRangeofvehicle(String rangeofvehicle) {
	this.rangeofvehicle = rangeofvehicle;
}
public int getCapacity() {
	return capacity;
}
public void setCapacity(int capacity) {
	this.capacity = capacity;
}
public double getValue() {
	return value;
}
public void setValue(double value) {
	this.value = value;
}


@Override
public String toString() {
	return "Vehicle [rangeofvehicle=" + rangeofvehicle + ", capacity=" + capacity + ", value=" + value + "]";
}


}
