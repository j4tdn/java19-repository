public class Student {
private String id; 
private String name;
private double averagepoint;
private String gender;

public Student() {
}

public Student(String id, String name, double averagepoint, String gender) {
	super();
	this.id = id;
	this.name = name;
	this.averagepoint = averagepoint;
	this.gender = gender;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getAveragepoint() {
	return averagepoint;
}

public void setAveragepoint(double averagepoint) {
	this.averagepoint = averagepoint;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", averagepoint=" + averagepoint + ", gender=" + gender + "]";
}


}
