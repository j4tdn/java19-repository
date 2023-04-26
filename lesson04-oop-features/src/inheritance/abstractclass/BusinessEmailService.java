package inheritance.abstractclass;

public class BusinessEmailService extends EmailService{
   @Override
void login() {
System.out.println("BusinessEmailService ---> loginBusinessEmailService");	
}
@Override
	void loginWith2Steps() {
	System.out.println("BusinessEmailService ---> loginWith2StepsBusinessEmailService");
		super.loginWith2Steps();
	}
}
