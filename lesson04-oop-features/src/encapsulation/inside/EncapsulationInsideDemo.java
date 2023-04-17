package encapsulation.inside;

import encapsulation.outside.ExternalCompany;
import encapsulation.outside.ExternalEmployee;

public class EncapsulationInsideDemo {
	public static void main(String[] args) {
		// inside
		Company cp = new Company();
		cp.name = "cxyz";

		Employee ep = new Employee();
		ep.name = "Trinh";

		// outside
		ExternalCompany ec = new ExternalCompany();
		ec.name = "abcxyz";

		ExternalEmployee ee = new ExternalEmployee();
		// ee.name = "Trinh2" --> wrong

	}
}
