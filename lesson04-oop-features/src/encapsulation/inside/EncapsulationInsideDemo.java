package encapsulation.inside;

import encapsulation.outside.ExternalCompany;
import encapsulation.outside.ExternalEmployee;

public class EncapsulationInsideDemo {
	public static void main(String[] args) {
		//inside
		Company c1 = new Company();
		c1.name = "cxyz";
		
		Employee e1 = new Employee();
		e1.name = "n1";
		
		//outside
		
		ExternalCompany ec1 = new ExternalCompany();
		ec1.name = "cout";
		
		ExternalEmployee ee1 = new ExternalEmployee();
		ee1.name  = "n2";
		
		
	}
}
