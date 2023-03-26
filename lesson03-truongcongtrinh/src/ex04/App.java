package ex04;

import java.util.Random;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		Matrix mtx = new Matrix();

		int choice = 0;
		do {
			System.out.println("1. Create a random Matrix");
			System.out.println("2. Input Matrix by yourself");
			System.out.println("3. Check Saddle Element");
			System.out.println("4. Display a matrix");
			System.out.println("5. Exit");
			System.out.print("Enter selection.. ");
			choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1:
				mtx.setCol(1 + rd.nextInt(10));
				mtx.setRow(1 + rd.nextInt(10));
				mtx = MatrixUtil.randomMatrix(mtx);
				System.out.println("Create Successfully!");
				break;
			case 2:
				mtx = MatrixUtil.inputMatrix(mtx);
				System.out.println("Create Successfully!");
				break;
			case 3:
				MatrixUtil.printExistSaddle(mtx);
				break;
			case 4:
				MatrixUtil.displayMatrix(mtx);
				break;
			case 5:
				System.out.print("Do you want exit [y/n]: ");
				String confirm = sc.next().toLowerCase();
				if (confirm.equalsIgnoreCase("y")) {
					System.out.println("Thank you for using!!!");
					System.exit(0);
				}
			default:
				break;
			}
		} while (choice > 0 && choice < 5);

	}
}
