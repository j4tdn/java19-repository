package ex04;

public class Director extends HRMember {
	private float positionCoefficient;

	public Director(String fullName, String birthday, float salaryCoefficient, float positionCoefficient) {
		super(fullName, birthday, salaryCoefficient);
		this.positionCoefficient = positionCoefficient;
	}

	public float getPositionCoefficient() {
		return positionCoefficient;
	}

	public void setPositionCoefficient(float positionCoefficient) {
		this.positionCoefficient = positionCoefficient;
	}

	@Override
	public String toString() {
		return "Director [" + super.toString() + "positionCoefficient=" + positionCoefficient + ", ]";
	}

	//Giám đốc: Lương = (hệ số lương + hệ số chức vụ(nếu có)) * 3000000
	@Override
	double getSalary() {
		return (super.getSalaryCoefficient()+ this.positionCoefficient)*3000000;
	}

}
