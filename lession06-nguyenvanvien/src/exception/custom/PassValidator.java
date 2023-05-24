package exception.custom;

public class PassValidator {
	private String pass;
	public PassValidator(String pass) {
		this.pass = pass;
	}
	
	public boolean validateLen() throws ThrowsException {
		if(pass.length() < 8 || pass.length()> 257) {
			throw new ThrowsException("Pass value not least 8 characters and not most 256 characters !");
		}
		
		if(checkLowercase(pass) <1 && checkUpercase(pass) <1) {
			throw new ThrowsException("Pass value not least 1 lowercase and least upercase !");
		}
		
		if(checkNumberInPass(pass) <1) {
			throw new ThrowsException("Pass value not least 1 number !");
		}
		
		if(pass.length()- (checkLowercase(pass)+checkUpercase(pass)+ checkNumberInPass(pass)) < 1) {
			throw new ThrowsException("Pass value not least 1 spacial charactors !");
		}
		
		return true;
	}
	
	private int checkLowercase(String pass) {
		int count=0;
		for(char c : pass.toCharArray()) {
			if(c>= 'a' && c<='z') {
				count ++;
			}
		}
		return count;
	}
	
	private int checkUpercase(String pass) {
		int count=0;
		for(char c : pass.toCharArray()) {
			if(c>= 'A' && c<='Z') {
				count ++;
			}
		}
		return count;
	}
	
	private int checkNumberInPass(String pass) {
		int count=0;
		for(char c : pass.toCharArray()) {
			if(c>= '1' && c<='9') {
				count ++;
			}
		}
		return count;
	}
	
	public boolean validateContain(String nameOrEmail) throws ThrowsException {
		if(pass.contains(nameOrEmail)) {
			throw new ThrowsException("Pass must not contain NameUser Or Email Address");
		}
		
		return true;
	}
}
