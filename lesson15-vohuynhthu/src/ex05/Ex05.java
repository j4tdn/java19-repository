package ex05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex05 {
   public static void main(String[] args) {
	   String filePath = "student.txt";
       String content = "";
       try {
           content = Files.readString(Paths.get(filePath));
       } catch (IOException e) {
           e.printStackTrace();
       }
 
	 String[] array = content.split(",");
	 //List<String> list = new ArrayList<>(Arrays.asList(array));
	 //System.out.println(list);  
	//List<Student> students = Arrays.stream(array).boxed().collect(Collectors.<Student>toList());

   Collections.sort(students, Comparator.comparing(Student::getGpa).thenComparing(Student::getName).reversed());
   
   
   }
   
   public List<Student> findStudentsWithHighGpa(List<Student> students) {
	    return students.stream()
	                   .filter(student -> student.getGpa() > 8)
	                   .collect(Collectors.toList());
	}
   public List<Student> findStudentsAreGirls(List<Student> students) {
	    return students.stream()
	                   .filter(student -> student.getSex().matches("Nu"))
	                   .collect(Collectors.toList());
	}

}

