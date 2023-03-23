package datastructure.array;

import java.util.Arrays;
import java.util.Random;

public class Ex02ArrayStringDemo {
	public static void main(String[] args) {
		String[] students = {"Nguyen Van Vien", "Le Teo","Van Nam","Dao anh"};
		
		//BT1: Chon 3(k) sinh vien ngau hien trong danh sach de lam ...
		
		//Han che : 2 sinh vien co the trung
		//			Khi can nhieu sv thi phai lap lai code nhieu lan
		Random rd = new Random();
//		String first = students[rd.nextInt(students.length)];
//		
//		String second = students[rd.nextInt(students.length)];
		
		//Tong quat : chon 'k' sv trong n -->khong trung nhau
		
		
		
		
		//String[] --> luu nhung ten da chon --> length = k
		
		//input: students, k
		//output : pickedStudents -->length =k
		
		int k = 3;
		String[] pickedStudents = new String[k];
		int running =0;
		while(true) {
			String temp = students[rd.nextInt(students.length)];
			if(isExists(temp, pickedStudents)) {
				continue;
			} 
			else {
				pickedStudents[running] =temp;
				running ++;
			}
			if(running ==k) {
				break;
			}
		}
		
		System.out.println("pickedStudents --> " + Arrays.toString(pickedStudents));
	}
	
	private static boolean isExists(String checkingElement, String[] elements) {
		for(int i=0; i< elements.length; i++) {
			
			//So sanh ow STACK --> thay the bang cach su dung gia tri o HEAP
			if(checkingElement.equals(elements[i])) {
				return true;
			}
		}
		return false;
	}
}
