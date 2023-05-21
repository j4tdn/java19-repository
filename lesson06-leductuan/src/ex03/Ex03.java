package ex03;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String email;

        do {
            try {
                System.out.print("Enter email address: ");
                email = ip.nextLine();
                validateEmail(email);
                System.out.println("Valid email address.");
                break;
            } catch (Exception e) {
                System.out.println("Invalid email address. " + e.getMessage());
            }
        } while (true);
    }

    public static void validateEmail(String email) throws Exception {
        if (!email.contains("@")) {
            throw new Exception("Email address must contain the '@' symbol.");
        }

        if (!email.contains(".")) {
            throw new Exception("Email address must contain the '.' symbol.");
        }

        if (email.startsWith("-") || email.endsWith("-")) {
            throw new Exception("Email address should not start or end with the '-' symbol.");
        }

        if (email.startsWith(".") || email.endsWith(".")) {
            throw new Exception("Email address should not start or end with the '.' symbol.");
        }

        if (email.contains("..")) {
            throw new Exception("Email address should not have consecutive '.' symbols.");
        }

        if (email.contains(" ")) {
            throw new Exception("Email address should not contain spaces.");
        }

        if (email.indexOf("@") == 0) {
            throw new Exception("Email address must have at least one character before the '@' symbol.");
        }

        if (email.indexOf("@") + 1 >= email.lastIndexOf(".")) {
            throw new Exception("Email address must have at least one character between the '@' and '.' symbols.");
        }
    }
}
