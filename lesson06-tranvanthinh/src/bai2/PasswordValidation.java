package bai2;

public class PasswordValidation {
	
	public static void validate(String password) throws PasswordException{
		boolean valid = true;
		String errorMessage = "Password must contain\n";
		if (password.length() < 8) {
			errorMessage += "At least 8 characters\n";
			valid = false;
		}
		if (password.length() > 256) {
			errorMessage += "At most 256 characters\n";
			valid = false;
		}
		if(!password.matches(".*[a-z].*")) {
			errorMessage += "At least 1 lowercase alphabetic character (a, b, c...)\n";
			valid = false;
		}
		if(!password.matches(".*[A-Z].*")) {
			errorMessage += "At least 1 uppercase alphabetic character (A, B, C...)\n";
			valid = false;
		}
		if(!password.matches(".*[0-9].*")) {
			errorMessage += "At least 1 number (1, 2, 3...)\n";
			valid = false;
		}
		if(!password.matches(".*[~!@#$%^&*()\\-_=+\\[\\]{}|;:,.<>/\\?].*")) {
			errorMessage += "At least 1 special character character (~!@#$%^&*()-_=+[]{}|;:,.<>/?)\n";
			valid = false;
		}
		if(!valid) {
			throw new PasswordException(errorMessage);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
