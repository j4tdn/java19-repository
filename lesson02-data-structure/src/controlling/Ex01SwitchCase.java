package controlling;

public class Ex01SwitchCase {
	public static void main(String[] args) {
		int errorNumber = 400;

		if (errorNumber == 500) {
			System.out.println("internal error");
		} else if (errorNumber == 400) {
			System.out.println("bad request");
		} else if (errorNumber == 404) {
			System.out.println("not found");
		} else {
			System.out.println("unknown");
		}
		
		System.out.println("\n=======================");

		switch (errorNumber) {
		case 500:
			System.out.println("internal error");
			break;
		case 400:
			System.out.println("bad request");
			break;
		case 404:
			System.out.println("not found");
			break;
		default:
			System.out.println("unknown");
			break;
		}
		
		System.out.println("---> Exit...");
	}
}
