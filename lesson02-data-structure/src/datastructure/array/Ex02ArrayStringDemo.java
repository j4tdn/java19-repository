package datastructure.array;

import java.util.Random;

public class Ex02ArrayStringDemo {

	public static void main(String[] args) {
		
		/* so sánh giá trị ở STACK */
		
		Random rd = new Random();
		String[] students = {"Nguyen A", "Tran Quan", "Van Teo"};

		// BT1: Chọn 2(k) sinh viên ngẫu nhiên trong danh sách để làm...
		// Hạn chế: 2 sinh viên có thể trùng
		//		  : khi cần nhiều sv thì phải lặp lại đoạn code nhiều lần
		String firstStudent = students[rd.nextInt(students.length)];
		String secondStudent = students[rd.nextInt(students.length)];
		
		// input: students, k
		// outputL pickedStudents --> length = k
		
		int k = 2;
		int running = 0;
		String[] pickedStudents = new String[k];

		while(true) {
			// B1: random ra 1 phần tử
			String temp = students[rd.nextInt(students.length)];
			
			// B2: Kiểm tra xem phần tử này đã được random, chọn trước đó chưa
			// 	xem thử phần tử temp đã thuộc trong mảng pickStudents chưa
			if(isExists(temp, pickedStudents)) {
				// 2.1 Nếu đã tồn tại rồi --> bỏ qua --> random thằng mới
				continue;
			}

			
			pickedStudents[running] = temp;
			running++;
			// 2.2 Nếu chưa tồn tại --> đưa/gán vào phần tử tiếp theo trong pickedStudents
			
			// --> khi số lượng đưa vào = k = students.length --> dừng lại
			if(running == k) {
				break;
			}
		}
	}
	
	private static boolean isExists(String checkingElement, String[] elements) {
		for(int i = 0; i < elements.length; i++) {
			// so sánh giá trị ở STACK
			// thay thế bằng cách sử dụng so sánh giá trị ở HEAP
			if(checkingElement.equals(elements[i])) {
				return true;
			}
		}
		return false;
	}

}
