package ex02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String password, userName;
        boolean validName = false;
        while (!validName) {
            try {
                System.out.print("Nhập tài khoản : ");
                userName = scanner.nextLine().trim();
                validateUserName(userName); // kiểm tra tính hợp lệ của mật khẩu
                System.out.println("Tài khoản hợp lệ!");
                validName = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        
        while (true) {
            try {
                System.out.print("Nhập mật khẩu: ");
                password = scanner.nextLine().trim();
                validatePassword(password); // kiểm tra tính hợp lệ của mật khẩu
                System.out.println("Mật khẩu hợp lệ!");
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + "\nVui lòng nhập lại....");
            }
        }
    }
	
	public static void validateUserName(String userName) {
        if (userName.length() < 8 || userName.length() > 256) {
            throw new IllegalArgumentException("Tài khoản phải có ít nhất 8 kí tự và nhiều nhất 256 kí tự.");
        }
        if (userName.contains(" ")) {
            throw new IllegalArgumentException("Tài khoản không được chứa khoảng trắng.");
        }
    }

    public static void validatePassword(String password) {
        if (password.length() < 8 || password.length() > 256) {
            throw new IllegalArgumentException("Mật khẩu phải có ít nhất 8 kí tự và nhiều nhất 256 kí tự.");
        }
        if (password.contains(" ")) {
            throw new IllegalArgumentException("Mật khẩu không được chứa khoảng trắng.");
        }
        if (!password.matches(".*\\d+.*")) {
            throw new IllegalArgumentException("Mật khẩu phải chứa ít nhất một số.");
        }
        if (!password.matches(".*[A-Z].*")) {
            throw new IllegalArgumentException("Mật khẩu phải chứa ít nhất một chữ cái in hoa.");
        }
        if (!password.matches(".*[a-z].*")) {
            throw new IllegalArgumentException("Mật khẩu phải chứa ít nhất một chữ cái in thường.");
        }
        if (!password.matches(".*[!@#$%^&*()_+-={}|\\[\\]\\;':\",./<>?`~].*")) {
            throw new IllegalArgumentException("Mật khẩu phải chứa ít nhất một kí tự đặc biệt.");
        }
    }
}