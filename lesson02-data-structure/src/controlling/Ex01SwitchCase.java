package controlling;

public class Ex01SwitchCase {
      public static void main(String[] args) {
    	int errorNumber = 400;
    	  
		switch(errorNumber) {
		case 500:
			System.out.println("internal error");
			break;// gap switch --> thoat khoi switch case
		case 400:
			System.out.println("bad request");
			break;
		case 404:
			System.out.println("not found");
			break;
		default:
			System.out.println("unknown");
		}
		System.out.println("----->Exit....");
	}
}
