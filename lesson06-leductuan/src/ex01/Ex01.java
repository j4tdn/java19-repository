package ex01;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int a = 0, b = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter a: ");
                a = ip.nextInt();
                System.out.print("Enter b: ");
                b = ip.nextInt();

                if (a == 0) {
                    throw new IllegalArgumentException("Denominator must be different from 0");
                }

                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                ip.nextLine(); // consume the invalid input
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        double x = -b / (double) a;
        System.out.println("x = " + x);
    }
}
