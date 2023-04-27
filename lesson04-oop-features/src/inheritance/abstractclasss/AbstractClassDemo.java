package inheritance.abstractclasss;

public class AbstractClassDemo {
	public static void main(String[] args) {
		BusinessEmailService bUser = new BusinessEmailService();
		bUser.login();
		bUser.loginWith2Steps();
		
		System.out.println("------------------");
		
		StandardEmailService sUser = new StandardEmailService();
		sUser.login();
		sUser.loginWith2Steps();
		
	}
}
