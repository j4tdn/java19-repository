package inheritance.abstractclass;

public class BusinessEmailService extends EmailService {
	@Override
	void login() {
		// TODO Auto-generated method stub
		System.out.println("BusinessEmailService --> login");
	}

	@Override
	void loginWith2Step() {
		// TODO Auto-generated method stub
		System.out.println("BusinessEmailService --> loginWith2Step");
	}
	
	
}
