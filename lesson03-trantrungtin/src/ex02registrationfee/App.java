package ex02registrationfee;

import java.time.LocalDate;

public class App {
	public static void main(String[] args) {

		VehicleOwner owner1 = new VehicleOwner("001", "Totti", "000000010", "Italy");
		VehicleOwner owner2 = new VehicleOwner("002", "Ronaldo", "000000007", "Portugal");
		VehicleOwner owner3 = new VehicleOwner("003", "Ramos", "000000004", "Spain");
		
		Vehicle v1 = new Vehicle("Lam", "Lamborghini Aventador", "red", 6500, 500000);
		Vehicle v2 = new Vehicle("Honda", "Air Blade", "black", 125, 2000);
		Vehicle v3 = new Vehicle("Yamaha", "Yamaha Scooter", "blue", 50, 2600);
		Vehicle v4 = new Vehicle("Mercedes", "Mercedes-Benz Maybach", "white", 4000, 200000);
	
		Registration r1 = new Registration(owner1, v1, LocalDate.of(2006, 11, 30));
		Registration r2 = new Registration(owner2, v2, LocalDate.of(2007, 06, 30));		
		Registration r3 = new Registration(owner3, v3, LocalDate.of(2008, 11, 20));	
		Registration r4 = new Registration(owner1, v2, LocalDate.of(2009, 06, 01));
		Registration r5 = new Registration(owner2, v4, LocalDate.of(2010, 05, 03));	
		
		RegistrationUtils.printTitle();
		RegistrationUtils.printResult(r1);
		RegistrationUtils.printResult(r2);
		RegistrationUtils.printResult(r3);
		RegistrationUtils.printResult(r4);
		RegistrationUtils.printResult(r5);
	}
}