package view;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import bean.Student;

public class Ex05 {

	private static final String PATH = "student.txt";

	public static void main(String[] args) {

		// Read data from txt file --> return List<String>

		Path path = Paths.get(PATH);

		try {
			List<Student> students = new ArrayList<>();
			List<String> lines = Files.readAllLines(path);
			for (String line : lines) {
				String[] s = line.split(", ");
				students.add(new Student(Integer.parseInt(s[0]), s[1], Double.parseDouble(s[2]), s[3]));
			}

			System.out.println("a. Sắp xếp danh sách sinh viên tăng dần theo ĐTB. Nếu ĐTB bằng nhau sắp xếp giảm "
					+ "dần theo họ tên.\n");
			students.stream().sorted(Comparator
					.comparing(Student::getAveragePoint).thenComparing(Student::getName, Comparator.reverseOrder()))
					.forEach(System.out::println);


			System.out.println("\n ==================== \n");
			System.out.println("Danh sách sinh viên có ĐTB > 8\n");
					students.stream().filter(s -> s.getAveragePoint() > 8)
							.forEach(System.out::println);

			System.out.println("\n ==================== \n");
			System.out.println("Toàn bộ các sinh viên NỮ\n");

			students.stream().filter(s -> "Nu".equals(s.getGender()))
					.forEach(System.out::println);;

			System.out.println("\n ==================== \n");
			System.out.println("Các sinh viên chỉ xuất hiện một lần trong student.txt. 2 sinh viên được "
					+ "phân biệt với nhau thông qua MSSV\n");
			students.stream().filter(s -> Collections.frequency(students, s) == 2)
							 .forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
