package encapsulation.inside;

import encapsulation.outside.ExternalCompany;
import encapsulation.outside.ExternalEmployee;

public class EncapsulationInsideDemo {
	public static void main(String[] args) {
		// inside
		Company c1 = new Company();
		c1.name = "mgm";
		Employee e1 = new Employee();
		e1.name = "Thinh";
		
		// outside
		
		ExternalCompany ec1 = new ExternalCompany();
		ec1.name = "axon active";
		ExternalEmployee ee1 = new ExternalEmployee();
		ee1.name = "1123";
	}
}
