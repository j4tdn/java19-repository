package inheritance.abstractclass;

public abstract class EmailService {
    
	//require  sub-types: kdl con
	abstract void login();
	
	void loginWith2Steps() {
		System.out.println("EmailService --> loginWith2Steps");
	}
}
