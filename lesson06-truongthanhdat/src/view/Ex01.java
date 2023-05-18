package view;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = 0;
        int b = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Nhập hệ số a: ");
                a = Integer.parseInt(in.nextLine());
                System.out.print("Nhập hệ số b: ");
                b = Integer.parseInt(in.nextLine());

                validInput = true;
            } catch (NumberFormatException e) {
				System.out.println("Bạn đã nhập sai kiểu dữ liệu. Vui lòng nhập lại.");
			}
        }

        if (a == 0) {
            System.out.println("Hệ số a phải khác 0. Vui lòng nhập lại.");
        } else {
            double x = (double) -b / a;
            System.out.println("Kết quả: x = " + x);
        }

        in.close();
    }
}
