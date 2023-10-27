import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Ex05 {
	 private List<Student> students;
public void StudentManagement() {
    students = new ArrayList<>();
}

public class StudentManagement {
    private List<Student> students;

    public StudentManagement() {
        students = new ArrayList<>();
    }

    public void readStudentsFromFile(String filename) {
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(", ");

                if (parts.length == 4) {
                    String mssv = parts[0];
                    String hoTen = parts[1];
                    double diemTB = Double.parseDouble(parts[2]);
                    String gioiTinh = parts[3];

                    Student student = new Student(mssv, hoTen, diemTB, gioiTinh);
                    students.add(student);
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file " + filename);
        }
    }

    public void sortStudentsByDTBAndName() {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.getAveragepoint() == s2.getAveragepoint()) {
                    return s2.getName().compareTo(s1.getName());
                } else {
                    return Double.compare(s1.getAveragepoint(), s2.getAveragepoint());
                }
            }
        });
    }

    public List<Student> findStudentsWithDTBGreaterThan(double threshold) {
        List<Student> result = new ArrayList<>();

        for (Student student : students) {
            if (student.getAveragepoint() > threshold) {
                result.add(student);
            }
        }

        return result;
    }

    public List<Student> findFemaleStudents() {
        List<Student> result = new ArrayList<>();

        for (Student student : students) {
            if (student.getGender().equals("Nu")) {
                result.add(student);
            }
        }

        return result;
    }

    public List<Student> findUniqueStudents() {
        List<Student> result = new ArrayList<>();
        List<Student> duplicates = new ArrayList<>();

        for (Student student : students) {
            if (!result.contains(student) && !duplicates.contains(student)) {
                result.add(student);
            } else {
                duplicates.add(student);
                result.remove(student);
            }
        }

        return result;
    }

    public void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student.getId() + ", " + student.getName() + ", " + student.getAveragepoint() + ", " + student.getGender());
        }
    }

    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.readStudentsFromFile("student.txt");

        System.out.println("Danh sách sinh viên ban đầu:");
        studentManagement.printStudents(studentManagement.students);

        System.out.println("\nDanh sách sinh viên sau khi sắp xếp:");
        studentManagement.sortStudentsByDTBAndName();
        studentManagement.printStudents(studentManagement.students);

        System.out.println("\nDanh sách sinh viên có ĐTB > 8:");
        List<Student> studentsWithDTBGreaterThan8 = studentManagement.findStudentsWithDTBGreaterThan(8);
        studentManagement.printStudents(studentsWithDTBGreaterThan8);

        System.out.println("\nDanh sách sinh viên nữ:");
        List<Student> femaleStudents = studentManagement.findFemaleStudents();
        studentManagement.printStudents(femaleStudents);

        System.out.println("\nDanh sách sinh viên chỉ xuất hiện một lần:");
        List<Student> uniqueStudents = studentManagement.findUniqueStudents();
        studentManagement.printStudents(uniqueStudents);
    }
}}