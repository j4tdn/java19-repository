package inheritance.abstractclass;

public class BusinessEmailService  extends EmailService{

	@Override
	void login() {
		System.out.println("BusinessEmailService--> Login");
		
	}
	void loginWith2Steps() {
		System.out.println("BusinessEmailService---> Login");
	}
}
