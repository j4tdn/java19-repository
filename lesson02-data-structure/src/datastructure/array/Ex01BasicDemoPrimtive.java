package datastructure.array;

import java.util.Arrays;
import java.util.Random;

public class Ex01BasicDemoPrimtive {

	public static void main(String[] args) {

		//khai báo, tạo mảng
		// mảng: là kiểu dữ liệu đối tượng--> giá trị lưu ở heap
		//     : số lượng phần tư cố định --> khai báo số lượng phần tử cho nó
		//     : chỉ số bắt đầu từ 0 --> length-1
		// cách 1: khai báo một mảng có giá trị mặc định
		int[] digit =new int[8];
		// gán cập nhật giá trị cho mảng:
		digit[2]=123;
		digit[4]=852;
		// in nhanh 1 mảng:
		System.out.println("digit-->" +Arrays.toString(digit));
		System.out.println("digit-->" +Arrays.toString(digit));
		System.out.println("==================================");
		// cách 2: khai báo và tạo giá trị cho mảng 
		int[] number = new int[] {47,54,67,78,98};
		//BT1: Lấy 1 phần tử ngẫu nhiên trong mảng number
		Random rd=new Random();
		int randomValue= number[rd.nextInt(number.length)];
		System.out.println("randomValue-->"+randomValue);
	}

}
