package exception.custom;

public class MailValidator {
	public MailValidator() {
	}
	
	public boolean validateEmail(String mail) throws ThrowsException {
		if(!mail.contains("@"))
		{
			throw new ThrowsException("Please enter correct email format, ex : nguyenvana@mail.com");
		}
		String[] prefixesSuffixes = mail.split("@");
		if(!prefixesSuffixes[1].equals("mail.com"))
		{
			throw new ThrowsException("Prefixes after @ must mail.com");
		}
		else {
			if(prefixesSuffixes[0].charAt(0)<'a' || prefixesSuffixes[0].charAt(0) >'z' || checkSpecialCharacters(prefixesSuffixes[0])) {
				throw new ThrowsException("Start must begin is letters(a-z) and does not contain other characters [a-z, - , . , _ ]");
			}
			if(prefixesSuffixes[0].contains("-") || prefixesSuffixes[0].contains(".") || prefixesSuffixes[0].contains("_")) {
				String Prefixes= prefixesSuffixes[0];
				String testSpe = "-._";
				for(int i=0; i < Prefixes.length();i++) {
					if(testSpe.contains(String.valueOf(Prefixes.charAt(i)))) {
						if(testSpe.contains(String.valueOf(Prefixes.charAt(i+1)))){
							throw new ThrowsException("Special characters belonging to [-._] cannot be placed adjacent to each other");
						}
					}
				}
			}
		}
		return true;
	}
	
	private boolean checkSpecialCharacters(String prefixes) {
		String testSpe = "-._";
		for(int i=0; i<prefixes.length();i++) {
			if(prefixes.charAt(i)<'a' || prefixes.charAt(i) >'z' || testSpe.contains(String.valueOf(prefixes.charAt(i)))){
				return true;
			}
		}
		return false;
	}
	
	
}
