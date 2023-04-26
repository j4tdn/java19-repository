package bai4;

public class Employee extends Person{
	private String nameDepartment;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String name, String birthday, double coefficientsSalary, String nameDepartment) {
		super(name, birthday, coefficientsSalary);
		this.nameDepartment = nameDepartment;
	}

	public String getNameDepartment() {
		return nameDepartment;
	}

	public void setNameDepartment(String nameDepartment) {
		this.nameDepartment = nameDepartment;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", nameDepartment: " + nameDepartment;
	}

	
}
