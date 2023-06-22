package Ex04;

import java.util.Scanner;

public class Register {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your account name: ");
        String name = scanner.nextLine();

        String password;
        boolean isValidPassword = false;

        while (!isValidPassword) {
            System.out.print("Enter your password: ");
            password = scanner.nextLine();

            String errorMessage = validatePassword(name, password);

            if (errorMessage.isEmpty()) {
                System.out.println("\nRegistration successful!");
                System.out.println("\nAccount Information: \n" + "account name: " + name +"\n" + "password: " + password );
                isValidPassword = true;
            } else {
                System.out.println("\nInvalid password: ");
                System.err.println(errorMessage +"\n");
            }
        }
    }

    public static String validatePassword(String accountName, String password) {
        StringBuilder errorMessage = new StringBuilder();

        // Password length >= 8
        if (password.length() < 8) {
            errorMessage.append("Password length should be at least 8 characters. \n");
        }

        //Contains at least 1 digit, 1 uppercase character, and 1 special character
        boolean hasDigit = false;
        boolean hasUppercase = false;
        boolean hasSpecialChar = false;

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if ("~!@#$%^&*".indexOf(c) != -1) {
                hasSpecialChar = true;
            }
        }

        if (!hasDigit) {
            errorMessage.append("Password should contain at least 1 digit. \n");
        }

        if (!hasUppercase) {
            errorMessage.append("Password should contain at least 1 uppercase character. \n");
        }

        if (!hasSpecialChar) {
            errorMessage.append("Password should contain at least 1 special character (~!@#$%^&*). \n");
        }

        //Do not match more than 3 characters with the account name
        int matchCount = 0;
        for (int i = 0; i < accountName.length() - 2; i++) {
            String substring = accountName.substring(i, i + 3);
            if (password.contains(substring)) {
                matchCount++;
            }
        }

        if (matchCount > 3) {
            errorMessage.append("Password should not match more than 3 characters with the account name. \n");
        }

        return errorMessage.toString();
    }
}
