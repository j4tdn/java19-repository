package ex05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class Ex05 {
	public static void main(String[] args) {
		List<Student> studentList = readStudentDataFromFile("D:\\Java19\\2.JAVA11\\lesson15-ngthanhphu\\src\\ex05\\student.txt");
		
		//a --->
		sortStudentList(studentList);

        System.out.println("Danh sach sinh vien sau khi sap xep:");
        for (Student student : studentList) {
            System.out.println(student);
        }
        //b -->
        List<Student> highGpaStudents = findStudentsWithHighGpa(studentList, 8.0);
        System.out.println("\nDanh sach sinh vien co DTB > 8:");
        for (Student student : highGpaStudents) {
            System.out.println(student);
        }
        //c -->
        List<Student> femaleStudents = findFemaleStudents(studentList);
        System.out.println("\nDanh sach sinh vien nu:");
        for (Student student : femaleStudents) {
            System.out.println(student);
        }
		//d -->
        List<Student> uniqueStudents = findUniqueStudents(studentList);
        System.out.println("\nDanh sach sinh vien chi xuat hien 1 lan:");
        for (Student student : uniqueStudents) {
            System.out.println(student);
        }
		
	}
	
	public static List<Student> readStudentDataFromFile(String fileName) {
        List<Student> studentList = new ArrayList<>();

        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(", ");

                if (data.length == 4) {
                    String mssv = data[0];
                    String fullName = data[1];
                    double gpa = Double.parseDouble(data[2]);
                    String gender = data[3];

                    Student student = new Student(mssv, fullName, gpa, gender);
                    studentList.add(student);
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return studentList;
    }
	
	public static void sortStudentList(List<Student> studentList) {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.getGpa() < s2.getGpa()) {
                    return -1;
                } else if (s1.getGpa() > s2.getGpa()) {
                    return 1;
                } else {
                    return s2.getFullName().compareTo(s1.getFullName());
                }
            }
        });
    }
	public static List<Student> findStudentsWithHighGpa(List<Student> studentList, double threshold) {
        List<Student> highGpaStudents = new ArrayList<>();

        for (Student student : studentList) {
            if (student.getGpa() > threshold) {
                highGpaStudents.add(student);
            }
        }
        return highGpaStudents;
    }
	public static List<Student> findFemaleStudents(List<Student> studentList) {
        List<Student> femaleStudents = new ArrayList<>();

        for (Student student : studentList) {
            if (student.getGender().equalsIgnoreCase("Nu")) {
                femaleStudents.add(student);
            }
        }

        return femaleStudents;
    }
	
	public static List<Student> findUniqueStudents(List<Student> studentList) {
        List<Student> uniqueStudents = new ArrayList<>();
        Map<String, Integer> studentCountMap = new HashMap<>();

        for (Student student : studentList) {
            String mssv = student.getMssv();
            studentCountMap.put(mssv, studentCountMap.getOrDefault(mssv, 0) + 1);
        }

        for (Student student : studentList) {
            String mssv = student.getMssv();
            if (studentCountMap.get(mssv) == 1) {
                uniqueStudents.add(student);
            }
        }

        return uniqueStudents;
    }

}
