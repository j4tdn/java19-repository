package datastructure.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Ex02ArrayStringDemo {
	public static void main(String[] args) {
		Random rd = new Random();
		String[] students = {"teo","hoanh","dd","hhaa","add"};
		int k =3;
		int running = 0;
		String[]pickedStudents = new String[k];
		
		while (true) {
			String temp = students[rd.nextInt(students.length)];
			if (isExists(temp, pickedStudents)) {
			continue;
			}
			pickedStudents[running++] = temp;
			if(running == k) {
				break;
			}
		}
		System.out.println("pickedStudents-->" +Arrays.toString(pickedStudents));
		//bt1 : chọn 2 sv ngẫu nhiên trong ds 
		
	}
	private static boolean isExists(String checkingElement,String[] elements) {
		for (int i = 0; i < elements.length; i++) {
			if(checkingElement.equals(elements[i])) {
				return true;
			}
		}
		return false;
	}
	
}
