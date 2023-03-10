package view;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhập một số tự nhiên: ");
		int n = in.nextInt();
		System.out.print("Giá trị nhị phân của " + n + " là: ");
		convertBinary(n);
	}
	
	private static void convertBinary(int num){
        int binary[] = new int[32];
        int index = 0;
        while(num > 0){
            binary[index++] = num%2;
            num = num/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
    }
}
