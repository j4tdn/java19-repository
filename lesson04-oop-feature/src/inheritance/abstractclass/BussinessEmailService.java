package inheritance.abstractclass;

public class BussinessEmailService extends EmailService {

	@Override
	void login() {
		System.out.println("BussinessEmailService --> login");
	}
	
	@Override
	void loginWith2Steps() {
		System.out.println("BussinessEmailService --> loginWith2Steps");
	}
}
