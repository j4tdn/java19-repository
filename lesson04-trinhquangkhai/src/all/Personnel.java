package all;

public   class Personnel {
private String name;
private String birthday;
private Float coefficientssalary;
private Float jobcoefficient;
int n;

public Personnel() {
}

public Personnel(String name, String birthday, Float coefficientssalary, Float jobcoefficient) {
	super();
	this.name = name;
	this.birthday = birthday;
	this.coefficientssalary = coefficientssalary;
	this.jobcoefficient = jobcoefficient;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getBirthday() {
	return birthday;
}

public void setBirthday(String birthday) {
	this.birthday = birthday;
}

public Float getcoefficientssalary() {
	return coefficientssalary;
}

public void setcoefficientssalary(Float coefficientssalary) {
	this.coefficientssalary = coefficientssalary;
}



public Float getJobcoefficient() {
	return jobcoefficient;
}

public void setJobcoefficient(Float jobcoefficient) {
	this.jobcoefficient = jobcoefficient;
}


@Override
public String toString() {
	return "Personnel [name=" + name + ", birthday=" + birthday + ", coefficientssalary=" + coefficientssalary + ", jobcoefficient="
			+ jobcoefficient + "]";
}

public  Float salary() {
	return(this.getcoefficientssalary() + this.getJobcoefficient())*n;
}
	



}







