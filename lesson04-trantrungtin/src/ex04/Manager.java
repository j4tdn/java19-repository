package ex04;

public class Manager extends HRMember {
	private int staffNumber;

	public Manager(String fullName, String birthday, float salaryCoefficient, int staffNumber) {
		super(fullName, birthday, salaryCoefficient);
		this.staffNumber = staffNumber;
	}

	public int getStaffNumber() {
		return staffNumber;
	}

	public void setStaffNumber(int staffNumber) {
		this.staffNumber = staffNumber;
	}

	@Override
	public String toString() {
		return "Manager [ " + super.toString() + "staffNumber=" + staffNumber + "]";
	}

	//Trưởng phòng: Lương = (hệ số lương + hệ số chức vụ(nếu có)) * 2200000
	@Override
	double getSalary() {
		return (super.getSalaryCoefficient())*2200000;
	}

}
