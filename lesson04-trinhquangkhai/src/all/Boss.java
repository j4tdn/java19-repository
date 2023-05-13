package all;

public class Boss extends Personnel {

	public Boss() {
	}

	public Boss(String name, String birthday, Float coefficientssalary, Float jobcoefficient) {
		super(name, birthday, coefficientssalary, jobcoefficient);
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	@Override
	public Float salary() {
		return(this.getcoefficientssalary() + this.getJobcoefficient())*3000000;
	}
	
	

}
