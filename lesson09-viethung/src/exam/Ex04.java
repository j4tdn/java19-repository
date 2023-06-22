package exam;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String username;
		String password;
		while(true) {
			System.out.println("Username: ");
			username = sc.nextLine();
			System.out.println("Password: ");
			password = sc.nextLine();
			if(validateDuplicate(username, password) &&
					validateLength(password) &&
					validateSpecialCharacters(password)) {
				System.out.println("Sign up success !!!");
				return;
			}
			System.out.println("Please re-check password's requirements and input again.");
		}
	}

	public static boolean validateDuplicate(String username, String password) {
		boolean[] visited = new boolean[255];
		int count = 0;
		int i, j;
		for (i = 0; i < username.length(); i++) {
			for (j = 0; j < password.length(); j++) {
				if(!visited[password.charAt(j)] && password.charAt(j) == username.charAt(i)) count++;
			}
			visited[username.charAt(i)] = true;
		}
		if(count > 3) return false;
		return true;
	}

	public static boolean validateSpecialCharacters(String password) {
		int count = 0;
		for (int i = 0; i < password.length(); i++) {
			if (password.matches(".*[-!.#$@_+,?].*")) {
				count++;
			}
		}
		if (count >= 1)
			return true;
		return false;
	}

	public static boolean validateLength(String password) {
		int count = 0;
		for (int i = 0; i < password.length(); i++) {
			if (password.matches(".+")) {
				count++;
			}
		}
		if (count >= 8)
			return true;
		return false;
	}
}
