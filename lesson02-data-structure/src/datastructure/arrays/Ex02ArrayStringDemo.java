package datastructure.arrays;

import java.util.Arrays;
import java.util.Random;

import javax.lang.model.util.Elements;

public class Ex02ArrayStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		String[] students = {"Le Teo", "Quang Lam", "Thanh Đạt", "Van Nam", "Ngoc Tai"};
		int k = 3;
		int count = 0;
		
		//[null, null, null] 
		String[] pickedStrudents = new String[k];
		//BT1: chọn 2 sinh viên ngẫu nhiên trong danh sach
		
		while(true) {
			//B1: random ra 1 phần tử
			String temp = students[rd.nextInt(students.length)];
			//B2:kiểm tra xem phần tử này đã được random chon trc đó chưa
			if(isExits(temp, pickedStrudents)) {
				//2.1 nếu đã tồn tại
				continue;
			}
			    //2.2 chưa tồn tại --> đưa/gán phần tử tiếp theo trong pickedStrudents
			pickedStrudents[count++] = temp;
			//--> khi số lượng đưa vào = k = students.length --> dừng lại
			if(count==k) {
				break;
			}
		}
		
		System.out.println("pickedStrudents :" +Arrays.toString(pickedStrudents));

	}
	private static boolean isExits(String checkingElement, String[] elements) {
		for(int i = 0; i < elements.length; i++) {
			//==so sánh giá tri ở stack --> thay thế bằng cách sử dụng so sánh ở Heap
			if(checkingElement.equals(elements)) {
				return true;
			}
		}
		return false;
	}

}
