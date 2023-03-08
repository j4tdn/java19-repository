package controlling;

public class Ex01SwitchCase {
	public static void main(String[] args) {
		int errorNumber = 500;
		switch (errorNumber) {
		case 500:
			System.out.println("internal error");
			break;
		case 400:
			System.out.println("not found");
			break;
		default: 
			System.out.println("unknown");
			
		}
	}

}
