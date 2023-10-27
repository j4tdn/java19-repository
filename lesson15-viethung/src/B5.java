package org.example;

import java.io.File;
import java.util.*;


class Student {
    String id;
    String name;
    double gpa;
    String gender;

    public Student(String id, String name, double gpa, String gender) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.gender = gender;
    }
}

public class B5 {
    public static void main(String[] args) throws Exception {

        List<Student> students = new ArrayList<>();

        Map<String, String> map = new HashMap<>();

        File file = new File("F:/Desktop/code/code/untitled7/src/main/java/org/example/student.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] data = line.split(", ");

            String id = data[0];
            String name = data[1];
            double gpa = Double.parseDouble(data[2]);
            String gender = data[3];
            map.put(id, name);
            students.add(new Student(id, name, gpa, gender));
        }

        // a
        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                if (s1.gpa == s2.gpa) {
                    return s2.name.compareTo(s1.name);
                } else {
                    return Double.compare(s1.gpa, s2.gpa);
                }
            }
        });

        // b
        System.out.println("Sinh viên có ĐTB > 8: ");
        for (Student s : students) {
            if (s.gpa > 8) {
                System.out.println(s.name);
            }
        }

        System.out.println();

        // c
        System.out.println("Sinh viên nữ: ");
        for (Student s : students) {
            if (s.gender.equals("Nu")) {
                System.out.println(s.name);
            }
        }

        System.out.println();

        // d
        Set<String> idSet = new HashSet<>();
        for (Student s : students) {
            if (!idSet.add(s.id)) {
                idSet.remove(s.id);
            }
        }

        System.out.println("Sinh viên xuất hiện 1 lần: ");
        for (String id : idSet) {
            System.out.println(map.get(id));
        }

    }

}
