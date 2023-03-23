package vehicle;

import java.text.DecimalFormat;

public class Vehicle {
	private String ownName;
	private String vehicleType;
	private int vehicleCap;
	private double price;
	private float vehicleTax;

	public Vehicle(String ownName, String vehicleType, int vehicleCap, 
			double price) {
		this.ownName = ownName;
		this.vehicleType = vehicleType;
		this.vehicleCap = vehicleCap;
		this.price = price;
	}
	private float taxCalc(int vehicleCap) {
		if(vehicleCap < 100) {
			return 0.01f;
		} else if(vehicleCap >= 100 && vehicleCap <= 200) {
			return 0.03f;
		} else return 0.05f;
	}
	DecimalFormat test = new DecimalFormat("#.##");
	
	@Override
	public String toString() {
		return this.ownName + "\t\t"  + this.vehicleType + "\t\t"  + 
	this.vehicleCap + "\t\t" + this.price + "\t\t" 
				+ (Math.round(this.price*taxCalc(vehicleCap)*10)/10);
	}
}