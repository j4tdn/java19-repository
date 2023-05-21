package homework;

import java.io.IOException;
import java.util.Scanner;

public class Ex02 {

	
	/*/20 
	 * dùng nhìu if >> throw ở trên throws 
	 * Viết chương trình kiểm tra tính hợp lệ của mật khẩu khi đăng ký tài khoản
      Mật khẩu phải thỏa mãn các điều kiện sau đây. Lặp lại các bước kiểm tra điều kiện cho đến khi
      đăng ký tài khoản thành công.
	 * Nếu thông tin nhập vào không hợp lệ sẽ ném ra các ngoại lệ, lỗi tương ứng, sau đó thông báo
      cho người dùng biết và cho phép nhập lại.
	 * 5h10
	 */
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		do {
			System.out.print("PLz input your password: ");
			String password = ip.nextLine();
			
			try {
				System.out.println("ps" + isValidPassword(password));
			} catch (IOException e) {
				System.out.println("exception --> " + e.getMessage());
			}
		
		} while (true);
		
	}
	public static boolean isValidPassword(String password) throws IOException {
		boolean isValid = true;
		if(password.length() < 8 && password.length() > 256) {
			throw new IOException("Password should be at least 8 characters & at most 256 characters!");
		}
		String upperCaseChars = "(.*[A-Z].*)";
		if(!password.matches(upperCaseChars)) {
			throw new IOException("Password must be at least 1 uppercase alphabetic character!");
		}
		String lowerCaseChars = "(.*[a-z].*)";
		if(!password.matches(lowerCaseChars)) {
			throw new IOException("Password must be at least 1 lowercase alphabetic character!");
		}
		String numbers = "(.*[0-9].*)";
		if(!password.matches(numbers)) {
			throw new IOException("Password must be at least 1 number!");
		}
		String specialChars = "(.*[~!@#$%^&*()-_[]{}|;:,.<>/?].*$)";
		if(!password.matches(specialChars)) {
			throw new IOException("Password must be at least 1 special character!");
		}
		return false;
	}
}
