package ex03;

import java.text.Normalizer;
import java.util.Scanner;

public class Ex03 {
//	Viết chương trình nhập vào chuỗi TIẾNG VIỆT có dấu bất kì sau đó xuất ra kết quả là chuỗi
//	không dấu.
//	Input: Em có yêu anh không anh để anh biết còn chờ
//	Em xin lỗi em đã có thái độ không đúng với anh
//	Output: Em co yeu anh khong de anh biet con cho
//	Em xin loi em da co thai do khong dung voi anh
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập chuỗi Tiếng Việt có dấu: ");
		String originalString = scanner.nextLine();

		// Loại bỏ dấu từ chuỗi đầu vào
		String normalizedString = Normalizer.normalize(originalString, Normalizer.Form.NFD).replaceAll("\\p{M}", "");

		System.out.println("Chuỗi đã định dạng: " + normalizedString);
	}
}
