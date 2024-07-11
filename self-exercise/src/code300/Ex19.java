package code300;

import java.util.Scanner;

public class Ex19 {
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	System.out.println("Nhập chuỗi bit: ");
	String binary = ip.nextLine();
	int count = 0;
	for(int i = 0; i < binary.length(); i++) {
		if(binary.charAt(i) == '1') {
			count++;
		}
	}
	System.out.println(count);
}
}
