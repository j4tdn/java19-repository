package encapsulation.inside;

import encapsulation.outside.ExternalCompany;
import encapsulation.outside.ExternalEmployee;

public class Demo {
	public static void main(String[] args) {
		Company com1 = new Company();
		com1.name = "abc";
		
		Employee emp1 = new Employee();
		emp1.name = "a";
		
		ExternalCompany exc = new ExternalCompany();
		exc.name = "asd";
		
		ExternalEmployee exe = new ExternalEmployee();
		exe.name = "n2";
	}
}
