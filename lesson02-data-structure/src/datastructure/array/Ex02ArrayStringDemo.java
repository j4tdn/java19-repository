package datastructure.array;

import java.util.Arrays;
import java.util.Random;

public class Ex02ArrayStringDemo {
	public static void main(String[] args) {
		String[] student = { "Le Teo", "Hoang A", "Van Nam", "Ngoc Tai", "Dao Anh" };
		Random rd = new Random();
		// BT1: Chọn 2 sinh viên ngẫu nhiên trong danh sách để làm gì đó

		int k = 3;
		int count = 0;
		String[] pickedStudents = new String[k];
		String temp = "";
		while (true) {
			temp = student[rd.nextInt(student.length)];
			if(isExists(temp, pickedStudents)) {
				continue;
			}
			pickedStudents[count++] = temp;
			if(count == k) {
				break;
			}
		}
		System.out.println(Arrays.toString(pickedStudents));
	}

	public static boolean isExists(String checkingElement, String[] elements) {
		for (int i = 0; i < elements.length; i++) {
			if (checkingElement.equals(elements[i])) {
				return true;
			}
		}
		return false;
	}
}
