package car;

public class App {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Do Thien Hoa", "Future", 100, 35000000);
		Vehicle v2 = new Vehicle("Nguyen Viet", "Ford Ranger", 3000, 250000000);
		Vehicle v3 = new Vehicle("Ho Tan Dat", "Landscape", 1500, 1000000000);
		VehicleUtils.showView();
		VehicleUtils.vehicleTax(v1);
		VehicleUtils.vehicleTax(v2);
		VehicleUtils.vehicleTax(v3);

	}

}
