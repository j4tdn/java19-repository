package homework;

public class Ex6 {
	public static void main(String[] args) {
		System.out.println("Bài 6: Viết chương trình tìm số nguyên lớn, nhỏ nhất trong 3 chữ số a,b,c\r\n"
				+ "Biết rằng a,b,c là số nguyên được nhập từ bàn phiasm và nhỏ hơn 20 [0, 20)\r\n"
				+ "VD: Nhập a = 6\r\n"
				+ "Nhập b = “xyz”  báo lỗi, yêu cầu nhập lại\r\n"
				+ "Nhập b = 12\r\n"
				+ "Nhập c = 8\r\n"
				+ "Số lớn nhất là 12\r\n"
				+ "Số nhỏ nhất là 6");
		Integer[] numbers = new Integer[3];
		for (int i = 0; i < 3; i++) {
			numbers[i] = Ex1.inputPositiveNumberRange(0, 20);
		}
		int max = numbers[0];
		int min = numbers[2];
		for (int i = 0; i < 3; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		System.out.println("max = " + max);
		System.out.println("min = " + min);
	}
}
