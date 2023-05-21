package ex02;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String password;
        boolean validPassword = false;
        
        while (!validPassword) {
            System.out.print("Password: ");
            password = ip.nextLine().trim();
            
            if (isValidPassword(password)) {
                System.out.println("Valid password.");
                validPassword = true;
            } else {
                System.out.println("Invalid password. Please re-enter.");
            }
        }
        
        System.out.println("Doneeee <3");
    }

    public static boolean isValidPassword(String password) {
        if (password.length() < 8 || password.length() > 256) {
            System.out.println("Password must have between 8 and 256 characters.");
            return false;
        }
        if (!password.matches(".*\\d+.*")) {
            System.out.println("Password must contain at least one digit.");
            return false;
        }
        if (!password.matches(".*[A-Z].*")) {
            System.out.println("Password must contain at least one uppercase letter.");
            return false;
        }
        if (!password.matches(".*[a-z].*")) {
            System.out.println("Password must contain at least one lowercase letter.");
            return false;
        }
        if (!password.matches(".*[!@#$%^&*()_+-={}|\\[\\]\\;':\",./<>?`~].*")) {
            System.out.println("Password must contain at least one special character.");
            return false;
        }
        return true;
    }
}
