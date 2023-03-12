package datastructure.array;

import java.util.Arrays;
import java.util.Random;

public class Ex02ArrayStringDemo {
	public static void main(String[] args) {
		Random rd = new Random();
		String[] students = { "le teo", "hoang a", "van nam", "ngoc tai", "dao anh" };
		// TH1: select 3 random students from String[] students
		String first = students[rd.nextInt(students.length)];
		String second = students[rd.nextInt(students.length)];
		// --> co the bi trung,can nhieu sv phai lap lai doan code nhieu lan

		// tong quat: select 'k' students from n(length) students

		// input:students,k
		// output: pickedStudents --> length = k

		int k = 3;
		int i = 0;
		String[] pickedStudents = new String[k];
		while (true) {
			// 1. random a element
			String temp = students[rd.nextInt(students.length)];

			// 2. check element is contain in pickedStudents[]
			// 2.1 if contain --> random new element
			if (isExists(temp, pickedStudents)) {
				continue;
			}
			// 2.2 if not contain --> add to pickedStudents[]
			pickedStudents[i++] = temp;
			// i++;
			
			// break when k == i
			if (i == k) {
				break;
			}
			
		}

		System.out.println("pickedStudents: " + Arrays.toString(pickedStudents));

	}

	private static boolean isExists(String checkingElement, String[] elements) {
		for (int i = 0; i < elements.length; i++) {
			if (checkingElement.equals(elements[i])) {
				return true;
			}
		}
		return false;
//		for (String element : elements) {
//		if (checkingElement.equals(element)) {
//			return true;
//		} 
//		return false;
	}
}