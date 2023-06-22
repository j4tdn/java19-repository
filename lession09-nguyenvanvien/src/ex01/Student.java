package ex01;

public class Student {
	private int idStudent;
    private String fullName;
    private char type;

    public Student(int idStudent, String fullName, char type) {
        this.idStudent = idStudent;
        this.fullName = fullName;
        this.type = type;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "student{" +
                "idStudent=" + idStudent +
                ", fullName='" + fullName + '\'' +
                ", type=" + type +
                '}';
    }
}
