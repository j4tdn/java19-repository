package exception.custom;

public class ValidatePassword {
	public ValidatePassword() {
    }
    public boolean validatePassword(String nameUser, String pass) throws ThrowsException{
        if(pass.length() <8){
            throw new ThrowsException("Please enter password length >=8 !");
        }
        else if(!pass.matches("^(?=.*\\d)(?=.*[A-Z])(?=.*[~!@#$%^&*]).*$")){
            throw new ThrowsException("Password must contain at least 1 digit, 1 uppercase character, and one special character (~!@#$%^&*) !");
        }
        else if(!checkDuplicate(nameUser, pass)){
            throw new ThrowsException("Must not match more than 3 characters with the account name [Register at the start of the program] !");
        }
        return true;
    }
    private boolean checkDuplicate(String nameUser, String pass){
        int count =0;
        for(char c : pass.toLowerCase().toCharArray()){
            if(nameUser.toLowerCase().contains(c+"")){
                count++;
            }
        }
        if(count > 3) return false;
        else return true;
    }
}
