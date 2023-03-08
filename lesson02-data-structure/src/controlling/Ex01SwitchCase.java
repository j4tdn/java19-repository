package controlling;

public class Ex01SwitchCase {

	public static void main(String[] args) {
		// Đề:
		// 500: internal error
		// 400: bad request
		// #: unknown
		int errorNumber = 400;
		switch (errorNumber) {
		case 500:
			System.out.println("Internal Error!");
			break;
		case 404:
			System.out.println("Not Found!");
			break;
		case 400:
			System.out.println("Bad Request!");
			break;
		default:
			System.out.println("Unknown!");

		}

	}

}
