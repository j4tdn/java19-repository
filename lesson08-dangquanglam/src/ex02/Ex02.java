package ex02;

import java.util.Scanner;

public class Ex02 {
//	Viết chương trình cho phép người dùng nhập vào họ và tên sau đó in ra kết quả theo yêu cầu
//	sau:
//
//	Họ tên nhập vào chỉ bao gồm các kí tự [A-Za-z ]
//	Viết HOA chữ cái đầu tiên của mỗi từ, còn lại là kí tự thường
//	Các kí tự cách nhau một khoảng trắng
//	Example : aDam Le vAN john Son => Adam Le Van John Son
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập họ và tên:");
		String fullName = sc.nextLine();
		
		String[] words = fullName.split("[\\s,]+");
		StringBuilder stringBuilder = new StringBuilder();
		for(String word : words) {
			if(word.length() > 0) {
				String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
				stringBuilder.append(capitalizedWord)
							 .append(" ");
			}
		}
		String formatName = stringBuilder.toString().trim();
		System.out.println("Họ tên chính xác: " + formatName);

	}
}
