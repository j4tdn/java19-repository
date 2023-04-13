package encapsulation.outside;

import encapsulation.inside.EmployeeInfo;

public class ExternalEmployee extends EmployeeInfo {
//	String name; // +	private:	class scope
				//	+ 	public :	everywhere
				//	+	 		:	inside package
				//	+	protected:	
	private double salary;
}
