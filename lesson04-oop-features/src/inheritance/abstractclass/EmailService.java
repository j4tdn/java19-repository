package inheritance.abstractclass;

public abstract class EmailService {
	abstract void login();
	void loginwith2step() {
		System.out.println("EmailService --> loginWith2Step");
	}
}