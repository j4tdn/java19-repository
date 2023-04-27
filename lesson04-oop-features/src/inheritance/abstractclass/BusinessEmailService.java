package inheritance.abstractclass;

public class BusinessEmailService extends EmailService {
	
	@Override
	void login() {
		System.out.println("BusinessEmailService --> login");
		
		
	}
	
	@Override
	void loginWith2Step() {
		System.out.println("afasfaf");
	}
}
