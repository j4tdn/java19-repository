package bai4;

public class Manager extends Person{
	private int countOfEmployee;
	
	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, String birthday, double coefficientsSalary, int countOfEmployee) {
		super(name, birthday, coefficientsSalary);
		this.countOfEmployee = countOfEmployee;
	}

	public int getCountOfEmployee() {
		return countOfEmployee;
	}

	public void setCountOfEmployee(int countOfEmployee) {
		this.countOfEmployee = countOfEmployee;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", countOfEmployee: "+ countOfEmployee;
	}
}
