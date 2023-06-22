package ex01;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
        Student[] students = createArrayStudents();
        System.out.println("\n======= Danh sách sinh viên từng đạt loại A trong năm 2021 ======\n");
        printStudent(getStudents(students, true));
        System.out.println("\n=================================================================\n");
        System.out.println("\n======= Danh sách sinh viên đã tham gia học lại môn cấu trúc dữ liệu trong năm 2021 ======\n");
        printStudent(getStudents(students, false));
    }
	
	private static void printStudent(Student[] students) {
		for (Student student : students){
            System.out.println(student);
        }
	}

    private static Student[] createArrayStudents(){
        Student[] students = new Student[]
                {
                        new Student(102, "Nam", Type.C.getText()),
                        new Student(103, "Bảo", Type.F.getText()),
                        new Student(104, "Hoàng", Type.D.getText()),
                        new Student(105, "Nguyên", Type.B.getText()),
                        new Student(107, "Vũ", Type.F.getText()),
                        new Student(109, "Lan", Type.A.getText()),
                        new Student(202, "Đạt", Type.C.getText()),
                        new Student(103, "Bảo", Type.F.getText()),
                        new Student(107, "Vũ", Type.C.getText()),
                        new Student(104, "Hoàng", Type.B.getText())
                };
        return students;
    }

    private static Student[] getStudents(Student[] students, boolean checkCase) {
        Student[] newStudents = new Student[students.length];
        int count =0;
        for(int i=0; i< students.length;i++){
            if(checkCase)
            {
            	if(students[i].getType() == Type.A.getText() && !checkDuplicates(newStudents, students[i].getIdStudent())){
                    newStudents[count++] = students[i];
                }
            }
            else {
            	for(int j=0; j< students.length;j++) {
            		if(i != j && students[i].getIdStudent() == students[j].getIdStudent()) {
            			if (!checkDuplicates(newStudents, students[i].getIdStudent()))
            				newStudents[count++] = students[i];
            		}
            	}
            }
        }
        newStudents = Arrays.copyOfRange(newStudents, 0, count);
        return newStudents;
    }
    public static boolean checkDuplicates(Student[] students, int idStudent) {
    	for(Student student : students) {
    		if(student != null) {
    			if(student.getIdStudent() == idStudent) {
        			return true;
        		}
    		}
    	}
    	return false;
    }
}
