package datastructure.array;

import java.util.Arrays;
import java.util.Random;

public class Ex02ArrayStringDemo {

	public static void main(String[] args) {
		// == so sánh giá trị ở stack
		// string --> so sánh giá trị dùng equals

		String[] students = { "A", "B", "C", "D", "E" };

		// BT1: chọn 3 sinh viên ngẫu nhiên trong danh sách để làm...
		// Tổng quát: chọn k sv trong n(length) sv --> ko trùng nhau

		// input: students, k
		// output: pickedStudents --> length = k

		int k = 3;
		int running = 0;
		String[] pickedStudents = new String[k]; // [null , null, null]
		Random rd = new Random();

		while (true) {
			// B1: random 1 phần tử
			String temp = students[rd.nextInt(students.length)];

			// B2: Kiểm tra phần tử được chọn đã được random, chọn trước đó chưa
			// == xem phần tử đó có thuộc mảng pickedStudents chưa
			if (isExist(temp, pickedStudents)) {
				// 2.1 Nếu tồn tại --> bỏ qua --> random mới
				continue;
			}

			// 2.2 Chưa tồn tại --> gán vào phần tử tiếp theo trong pickedStudents
			pickedStudents[running++] = temp;
			// pickedStudents [running] = temp;
			// running++;
			// --> Khi số lượng đưa vào = k = students.length --> dừng lại
			if (running == k) {
				break;
			}

		}
		System.out.println("picked Students --> " + Arrays.toString(pickedStudents));
	}

	private static boolean isExist(String checkingElement, String[] elements) {
		for (int i = 0; i < elements.length; i++) {
			// == so sánh giá trị ở STACK --> sẽ thay thế sau bằng cách so sánh giá trị thực
			// sự ở HEAP
			// if (checkingElement == elements[i]) {
			if (checkingElement.equals(elements[i])) {
				return true;
			}

		}
		return false;
	}
}
