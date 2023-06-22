package Ex01;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
        Student[] students = {
                new Student(102, "Nam", Grade.C),
                new Student(103, "Bảo", Grade.F),
                new Student(104, "Hoàng", Grade.D),
                new Student(105, "Nguyên", Grade.B),
                new Student(107, "Vũ", Grade.F),
                new Student(109, "Lan", Grade.A),
                new Student(202, "Đạt", Grade.C),
                new Student(103, "Bảo", Grade.F),
                new Student(107, "Vũ", Grade.C),
                new Student(104, "Hoàng", Grade.B)
        };
        
        Student[] studentsWithGradeA = getStudentsWithGrade(students, Grade.A);
        System.out.println("Students with grade A:");
        printStudents(studentsWithGradeA);

        System.out.println("\n======================================\n");
        
        Student[] studentsRepeatingCourse = getStudentsReregisterCourse(students);
        System.out.println("Students repeating the course in 2021:");
        printStudents(studentsRepeatingCourse);
	}

    public static Student[] getStudentsWithGrade(Student[] students, Grade grade) {
        List<Student> result = new ArrayList<>();

        for (Student student : students) {
            if (student.getGrade().equals(grade)) {
                result.add(student);
            }
        }

        return result.toArray(new Student[0]);
    }

    public static Student[] getStudentsReregisterCourse(Student[] students) {
        List<Student> result = new ArrayList<>();

        for (int i = 0; i < students.length; i++) {
            Student currentStudent = students[i];
            int count = 0;

            for (int j = i + 1; j < students.length; j++) {
                if (students[j].getId() == currentStudent.getId()) {
                    count++;
                }
            }

            if (count > 0) {
                result.add(currentStudent);
            }
        }

        return result.toArray(new Student[0]);
    }

    public static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName());
        }
    }
}
