package Exercise3Vehicle;

public class Register2 {
	public static void Tax(Register rgt) {
		CustomerOfVehicle cov = rgt.getCustomers();
		Vehicle vehicle = rgt.getVehicle();
		double value = vehicle.getValue();
		int capacity = vehicle.getCapacity();
		double tax;
		if (capacity < 100) {
			tax = value / 100;
		} else if (capacity < 200) {
			tax = (3 * value) / 100;
		} else {
			tax = (5 * value) / 100;
		}
		System.out.printf("%-12d%-12d%07d\n", cov.getName(), vehicle.getRangeofvehicle(), vehicle.getCapacity(),
				vehicle.getValue());
	}

}
