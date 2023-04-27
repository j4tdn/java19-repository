package ex03;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println("12abu02muzk586cyx ->" +invalidNumToMost("12abu02muzk586cyx"));
		System.out.println("Uyk892nn1234uxo2 ->" +invalidNumToMost("Uyk892nn1234uxo2"));
	}
	public static int invalidNumToMost(String input) {
	    String numberString = "";

	    for (int i = 0; i < input.length(); i++) {
	        char c = input.charAt(i);

	        if (Character.isDigit(c)) {
	            numberString += c;
	        } else {
	            if (numberString.length() > 0) {
	                break;
	            }
	        }
	    }

	    if (numberString.length() == 0) {
	        return -1;
	    }

	    return Integer.parseInt(numberString);
	}

}
