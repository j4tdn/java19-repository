package bean;

public class Boss extends Employee {
	private Float titleCoeff;

	public Boss() {
		// TODO Auto-generated constructor stub
	}

	

	public Boss(String name, String dateOfBirth, Float salaryCoef, Float titleCoeff) {
		super(name, dateOfBirth, salaryCoef);
		this.titleCoeff = titleCoeff;
	}



	public Float getTitleCoeff() {
		return titleCoeff;
	}

	public void setTitleCoeff(Float titleCoeff) {
		this.titleCoeff = titleCoeff;
	}

	@Override
	public String toString() {
		return super.toString() + "Boss [titleCoeff=" + titleCoeff + "]";
	}

	public Boss(Float titleCoeff) {
		super();
		this.titleCoeff = titleCoeff;
	}

	@Override
	public Float salary() {
	return (this.getSalaryCoef()+this.getTitleCoeff())*3000000;
}
}
