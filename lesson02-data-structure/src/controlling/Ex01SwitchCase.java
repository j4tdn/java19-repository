package controlling;

public class Ex01SwitchCase {
	public static void main(String[] args) {
		/*
		 * 500: internal error
		 * 400: bad request
		 * 404: not found
		 * # : unknown 
		 */
		int errorNumber = 500; // 400 500 404
		
		if(errorNumber == 500) {
			System.out.println("internal error");
		}
		else if(errorNumber == 400) {
			System.out.println("bad request");
		}
		else if(errorNumber == 404) {
			System.out.println("not found");
		}
		else  {
			System.out.println("unknown ");
		}
		
		System.out.println("\n==============\n");
		
		
		// trong swicth case mà gặp break--> thoát khỏi swicth case
		switch(errorNumber ) {
		case 500:
			System.out.println("internal error");
			break;
		case 400:
			System.out.println("bad request");
			break;
		case 404:
			System.out.println("not fourd");
			break;
		default:
			System.out.println("unknow");
			
		
		}
		System.out.println("-----> EXIT");
		
	}
	

}
