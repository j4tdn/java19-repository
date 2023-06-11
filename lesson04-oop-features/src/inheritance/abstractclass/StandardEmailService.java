package inheritance.abstractclass;

public class StandardEmailService extends EmailService{

	@Override
	void login() {
		System.out.println("StandardEmailService --> login");
		
	}

}
