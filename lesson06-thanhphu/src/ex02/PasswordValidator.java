package ex02;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password;

        do {
            try {
                System.out.print("Enter password: ");
                password = input.nextLine();
                validatePassword(password);
                System.out.println("Password is valid.");
                break;
            } catch (Exception e) {
                System.out.println("Password is not valid. " + e.getMessage());
            }
        } while (true);
    }

    public static void validatePassword(String password) throws Exception {
        if (password.length() < 8) {
            throw new Exception("Password must be at least 8 characters long.");
        }

      
        if (!password.matches(".*[A-Z].*")) {
            throw new Exception("Password must contain at least one uppercase letter.");
        }

     
        if (!password.matches(".*[a-z].*")) {
            throw new Exception("Password must contain at least one lowercase letter.");
        }

        
        if (!password.matches(".*\\d.*"))        {
            throw new Exception("Password must contain at least one digit.");
        }

      
        if (!password.matches(".*[!@#$%^&*()].*")) {
            throw new Exception("Password must contain at least one special character (!@#$%^&*()).");
        }
    }
}
