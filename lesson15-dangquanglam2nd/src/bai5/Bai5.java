package bai5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Bai5 {
	private List<Student> students = new ArrayList<>();

	public Bai5(String filePath) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(", ");
            students.add(new Student(parts[0], parts[1], Double.parseDouble(parts[2]), parts[3]));
        }
        reader.close();
    }

	public List<Student> sortStudentsByScoreAndName(List<Student> students) {
	    return students.stream()
	                   .sorted(Comparator.comparingDouble(Student::getAverageScore)
	                   .thenComparing(Student::getName, Comparator.reverseOrder()))
	                   .collect(Collectors.toList());
	}


    public List<Student> getStudentsWithHighScore() {
        return students.stream()
                       .filter(s -> s.getAverageScore() > 8)
                       .collect(Collectors.toList());
    }

    public List<Student> getFemaleStudents() {
        List<Student> result = new ArrayList<>();
        for (Student s : students) {
            if (s.getGender().equalsIgnoreCase("Nu")) {
                result.add(s);
            }
        }
        return result;
    }

    public List<Student> getUniqueStudents() {
        Map<String, Integer> idCounts = new HashMap<>();
        for (Student s : students) {
            idCounts.put(s.getId(), idCounts.getOrDefault(s.getId(), 0) + 1);
        }

        List<Student> result = new ArrayList<>();
        for (Student s : students) {
            if (idCounts.get(s.getId()) == 1) {
                result.add(s);
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
    	Bai5 manager = new Bai5("D:\\JAVA 19\\2.JAVA\\lesson15-dangquanglam2nd\\src\\bai5\\student.txt");

        // a. Sắp xếp danh sách sinh viên
    	List<Student> sortedStudents = manager.sortStudentsByScoreAndName(manager.students);
        System.out.println("Danh sách sinh viên sau khi sắp xếp:");
        sortedStudents.forEach(System.out::println);

        // b. Danh sách sinh viên có ĐTB > 8
        System.out.println("Sinh viên có ĐTB > 8: " + manager.getStudentsWithHighScore());

        // c. Danh sách sinh viên nữ
        System.out.println("Sinh viên nữ: " + manager.getFemaleStudents());

        // d. Sinh viên chỉ xuất hiện một lần
        System.out.println("Sinh viên chỉ xuất hiện một lần: " + manager.getUniqueStudents());
    }
}