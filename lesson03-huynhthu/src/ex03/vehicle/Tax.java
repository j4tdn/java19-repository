package ex03.vehicle;

public class Tax {
	double tax = 0;
	double N;

	public double export() {
		for (i = 0; i < Vehicle.length; i++);
		int getDisplacement;
		if(getDisplacement > 100) {
			tax = price * 0.01;
		}else if(getDisplacement >= 100 && getDisplacement <= 200) {
			tax = price * 0.03;
		}else {
			tax = price * 0.05;
		}
        return tax;
	}

	public double taxOfVehicle(double price, double N) {
		return tax = price * N;
	}
}
