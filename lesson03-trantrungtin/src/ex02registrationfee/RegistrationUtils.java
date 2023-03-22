package ex02registrationfee;

import java.text.NumberFormat;

/*
 * Utility of Order class 
 * Normally: utility is place where contains utility methods
 * no cares created class's object
 */

public class RegistrationUtils {
	public static void printTitle() {
	    System.out.format("%-20s %-25s %10s %15s %20s", "Vehicle Owner", "Vehicle Name", "Volume", "Price", "Registration Fee");
	    System.out.println();
	    System.out.println("==============================================================================================");
	    }	  
	
	
	public static void printResult(Registration registration) {
		double cylinderVolume = registration.getVehicle().getCylinderVolume();
		double price = registration.getVehicle().getPrice();
		double registrationFee = 0;

		if (cylinderVolume > 2000) {
			registrationFee = price * 5 / 100;
		} else if (cylinderVolume >= 100) {
			registrationFee = price * 3 / 100;
		} else {
			registrationFee = price * 1 / 100;
		}
		 System.out.format("%-20s %-25s %10.0f %15.2f %20.2f",
				 registration.getOwner().getName(),
				 registration.getVehicle().getName(),
				 cylinderVolume,
				 price,
				 registrationFee);
	        System.out.println();
	}
 }
	
