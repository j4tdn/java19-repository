package inheritance.abstractclass;

public abstract class EmailService {
	
	// require to override in sub-types
	abstract void login();
	
	// optional to override in sub-types
	void loginWith2Step() {
		System.out.println("EmailService --> loginWith2Step");
	}
}
