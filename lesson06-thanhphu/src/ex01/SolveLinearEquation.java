package ex01;

import java.util.Scanner;

public class SolveLinearEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 0;

        do {
            try {
                System.out.print("Enter coefficient a: ");
                a = Integer.parseInt(input.nextLine());
                System.out.print("Enter coefficient b: ");
                b = Integer.parseInt(input.nextLine());
                double x = solveEquation(a, b);
                System.out.println("x = " + x);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (true);
    }

    public static double solveEquation(int a, int b) throws ArithmeticException {
        if (a == 0) {
            throw new ArithmeticException("Coefficient a cannot be zero.");
        }
        return -b / (double) a;
    }
}