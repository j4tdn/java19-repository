package homework;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        boolean isValid = false;

        do {
            System.out.print("Nhập số nguyên a: ");
            a = sc.nextInt();
            System.out.print("Nhập số nguyên b: ");
            b = sc.nextInt();
            System.out.print("Nhập số nguyên c: ");
            c = sc.nextInt();
            if (a >= 0 && a < 20 && b >= 0 && b < 20 && c >= 0 && c < 20) {
                isValid = true;
            } else {
                System.out.println("Bạn đã nhập số ngoài phạm vi. Vui lòng nhập lại.");
            }
        } while (!isValid);

        int max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }

        int min = a;
        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }

        System.out.println("Số lớn nhất trong ba số " + a + ", " + b + ", " + c + " là: " + max);
        System.out.println("Số nhỏ nhất trong ba số " + a + ", " + b + ", " + c + " là: " + min);
    }
}

