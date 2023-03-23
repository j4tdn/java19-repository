package datastruture.array;

import java.util.Random;

public class Ex02ArrayStringDemo {
public static void main(String[] args) {
	Random rd = new Random();
	String[] students = {"Le Teo", "Hoang A", "Van Nam", "Ngoc Tai", "Dao Anh"};
	// BT1: chọn 2 sinh viên ngẫu nhiên trong danh sách 
	int k = 3;
	int running = 0;
	String[] pickedStudents = new String[k];
	while(true) {
		String temp = students[rd.nextInt()];
		if(isExist(temp, pickedStudents)) {
			continue;
		}
		pickedStudents[running++] = temp;
		if(running == k ) {
			break;
		}
	}
	
}
private static boolean isExist(String checkingElement, String[] elements) {
	for(int i = 0; i < elements.length; i++) {
		if(checkingElement.equals(elements[i])) {
			return true;
			}
	}
	return false;
}

}

