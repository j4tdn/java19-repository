package bai1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 3;

        while (count > 0) {
            System.out.print("Nhập vào một số thực có phần thập phân khác 0: ");
            
            try {
                double decimal = sc.nextDouble();

                if (decimal % 1 == 0) {
                    System.out.println("Số bạn nhập vào không có phần thập phân khác 0. Vui lòng thử lại.");
                    count--;
                    continue;
                }

                Number number = Number.fromDecimal(decimal);
                System.out.println("Phân số tối giản của " + decimal + " -> " + number);
                return;
            } catch (InputMismatchException e) {
                System.out.println("Đây không phải là một số. Vui lòng nhập lại.");
                sc.nextLine();
                count--;
            }
        }

        System.out.println("Bạn đã nhập sai quá 3lần cho phép. Chương trình kết thúc.");
    }
}