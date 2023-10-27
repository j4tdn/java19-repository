package org.example;

import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (count < 3) {
            System.out.print("Nhập vào 1 số thực có phần thập phân khác 0: ");
            if (scanner.hasNextDouble()) {
                double num = scanner.nextDouble();
                if (num == 0) {
                    System.out.println("Số nhập vào phải có phần thập phân khác 0. Vui lòng nhập lại.");
                } else {
                    int numerator = (int)(num * 100);
                    int denominator = 100;
                    int gcd = gcd(numerator, denominator);

                    numerator /= gcd;
                    denominator /= gcd;

                    System.out.println(num + " -> " + numerator + "/" + denominator);
                    break;
                }
            } else {
                System.out.println("Giá trị nhập vào không hợp lệ. Vui lòng nhập lại.");
                count++;
                scanner.next();
            }
        }

        if (count == 3) {
            System.out.println("Đã nhập sai quá 3 lần. Chương trình sẽ thoát.");
        }

        scanner.close();
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
