package homework;

public class Ex8 {

	public static void main(String[] args) {
		System.out.println("Bài 8: Viết chương trình(hàm) kiểm tra số nguyên N có phải là số nguyên tố hay không\r\n"
				+ "Biết rằng N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N không hợp lệ\r\n"
				+ "(tối đa 5 lần) hoặc khai báo biến có sẵn giá trị hợp lệ\r\n"
				+ "VD: Nhập N = abc  báo lỗi, yêu cầu nhập lại\r\n"
				+ "\r\n"
				+ "= 4  false\r\n"
				+ "= 7  true");
		
		int N = Ex1.inputPositiveNumber();
		if (isPrimeNumber(N)==true) {
			System.out.println(N + " là số nguyên tố.");
		} else {
			System.out.println(N + " không là số nguyên tố.");
		}
	}
	public static boolean isPrimeNumber(int input) {
		for (int i = 2; i < Math.sqrt(input); i++) {
			if (input % i == 0) {
				return false;
			}
		}
		return true;
	}
}
