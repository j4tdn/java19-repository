package ex03vehicletax;

import java.time.LocalDate;

public class App {
	public static void main(String[] args) {

		VehicleOwner owner1 = new VehicleOwner("001", "XuanHungNguyen", "090000000", "VietNam");
		VehicleOwner owner2 = new VehicleOwner("002", "Dep trai", "090111111", "US");
		VehicleOwner owner3 = new VehicleOwner("003", "Xau trai", "090222222", "France");
		
		Vehicle v1 = new Vehicle("Toyota", "Serial 1", "white", 6000, 400000);
		Vehicle v2 = new Vehicle("Honda", "Winner", "red", 150, 2000);
		Vehicle v3 = new Vehicle("Yamaha", "Exciter", "blue", 150, 2500);
		Vehicle v4 = new Vehicle("Audi", "Audi00000", "black", 7000, 600000);
		Vehicle v5 = new Vehicle("Mescedes", "C300", "black", 7000, 500000);
	
		Registration r1 = new Registration(owner1, v1, LocalDate.of(2002, 1, 1));
		Registration r2 = new Registration(owner2, v2, LocalDate.of(2003, 1, 1));		
		Registration r3 = new Registration(owner3, v3, LocalDate.of(2004, 1, 1));	
		Registration r4 = new Registration(owner1, v4, LocalDate.of(2005, 1, 1));
		Registration r5 = new Registration(owner2, v5, LocalDate.of(2016, 1, 1));	
		
		RegistrationUtils.printTitle();
		RegistrationUtils.printResult(r1);
		RegistrationUtils.printResult(r2);
		RegistrationUtils.printResult(r3);
		RegistrationUtils.printResult(r4);
		RegistrationUtils.printResult(r5);
	}
}
