package all;

public class Manager extends Personnel {
	private Integer number;

	public Manager() {
	}

	public Manager(Integer number) {
		super();
		this.number = number;
	}

	public Manager(String name, String birthday, Float coefficientssalary,Float jobcoefficient, Integer number) {
		super(name, birthday, coefficientssalary, jobcoefficient);
		this.number = number;
	}
	

	

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
	
	

	@Override
	public String toString() {
		return super.toString() + "Manager [number=" + number + "]";
	}

	@Override
	public Float salary() {
		return (this.getcoefficientssalary() + this.getJobcoefficient()) * 2200000;
	}

}
