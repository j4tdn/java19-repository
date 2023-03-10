package datastructure.array;

import java.util.Arrays;
import java.util.Random;

public class Ex02ArrayStringDemo {
	public static void main(String[] args) {
		Random rd = new Random();

		String[] students = { "Le Teo", "Hoan A", "Van Nam", "Ngoc Tai", "Dao Anh" };
		// Picked 2 students random in list to do...

		int k = 3;
		int running = 0;
		String[] pickedStudents = new String[k];

		while (true) {
			String temp = students[rd.nextInt(students.length)];
			if (isExists(temp, pickedStudents)) {
				continue;
			}

			pickedStudents[running++] = temp;

			if (running == k) {
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
	}
}
