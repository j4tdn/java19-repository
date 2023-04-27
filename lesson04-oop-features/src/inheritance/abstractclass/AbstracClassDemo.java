package inheritance.abstractclass;

public class AbstracClassDemo {
	public static void main(String[] args) {
		EmailService user = new EmailService() {

			@Override
			void login() {
				System.out.println("User registered login service");
			}
		};
		user.login();
		user.loginWith2Steps();
	}

}
