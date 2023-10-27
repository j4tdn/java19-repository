package ex05;

public class Student {
	private String mssv;
    private String fullName;
    private double gpa;
    private String gender;
    
    public Student() {
		
	}
    
	public Student(String mssv, String fullName, double gpa, String gender) {
	
		this.mssv = mssv;
		this.fullName = fullName;
		this.gpa = gpa;
		this.gender = gender;
	}

	public String getMssv() {
		return mssv;
	}

	public void setMssv(String mssv) {
		this.mssv = mssv;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [mssv=" + mssv + ", fullName=" + fullName + ", gpa=" + gpa + ", gender=" + gender + "]";
	}
    
	
    
}
