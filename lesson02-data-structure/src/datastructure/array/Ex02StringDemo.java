package datastructure.array;

import java.util.Arrays;
import java.util.Random;

public class Ex02StringDemo {
	public static void main(String[] args) {
		Random rd = new Random();
		String[] students = { "Le teo", "Hoang A", "Van Nam", "Ngoc Tai", "Dao Anh" };
		int k = 3;
		int running = 0;
		String[] pickedStudent = new String[k];

		while (true) {
			String tempString = students[rd.nextInt(students.length)];
			if (isExists(tempString, pickedStudent)) {
				continue;
			}
			pickedStudent[running++] = tempString;
			if (running == k) {
				break;
			}
		}
		System.out.println(Arrays.toString(pickedStudent));
	}

	private static boolean isExists(String checkingElement, String[] elements) {
		for (int i = 0; i < elements.length; i++) {
			if (checkingElement.equals(elements[i])) {
				return true;
			}
		}
		return false;
	}

}
