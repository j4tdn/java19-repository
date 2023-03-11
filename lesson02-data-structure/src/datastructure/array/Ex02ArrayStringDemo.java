package datastructure.array;

import java.util.Arrays;
import java.util.Random;

public class Ex02ArrayStringDemo {
	public static void main(String[] args) {
		
		Random rd = new Random();
		String[] studens = {"van a", "van b", "van c", "van d", "van e" };
		int k = 3;
		int running = 0; // 1
		//[null, null, null] --> [van A, null, null]
		String[] pickedStudent = new String[k];
		
		while(true) {
			//B1: random ra 1 phần tử
			String temp = studens[rd.nextInt(studens.length)];
			
			//B2: kiểm tra xem phần tử này đã được random, chọn trước đó chưa
			// ==xem thử phần tử temp đã thuộc trong mảng pickStuden chưa
			
			if (isExits(temp, pickedStudent)) {
				//2.1 nếu đã tồn tại rồi --> bỏ qua --> random thằng mới
				continue;
			}
			//2.2 nếu chưa tồn tại --> đưa/gán vào phần tử tiếp theo trong pickedStuden
			pickedStudent[running++] = temp;
			
			//  --> khi số lượng đưa vào = k = studen.length --> dừng lại
			
			
			if (running == k) {
				break;
			}
		}
		System.out.println("pickedStudent--> " + Arrays.toString(pickedStudent));
		
	}
	
	private static boolean isExits(String checkingElement, String[] elements) { 
		    for (int i = 0; i < elements.length; i++) {
			
		    	if (checkingElement.equals(elements[i])) {
				return true;
			}
			
		}
		return false;
	}

}
