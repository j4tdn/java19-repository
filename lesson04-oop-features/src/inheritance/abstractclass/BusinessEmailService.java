package inheritance.abstractclass;

public class BusinessEmailService extends EmailService{
	@Override
	void login() {
		System.out.println("BusinessEmailService --> login");
	}
	@Override
	void loginwith2step() {
		System.out.println("BusinessEmailService --> loginWith2SSteps");
	}
}	
