package exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Ex05 {
	public static void main(String[] args) {
		 List<Student> students = readStudentsFromFile("D:\\Java19\\2.JAVA\\lesson15-leductuan-2nd\\src\\exercise\\student.txt");

	        sortStudents(students);

	        System.out.println("Danh sách sinh viên đã sắp xếp:");
	        System.out.println();
	        for (Student student : students) {
	            System.out.println(student.getMssv() + ", " + student.getName() + ", " + student.getGpa() + ", " + student.getGender());
	        }

	        List<Student> highGpaStudents = findStudentsWithHighGpa(students, 8);
	        System.out.println();
	        System.out.println("Danh sách sinh viên có ĐTB > 8:");
	        System.out.println();
	        for (Student student : highGpaStudents) {
	            System.out.println(student.getMssv() + ", " + student.getName() + ", " + student.getGpa() + ", " + student.getGender());
	        }

	        List<Student> femaleStudents = findFemaleStudents(students);
	        System.out.println();
	        System.out.println("Danh sách sinh viên nữ:");
	        System.out.println();
	        for (Student student : femaleStudents) {
	            System.out.println(student.getMssv() + ", " + student.getName() + ", " + student.getGpa() + ", " + student.getGender());
	        }

	        List<Student> uniqueStudents = findUniqueStudents(students);
	        System.out.println();
	        System.out.println("Danh sách sinh viên chỉ xuất hiện một lần:");
	        System.out.println();
	        for (Student student : uniqueStudents) {
	            System.out.println(student.getMssv() + ", " + student.getName() + ", " + student.getGpa() + ", " + student.getGender());
	        }
	    }

	    private static List<Student> readStudentsFromFile(String filename) {
	        List<Student> students = new ArrayList<>();

	        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                String[] parts = line.split(", ");
	                if (parts.length == 4) {
	                    String mssv = parts[0];
	                    String name = parts[1];
	                    double gpa = Double.parseDouble(parts[2]);
	                    String gender = parts[3];
	                    students.add(new Student(mssv, name, gpa, gender));
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        return students;
	    }

	    private static void sortStudents(List<Student> students) {
	        Collections.sort(students, new Comparator<Student>() {
	            @Override
	            public int compare(Student s1, Student s2) {
	                if (s1.getGpa() != s2.getGpa()) {
	                    return Double.compare(s1.getGpa(), s2.getGpa());
	                } else {
	                    return s2.getName().compareTo(s1.getName());
	                }
	            }
	        });
	    }

	    private static List<Student> findStudentsWithHighGpa(List<Student> students, double threshold) {
	        List<Student> highGpaStudents = new ArrayList<>();

	        for (Student student : students) {
	            if (student.getGpa() > threshold) {
	                highGpaStudents.add(student);
	            }
	        }

	        return highGpaStudents;
	    }

	    private static List<Student> findFemaleStudents(List<Student> students) {
	        List<Student> femaleStudents = new ArrayList<>();

	        for (Student student : students){
	            if (student.getGender().equalsIgnoreCase("Nu")) {
	                femaleStudents.add(student);
	            }
	        }

	        return femaleStudents;
	    }

	    private static List<Student> findUniqueStudents(List<Student> students) {
	        List<Student> uniqueStudents = new ArrayList<>();
	        HashSet<String> mssvSet = new HashSet<>();

	        for (Student student : students) {
	            if (!mssvSet.contains(student.getMssv())) {
	                uniqueStudents.add(student);
	                mssvSet.add(student.getMssv());
	            }
	        }

	        return uniqueStudents;
	    }
	}

