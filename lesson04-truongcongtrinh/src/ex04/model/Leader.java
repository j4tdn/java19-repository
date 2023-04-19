package ex04.model;

public class Leader extends Person {

	private int numOfEmpys;

	public Leader() {
	}

	public Leader(String name, String dateOfBirth, float coefSalary, int numOfEmpys) {
		super(name, dateOfBirth, coefSalary);
		this.numOfEmpys = numOfEmpys;
	}

	public int getNumOfEmpys() {
		return numOfEmpys;
	}

	public void setNumOfEmpys(int numOfEmpys) {
		this.numOfEmpys = numOfEmpys;
	}
	
	@Override
	public String toString() {
		return "Leader [" + super.toString() + " NumOfEmpys: " + numOfEmpys + "]";
	}

}
