package ex04;

import java.util.Scanner;

import exception.custom.ThrowsException;
import exception.custom.ValidatePassword;

public class RegisterAccount {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String nameUser;
        String password;

        ValidatePassword validatePass = new ValidatePassword();
        System.out.print("\n\nPlease enter NameUser : ");
        nameUser = sc.nextLine();
        while (true){
            try {
                System.out.print("\nPlease enter your Password : ");
                password = sc.nextLine();
                if (validatePass.validatePassword(nameUser,password)){
                    break;
                }
            } catch (ThrowsException e) {
                e.printStackTrace();
                System.out.println("\n\n Please ReEnter : ");
            }

        }
        System.out.println("=========================");
        System.out.println("Successful account registration !!!");
    }
}
