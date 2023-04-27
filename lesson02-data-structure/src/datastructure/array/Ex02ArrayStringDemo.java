package datastructure.array;

import java.util.Arrays;
import java.util.Random;

public class Ex02ArrayStringDemo {
	public static void main(String[] args) {
		String[] students = {"Le Teo", "Hoang A", "Van Nam", "Ngoc Tai", "Dao Anh" };
		
		Random rd = new Random();
		//Bt1: Chon ngau nhien 3 sinh vien trong ds de lam
		//Tông quát chọn k sv trong n(length) sv --> không trùng nhau
		int k = 3;
		String[] pickStudents = new String[k];
		
		while(true) {
			//b1: random ra một phần tử
			String temp = students[rd.nextInt(students.length)];
			//b2: kiểm tra phần tử đã được random, chon trc hay chưa
			
			if(isExists(temp, pickStudents)) {
				// nếu tồn tại bỏ qua random thằng mới
				continue;
			}
			// nếu chưa tồn tại --> gán giá trị mới vào mảng pickStudents
			int running = 0;
			pickStudents[running++] = temp;
			if(running == k) {
				break;
			}
		}
		System.out.println("pickStudents -->" + Arrays.toString(pickStudents));
		
	}
	private static boolean isExists(String checkElement, String[] elements) {
		for(int i = 0; i < elements.length; i++) {
			if(checkElement.equals(elements[i])) {
				return true;
			}
		}
		return false;
	}
}
