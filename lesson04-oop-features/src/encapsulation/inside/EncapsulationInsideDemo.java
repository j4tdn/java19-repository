package encapsulation.inside;

import encapsulation.outside.ExternalCompany;
import encapsulation.outside.ExternalEmployee;

public class EncapsulationInsideDemo {

	public static void main(String[] args) {
		//ínside
		Company c1 = new Company();
		c1.name = "cxyz";
		
		Employee e1 = new Employee();
		e1.name = "n1";
		
		//outside
		ExternalCompany ec1 = new ExternalCompany();
		ec1.name = "ecout";
		
		ExternalEmployee ec2 = new ExternalEmployee();
		ec2.name = "n2";
	}

}
