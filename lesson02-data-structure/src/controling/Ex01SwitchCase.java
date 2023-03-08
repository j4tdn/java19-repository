package controling;

public class Ex01SwitchCase {
	public static void main(String[] args) {
		/*
		 	500: internal error
		 	400: bad request
		 	404: not found
		 	#  : unknown
		 */
		int errorNumber = 400;
		
		switch (errorNumber) {
		case 500: {
			System.out.println("internal error");
			break;
		}
		case 400: {
			System.out.println("bad request");
			break;
		}
		case 404: {
			System.out.println("not found");
			break;
		}
		default:
			System.out.println("unknown");
		}
		
		
	}
}
