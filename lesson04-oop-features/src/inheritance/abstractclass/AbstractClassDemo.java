package inheritance.abstractclass;

public class AbstractClassDemo {
	public static void main(String[] args) {
		EmailService user = new EmailService() {
			
			@Override
			void login() {
				System.out.println("asfafasf");
				
			}
		};
	}
}
