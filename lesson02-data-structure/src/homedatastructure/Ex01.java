package homedatastructure;

public class Ex01 {
	public static void main(String[] args) {
		// 1. Kiểm tra kí tự nhập vào có phải số hay không?
		// 2. Kiểm tra chuỗi nhập vào có phải số hay không?
		// TH1: tỰ cODE RA
		// TH2: dùng hàm có sẵn
		char letter = 'a';
		System.out.println(letter + "is digit ? " + isDigit(letter));
		System.out.println(letter + "is digit ? " + Character.isDigit(letter));

		System.out.println("/n==========================");
	}

	private static boolean isDigit(char input) {
		return (input >= '0' && input <= '9');
	}
}
