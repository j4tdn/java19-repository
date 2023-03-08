package controlling;

public class Ex01SwitchCase {
	public static void main(String[] args) {
		/*
		 * Ex02: API number errors
			 500: internal error
			 400: bad request
			 404: not found
			 # : unknown
		 */
		int errorNumber  = 400;
		
		if (errorNumber == 500) {
			System.out.println("internal error");
		} else if(errorNumber == 400) {
			System.out.println("bad request");
		} else if(errorNumber == 404) {
			System.out.println("not found");
		}else {
			System.out.println("unknown");
		}
		
		System.out.println("\n===========================\n");
		//Switch Case demo
		//nếu không có break thì chỉ cần đúng 1 đk 
		//sẽ thực hiện các lệnh phía sau
		
		switch (errorNumber) {
		case 500:
			System.out.println("internal error");
			break;
			
		case 400:
			System.out.println("bad request");
			//break;
			
		case 404:
			System.out.println("not found");
			//break;

		default:
			System.out.println("unknown");
		}
		
		System.out.println("------------> Exit............");
	}
}
