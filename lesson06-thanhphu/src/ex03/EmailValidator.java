package ex03;

import java.util.Scanner;

public class EmailValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email;

        do {
            try {
                System.out.print("Enter email address: ");
                email = input.nextLine();
                validateEmail(email);
                System.out.println("Email address is valid.");
                break;
            } catch (Exception e) {
                System.out.println("Email address is not valid. " + e.getMessage());
            }
        } while (true);
    }

    public static void validateEmail(String email) throws Exception {
        
        if (!email.contains("@")) {
            throw new Exception("Email address must contain '@' symbol.");
        }

    
        if (!email.contains(".")) {
            throw new Exception("Email address must contain '.' symbol.");
        }

        
        if (email.startsWith("-") || email.endsWith("-")) {
            throw new Exception("Email address cannot start or end with '-' symbol.");
        }

        
        if (email.startsWith(".") || email.endsWith(".")) {
            throw new Exception("Email address cannot start or end with '.' symbol.");
        }

      
        if (email.contains("..")) {
            throw new Exception("Email address cannot contain consecutive '.' symbols.");
        }

       
        if (email.contains(" ")) {
            throw new Exception("Email address cannot contain spaces.");
        }

       
        if (email.indexOf("@") == 0) {
            throw new Exception("Email address must have at least one character before '@' symbol.");
        }

       
        if (email.indexOf("@") + 1 >= email.lastIndexOf(".")) {
            throw new Exception("Email address must have at least one character between '@' and '.' symbols.");
        }
    }
}
