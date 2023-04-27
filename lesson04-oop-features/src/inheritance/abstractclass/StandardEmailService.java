package inheritance.abstractclass;

public class StandardEmailService extends EmailService {

	@Override
	void login() {
System.out.println("StandardEmailService -> login");		
	}
	
	@Override
	void loginwith2steps() {
		System.out.println("BusinessEmailService -> loginwith2steps");
	}

}
