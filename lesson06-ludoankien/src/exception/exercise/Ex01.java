package exception.exercise;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        double a = 0;
	        double b = 0;

	        boolean validInput = false;
	        while (!validInput) {
	            try {
	                System.out.print("Nhập giá trị của a: ");
	                a = Double.parseDouble(sc.nextLine());

	                System.out.print("Nhập giá trị của b: ");
	                b = Double.parseDouble(sc.nextLine());

	                validInput = true; 
	            } catch (NumberFormatException e) {
	                System.out.println("Vui long nhập số hợp lê: ");
	            }
	        }

	        if (a == 0) {
	            if (b == 0) {
	                System.out.println("Phương trình vô số nghiệm.");
	            } else {
	                System.out.println("Phương trình vô nghiệm.");
	            }
	        } else {
	            double x = -b / a;
	            System.out.println("Nghiệm của phương trình là: " + x);
	        }

	        sc.close();
	}
}
