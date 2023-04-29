package ex04;

public abstract class HRMember {
	private String fullName;
	private String birthday;
	private float salaryCoefficient;

	public HRMember(String fullName, String birthday, float salaryCoefficient) {
		this.fullName = fullName;
		this.birthday = birthday;
		this.salaryCoefficient = salaryCoefficient;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public float getSalaryCoefficient() {
		return salaryCoefficient;
	}

	public void setSalaryCoefficient(float salaryCoefficient) {
		this.salaryCoefficient = salaryCoefficient;
	}
	
	abstract double getSalary() ;

	@Override
	public String toString() {
		return "HRMember [fullName=" + fullName + ", birthday=" + birthday + ", salaryCoefficient=" + salaryCoefficient
				+ "]";
	}

}
