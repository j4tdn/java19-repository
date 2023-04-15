package datastructure.array;

import java.util.Arrays;
import java.util.Random;

public class Ex02ArrayStringDemo {
     public static void main(String[] args) {
    	 String[] students = {"Le Teo", "Hoang A", "Van Nam", "Ngoc Tai", "Dao Anh"};
    	 Random rd = new Random();
    	 
    	//BT1: Chọn 2 sinh viên ngẫu nhiên trong danh sách để làm….

    	/*/ Hạn chế: 2 sinh viên có thể trùng
    	 *         : khi cần nhiều sinh viên phải lặp lại đoạn code nhiều lần
    	 *  String first = students[rd.nextInt(students.length)];
    	 *  String first = students[rd.nextInt(students.length)];
         *  -> Tổng quát: Chọn 'k' sv trong n(length)sv --> ko trùng nhau
         *  input: students, k
         *  output: pickedStudents --> length = k
         *  
    	 */
    	int k = 3;
    	int running = 0;
    	String[] pickedStudents = new String[k];
    	
    	 while(true) {
    		//B1: random ra 1 phần tử
    		String temp = students[rd.nextInt(students.length)];
    		
    		//B2: kiểm tra xem phần tử này đã được random, chọn trước đó chưa
    		//   = xem thử phần tử đã thuộc trong mảng pickStudents chưa
    		if(isExists(temp, pickedStudents)) {
        		//2.1 Nếu đã tồn tại rồi --> bỏ qua --> random thằng mới
             continue;
    		}
    		//2.2 Nếu chưa tồn tại --> đưa/gán vào phần tử tiếp theo trong pickedStudents
    		pickedStudents[running++] = temp;
    		
    		// ----> khi số lượng đưa vào = k = students.length --> dừng lại
    		if(running == k) {
    			break;
    		}
    	}
    	 
    	 System.out.println("pickedStudents --> " + Arrays.toString(pickedStudents));
	}
     
      private static boolean isExists(String checkingElement, String[] elements) {
            for(int i = 0; i < elements.length; i++) {
            	if(checkingElement.equals(elements[i])) {
            		return true;
            	}
            }
              return false;
      }
}
