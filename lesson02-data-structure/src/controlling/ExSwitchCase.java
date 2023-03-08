package controlling;

public class ExSwitchCase {

	public static void main(String[] args) {
		/*
		 * 500: internal error
		 * 400: bad request
		 * 404: not found
		 * #:	unknown
		 */
		
		int errorNumber = 404;
		
		switch (errorNumber) {
		case 500:
			System.out.println("internal error");
			break; //thoát khỏi switch-case
		case 400:
			System.out.println("bad request");
			break; //thoát khỏi switch-case
		case 404:
			System.out.println("not found");
			break; //thoát khỏi switch-case
		default:
			System.out.println("unknown");
			// break; //ko cần break trong default
		}
	
		System.out.println("- End - ");
/*
 * switch case --> if else ==
 * có break: thoát khỏi switch-case khi gặp switch
 * ko có break: chỉ cần gặp điều kiện đúng 1 lần thì sẽ tự động thực hiện các case còn lại phía dưới
 * 
 */
		
	}

}
