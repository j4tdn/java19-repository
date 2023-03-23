package ex03vehicletax;

public class RegistrationUtils {
	
	private RegistrationUtils() {
		
	}
	public static void printTitle() {
	    System.out.format("%-25s %-20s %10s %15s %20s", "Vehicle Owner", "Vehicle Name", "Volume", "Price", "Registration Fee");
	    System.out.println();
	    System.out.println("==============================================================================================");
	    }	  
	
	
	public static void printResult(Registration registration) {
		double cylinderCapacity = registration.getVehicle().getCylinderCapacity();
		double price = registration.getVehicle().getPrice();
		double vehicleTax = 0;

		if (cylinderCapacity > 200) {
			vehicleTax = price * 5 / 100;
		} else if (cylinderCapacity >= 100) {
			vehicleTax = price * 3 / 100;
		} else {
			vehicleTax = price * 1 / 100;
		}
		 System.out.format("%-25s %-20s %10.0f %15.2f %20.2f",
				 registration.getOwner().getName(),
				 registration.getVehicle().getName(),
				 cylinderCapacity,
				 price,
				 vehicleTax);
	        System.out.println();
	}
 }
