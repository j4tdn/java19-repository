package inheritance.abstractclass;

public abstract class EmailService {
	//required 
abstract void login();

// optional to override in sub-types
void loginwith2steps() {
	System.out.println("EmailServiec -> loginwith2steps");
}
}
