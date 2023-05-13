package all;

public class Staff extends Personnel{
private String unit;

public Staff() {
}

public Staff(String unit) {
	super();
	this.unit = unit;
}

public Staff(String name, String birthday, Float coefficientssalary, Float jobcoefficient, String unit) {
	super(name, birthday, coefficientssalary, jobcoefficient);
	this.unit = unit;
}

public String getUnit() {
	return unit;
}

public void setUnit(String unit) {
	this.unit = unit;
}

@Override
public String toString() {
	return super.toString() + "Staff [unit=" + unit + "]";
}

@Override
public Float salary() {
	return(this.getcoefficientssalary() + this.getJobcoefficient())*1250000;
}


}
