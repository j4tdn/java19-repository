package datastructure.array;

import java.util.Arrays;
import java.util.Random;

public class Ex02ArrayStringDemo {

	public static void main(String[] args) {
		String[] students = { "Le Tuan", "Nguyen A", "Ngoc Tai", "Van Nam", "Dao Anh" };
		// BT1 chọn 2 sinh viên ngẫu nhiên trong danh sách
		// hạn chế: 2 sinh viên có thể bị trùng
		int k = 3;
		int count = 0;
		Random rd = new Random();
		String[] pickedStudents = new String[k];
		while (true) {
			String temp = students[rd.nextInt(students.length)];
			if (isExist(temp, pickedStudents)) {
				continue;
			}
			pickedStudents[count++] = temp;
			if (count == k) {
				break;
			}
		}
		System.out.println("pickedStudent: " + Arrays.toString(pickedStudents));

	}

	public static boolean isExist(String checkingElement, String[] elements) {
		for (int i = 0; i < elements.length; i++) {
			if (checkingElement.equals(elements[i])) {
				return true;
			}
		}
		return false;
	}

}
