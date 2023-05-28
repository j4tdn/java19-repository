package ex03;

import java.util.Scanner;

public class EmailValidationDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = null;
        boolean isValidEmail = false;

        do {
            System.out.print("Enter email: ");
            email = sc.nextLine();

            try {
                isValidEmail = validateEmail(email);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        if (isValidEmail) {
            System.out.println("Valid Email Successfully!!!");
        }

        sc.close();
    }

    private static boolean validateEmail(String email) {
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Email must be in this format: example@mail.com");
        }

        String domain = email.substring(email.indexOf("@") + 1);

        if (!"mail.com".equals(domain)) {
            throw new IllegalArgumentException("Invalid Domain! Email must be in this format: example@mail.com");
        }

        String prefix = email.substring(0, email.indexOf("@"));

        if (!isValidEmailPrefix(prefix)) {
            throw new IllegalArgumentException("Invalid Prefix! Email must be in this format: example@mail.com");
        }

        return true;
    }

    private static boolean isValidEmailPrefix(String prefix) {
        return prefix.matches("^[a-zA-Z0-9]+([._-][a-zA-Z0-9]+)*$");
    }

}
