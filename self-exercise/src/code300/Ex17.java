package code300;

import java.util.Scanner;

public class Ex17 {
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	System.out.println("Nhập chuỗi bit: ");
	String bit = ip.nextLine();
	String reversebit = reverseBinary(bit);
	int integerValue = binaryToInteger(reversebit);
	System.out.println("chuỗi bit: " + reversebit);
	System.out.println("chuỗi số nguyên tương ứng: " + integerValue);
}
public static int binaryToInteger(String binaryString) {
	int Integervalue = Integer.parseInt(binaryString, 2);
	return Integervalue;
}
public static String reverseBinary(String binary) {
	char[] charArray = binary.toCharArray();
	int length = charArray.length;
	
	
	for(int i = 0; i < charArray.length/2; i++) {
	char temp = charArray[i];
	charArray[i] = charArray[length - i -1];
	charArray[length - i - 1] = temp;
	}
	
	String reverseBit = new String(charArray);
	System.out.println(reverseBit);
	return reverseBit;
}
}
