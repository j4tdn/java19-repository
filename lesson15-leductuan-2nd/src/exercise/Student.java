package exercise;

class Student {
	private String mssv;
	private String name;
	private double gpa;
	private String gender;

	public Student(String mssv, String name, double gpa, String gender) {
		this.mssv = mssv;
		this.name = name;
		this.gpa = gpa;
		this.gender = gender;
	}

	public String getMssv() {
		return mssv;
	}

	public String getName() {
		return name;
	}

	public double getGpa() {
		return gpa;
	}

	public String getGender() {
		return gender;
	}
}
