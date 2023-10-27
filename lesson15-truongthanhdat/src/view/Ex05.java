package view;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import model.Student;

public class Ex05 {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student("102130174", "Le Na", 7.8, "Nu"),
				new Student("102130125", "Hoang Nam", 8.2, "Nam"), new Student("102130176", "Van Cuong", 9.8, "Nam"),
				new Student("102130177", "Van Cong", 6.8, "Nam"), new Student("102130178", "Ngoc Nu", 9.1, "Nu"),
				new Student("102130180", "Hoang Nhung", 7.8, "Nu"), new Student("102130178", "Ngoc Nu", 9.1, "Nu"),
				new Student("102130180", "Hoang Nhung", 7.8, "Nu"));

		List<Student> sortedStudents = students.stream().sorted(
				Comparator.comparingDouble(Student::getGpa).thenComparing(Student::getName, Comparator.reverseOrder()))
				.collect(Collectors.toList());

		System.out.println("Danh sách sinh viên theo ĐTB và tên:");
		sortedStudents.forEach(System.out::println);

		List<Student> studentsWithGpaGreaterThan8 = students.stream().filter(student -> student.getGpa() > 8)
				.collect(Collectors.toList());

		System.out.println("\nDanh sách sinh viên có ĐTB > 8:");
		studentsWithGpaGreaterThan8.forEach(System.out::println);

		List<Student> femaleStudents = students.stream().filter(student -> "Nu".equalsIgnoreCase(student.getGender()))
				.collect(Collectors.toList());

		System.out.println("\nDanh sách sinh viên Nữ:");
		femaleStudents.forEach(System.out::println);

		Map<String, Long> studentCountMap = students.stream()
				.collect(Collectors.groupingBy(Student::getId, Collectors.counting()));

		List<Student> uniqueStudents = students.stream().filter(student -> studentCountMap.get(student.getId()) == 1)
				.collect(Collectors.toList());

		System.out.println("\nDanh sách sinh viên chỉ xuất hiện một lần:");
		uniqueStudents.forEach(System.out::println);
	}
}
