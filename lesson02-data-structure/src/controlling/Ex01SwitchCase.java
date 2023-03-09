package controlling;

public class Ex01SwitchCase {
	public static void main(String[] args) {
		int errorNumber = 400;
		switch (errorNumber) {
		case 400:
			System.out.println("bad request");
			break;
		case 404:
			System.out.println("not found");
			break;
		case 500:
			System.out.println("internal error");
			break;

		default:
			System.out.println("unknow");
			break;
		}
	}
}
