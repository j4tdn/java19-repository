package car;

public class VehicleUtils {
	public static void vehicleTax(Vehicle v) {
		double tax=0;
		if (v.getCapacity() < 100) {
			tax= v.getPrice() * 0.01;
		} else if (v.getCapacity() >= 100 && v.getCapacity() <= 200) {
			tax=  v.getPrice() * 0.03;
		}
		tax=  v.getPrice() * 0.05;
		 System.out.format("%-20s%-20s%-20s%10.2f%20.2f\n",
				 v.getCarOwnerName(),
				 v.getRangeOfVehicle(),
				 v.getCapacity(),
				 v.getPrice(),
				 tax);
	}

	public static void showView() {
		System.out.printf("%-20s%-20s%-20s%-20s%s\n", "Ten chu xe", "Loai xe", "Dung tich", "Tri gia", "Thue phai nop");
		System.out.println("===============================================================================================");
	}
}
