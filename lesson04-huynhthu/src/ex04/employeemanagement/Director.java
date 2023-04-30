package ex04.employeemanagement;

public class Director extends GeneralInfo {
	private float positionCoefficient;
	
 public Director() {
 }

public Director(String name, String dayOfBirth, float coefficientsSalary, float positionCoefficient) {
	super(name, dayOfBirth, coefficientsSalary);
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
	return "Director [positionCoefficient=" + positionCoefficient + ", toString()=" + super.toString() + "]";
}

@Override
float salary() {
	return (this.getCoefficientsSalary() + this.getPositionCoefficient()) * 2200000;
}
 
 
 
}
