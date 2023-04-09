import java.util.Scanner;
public class Exercise1 {
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	int n = 0;
	String text;
for(int i = 1; i <= 5; i++){ 
	System.out.println("Nhập số nguyên n(hợp lệ): ");
	text = ip.nextLine();
	if(isValidNumber(text) == true) {
		n = Integer.parseInt(text);	
	}
	if(i == 5) {
		System.out.println("Đã nhập sai quá 5 lần!");
		System.exit(0);
	}
if(isValidNumber(text) == true && positivedigits(n) == true ) {
	break;
	}
}

	System.out.println("Nhập thành công n = " + n);
	System.out.println(isMultiple(n) ? "N là bội của 2" : "N không phải là bội của 2");
}
private static boolean isMultiple (int n) {
		if (n % 2 == 0) { 
		return true;
}else {
		return false;
}
		}
private static boolean isValidNumber(String input) {
	int textLength = input.length();
if (textLength == 0) {
	return false;
}

	for (int i = 0; i < textLength; i++) {
		char letter = input.charAt(i); 
		if (!Character.isDigit(letter)) 
			return false;
		}
	return true;
	
}
private static boolean positivedigits(int n) {
	
	if(n <= 0) {
return false;
	}else {
	return true;
	}
}
}







