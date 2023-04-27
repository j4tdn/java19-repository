package inheritance.abstractclasss;

public class BusinessEmailService extends EmailService {

	@Override
	void login() {
		System.out.println("BusinessEmailService --> login");		
	}
	
	@Override
	void loginWith2Steps() {
		System.out.println("BusinessEmailService --> loginWith2Steps");
	}

}
