package ex3;

public class RegisterUtil {
	public static void result(Register register) {
		double tax;
		Owners owners = register.getOwners(); 
		Vehicle vehicle = register.getVehicle();
		double price = vehicle.getPrice();
		int engineCapacity = vehicle.getEngineCapacity();
		if (engineCapacity < 100) {
			tax = price * 1/100;
		} else if (engineCapacity>=100 && engineCapacity <200) {
			tax = price * 3/100;
		
		} else {
			tax = price * 5/100;
			
		}
	System.out.println(owners.getName() + "\t" + vehicle.getModel() + "\t" + 
		vehicle.getEngineCapacity() + "\t\t" + vehicle.getPrice() + "\t\t" + tax);
	}
	
}
