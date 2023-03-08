package controlling;

public class Ex01SwitchCase {
	public static void main(String[] args) {
		int erorr = 500;
		switch (erorr) {
		case 500:
				System.out.println("Internal Erorr");
			break;
		case 400:
				System.out.println("Bad request");
			break;
		case 404:
				System.out.println("Not Found");
			break;
		case 403:
				System.out.println("For bidden");
			break;
		default:
			System.out.println("Ok");
		}
	}
}
