package bai3;

public class EmailValidation {
	public static void validate(String email) throws EmailException {

		 if(!(email.split("@").length - 1 == 1)) {
			 throw new EmailException("Email at most 1 @ character");
		 }
		 
		 else {
			 String emailPrefix = email.split("@")[0];
			 String emailDomain = email.split("@")[1];
			 String errorMessage = "";
			 boolean valid = true;
			 if (!emailDomain.equals("mail.com")){
				 errorMessage += "Invalid domain\n";
				 valid = false;
			 }
			 if(!emailPrefix.matches("[a-zA-Z0-9_.-]+")) {
				 errorMessage += "Prefix only contains letters (a-z), numbers, underscores, periods, and dashes.\n";
				 valid = false;
			 }
			 if(!emailPrefix.matches("[a-zA-Z0-9].*")) {
				 errorMessage += "Prefix must init by letters (a-z), numbers.\n";
				 valid = false;
			 }
			 
			 String lastCharOfPrefix = Character.toString(emailPrefix.charAt(emailPrefix.length()-1));
			 
			 if(emailPrefix.matches(".*[-._][-._].*") || lastCharOfPrefix.matches(".*[-._].*")  ) {
				 errorMessage += "Prefix must have underscore, period, or dash be followed by one or more letter or number\n";
				 valid = false;
			 }
			 if(!valid) {
				 throw new EmailException(errorMessage);
			 }
		 }
		
		
		
		
		
		
	}
}
