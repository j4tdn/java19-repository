package inheritance.abstractclasss;

public abstract class EmailService {
	
	//require to override in sub-types
	abstract void login();
	
	//optional  to overrride in sub-types
	void loginWith2Steps() {
		System.out.println("EmailService --> loginWith2Steps");
	}
}
