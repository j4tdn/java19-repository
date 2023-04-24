package inheritance.abstractclass;

public abstract class EmailService {
	
	//require to override in sub-types
	abstract void login();
	
	//optional to override in sub-types
	void loginWith2Steps() {
		System.out.println("EmailService --> LoginWith2Steps");
	}
}
