package datastructure.array;

import java.util.Arrays;
import java.util.Random;

public class Ex02ArraysStringDemo {
	public static void main(String[] args) {
		// == --> so sánh giá trị ở STACK
		// String --> so sánh giá trị ở HEAP sử dụng hàm equals
		
		/*String s1 = "hello";//h1
		String s2 = "hello";//h1
		String s3 = "hallo";//h2
		
		System.out.println("-> s1==s2 => "  + (s1==s2) );
		System.out.println("-> s2==s3 => "  + (s2==s3) );
		
		String o1 = new String("hello");//h3
		String o2 = new String("hello");//h4
		String o3 = new String("hallo");//h5
		
		System.out.println("-> o1==o2 => "  + (o1==o2) );
		System.out.println("-> o2==o3 => "  + (o2==o3) );
		
		System.out.println("-> o1==o2 => "  + (o1.equals(o2)) );
		System.out.println("-> o2==o3 => "  + (o2.equals(o3)) );
		
		*/
		
		Random rd = new Random();
		
		String[] students = {"Le Teo", "Hoang A", "Van Nam","Ngoc Tai","Dao Anh"};
		
		//BT1: Chọn 3(k) sinh viên ngẫu nhiên trong danh sách để làm..
		//Hạn chế: 2 sinh viên có thể bị trùng
		//		 : khi cần nhiêu sinh viên thì phải lọc lại đoạn code nhiều lần
		
		
		//Tổng quát : chọn K sv trong n(length) sv --> ko trùng nhau
		
		
		//String firstSt = students[rd.nextInt(students.length)];	
		//String second = students[rd.nextInt(students.length)];
		// String[] --> lưu những tên đã được chọn --> K
		
		//input: students, k 
		//output: pickedStudents --> length = k
		//
		
		int k = 3;
		int running = 0;//1 2
		//[null, null, null] -->[Hoang A,Le Teo,null]
		String[] pickedStudents = new String[k];
		
		while(true) {
			//B1:random ra 1 phần tử
			String temp = students[rd.nextInt(students.length)];
		
			//B2: kiểm tra xem phần tử này có đã được random, chọn trước đó chưa
			// == xem thử phần tử temp đã thuộc trong mảng pickStudents chưa
			if(isExists(temp, pickedStudents)) {
				// 2.1 Nếu đã tồn tại rồi --> bỏ qua --> random thằng mới
				continue;
			}
			
			//2.2 Nếu chưa tồn tại --> đưa/gán vào phần tử tiếp theo trong pickStudents
			pickedStudents[running++] = temp;
			
			
			
			//     --> khi số lượng đưa vào = k = student.length --> dừng lại
			if(running == k) {
				break;
			}
		}
	
		System.out.println("pickedStudents --> " + Arrays.toString(pickedStudents));
	
	
	}
	
	private static boolean isExists(String checkingElement,String[] elements) {
		for (int i = 0; i< elements.length; i++) {
			// == so sánh giá trị ở STACK --> thay thế sau cách sử dụng so sánh giá trị ở HEAP
		//	if (checkingElement == elements[i]) {
				if (checkingElement.equals(elements[i])) {
				return true;
				
			}
		}
		return false;
	}
	
}
