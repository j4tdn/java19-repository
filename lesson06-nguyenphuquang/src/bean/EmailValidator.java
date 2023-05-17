package bean;

public class EmailValidator {
	private static String acceptedCharacters = "_.-";
	private static String domainFormat = ".com";
	
	public static void validate(String prefix, String domain) throws WrongEmailException {
		boolean metSpecialCharacter = false;
//prefix validation
		if (acceptedCharacters.indexOf(prefix.charAt(0)) != -1) {
			throw new WrongEmailException("prefix: the first character must be number or letter");
		}
		if (acceptedCharacters.indexOf(prefix.charAt(prefix.length() - 1)) != -1) {
			throw new WrongEmailException("prefix: the last character must be number or letter");
		}

		for (int i = 0; i < prefix.length(); i++) {
			if ((prefix.charAt(i) < 'a' || prefix.charAt(i) > 'z') && (prefix.charAt(i) < 'A' || prefix.charAt(i) > 'Z')
					&& (prefix.charAt(i) < '0' || prefix.charAt(i) > '9')
					&& (acceptedCharacters.indexOf(prefix.charAt(i)) == -1)) {
				throw new WrongEmailException("prefix has illegal character(s)!");
			} else if (acceptedCharacters.indexOf(prefix.charAt(i)) != -1) {
				if (metSpecialCharacter) {
					throw new WrongEmailException("prefix: underscore, period, dash must be followed by letters or numbers");
				} else {
					metSpecialCharacter = true;
				}
			} else {
				metSpecialCharacter = false;
			}
		}
//domain validation
		if (acceptedCharacters.indexOf(domain.charAt(0)) != -1) {
			throw new WrongEmailException("domain: the first character must be number or letter");
		}
		
		if (acceptedCharacters.indexOf(domain.charAt(prefix.length() - 1)) != -1) {
			throw new WrongEmailException("domain: the last character must be number or letter");
		}
		
		for (int i = 0; i < domain.length(); i++) {
			if ((domain.charAt(i) < 'a' || domain.charAt(i) > 'z') && (domain.charAt(i) < 'A' || prefix.charAt(i) > 'Z')
					&& (domain.charAt(i) < '0' || domain.charAt(i) > '9')
					&& (acceptedCharacters.indexOf(domain.charAt(i)) == -1)) {
				throw new WrongEmailException("domain has illegal character(s)!");
			} else if (acceptedCharacters.indexOf(domain.charAt(i)) != -1) {
				if (metSpecialCharacter) {
					throw new WrongEmailException("domain: underscore, period, dash must be followed by letters or numbers");
				} else {
					metSpecialCharacter = true;
				}
			} else {
				metSpecialCharacter = false;
			}
		}
		
		
	}
}
