package exam;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Input id");
		String id = sr.nextLine();
		String passWord = getPassword();
		int count = 0;
		char c;
		for(int i=0;i<id.length();i++) {
			for(int j=0;j<passWord.length();j++) {
				id.compareTo(passWord);
				count++;
			}
		}
		if(count>3) {
			System.out.println("Password không được trùng 3 ký tự với id");
		}else {
			System.out.println("Ok");
		}
		
	}
	public static String getPassword() {
		Scanner sr = new Scanner(System.in);
		String password ="";
		while(true) {
			System.out.println("Input password");
			password=sr.nextLine();
			Pattern pUpper = Pattern.compile("^.*[A-Z]+.*$");
			Pattern pLower = Pattern.compile("^.*[a-z]+.*$");
			Pattern pDigit = Pattern.compile("^.*[0-9]+.*$");
			Pattern pSpecial = Pattern.compile("^.*[#?!@$%^&*-]+.*$");
			Pattern pLength = Pattern.compile("^.{8,}$");
			
			if(pUpper.matcher(password).find()&& pLower.matcher(password).find()&& 
					pDigit.matcher(password).find() && pSpecial.matcher(password).find()
					&& pLength.matcher(password).find()) {
				break;
			}else {
				System.err.println("Password not good");
			}
		}
		return password;
	}
	public static boolean checkIdAndPass (String str1, String str2) {
		
		return str2;
		
	}
}
