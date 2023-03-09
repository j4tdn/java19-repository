package ex06;

import java.util.Scanner;

public class XacDinhMinMax {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhập số nguyên a: ");
        int a = input.nextInt();
        System.out.print("Nhập số nguyên b: ");
        int b = input.nextInt();
        System.out.print("Nhập số nguyên c: ");
        int c = input.nextInt();
        
        if (a >= 0 && a < 20 && b >= 0 && b < 20 && c >= 0 && c < 20) {
            int max = a;
            if (b > max) {
                max = b;
            }
            if (c > max) {
                max = c;
            }
            
            int min = a;
            if (b < min) {
                min = b;
            }
            if (c < min) {
                min = c;
            }
            
            System.out.println("Số lớn nhất là: " + max);
            System.out.println("Số nhỏ nhất là: " + min);
        } else {
            System.out.println("Các số nhập vào không hợp lệ.");
        }
    }
}
