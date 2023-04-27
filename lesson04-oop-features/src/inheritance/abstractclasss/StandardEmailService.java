package inheritance.abstractclasss;

public class StandardEmailService extends EmailService {

	@Override
	void login() {
		System.out.println("StandardEmailService --> login");		
	}
	
	@Override
	void loginWith2Steps() {
		System.out.println("StandardEmailService --> loginWith2Steps");
	}
	

}
