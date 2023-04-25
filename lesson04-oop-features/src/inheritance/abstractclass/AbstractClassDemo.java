package inheritance.abstractclass;

public class AbstractClassDemo {
	public static void main(String[] args) {
		EmailService user = new EmailService() {
			
			@Override
			void login() {
				// TODO Auto-generated method stub
				System.out.println("User registered login service");
			}
		};
		user.login();
		user.loginWith2Step();
		
	}
}
