package personelmanager;

public class Manager extends Person{
	private int numberEmployee;
	
	public Manager(String name, String dateOfBirth, float coefficientsSalary,int numberEmployee) {
		super(name, dateOfBirth, coefficientsSalary);
		this.numberEmployee = numberEmployee;
	}

	public int getNumberEmployee() {
		return numberEmployee;
	}

	public void setNumberEmployee(int numberEmployee) {
		this.numberEmployee = numberEmployee;
	}

	@Override
	public String toString() {
		return "Manager [numberEmployee=" + numberEmployee + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double Payroll() {
		return this.getCoefficientsSalary() * 2200000;
	}
	
	
	
	
}
