package homework;

public class Ex9 {
	public static void main(String[] args) {
	System.out.println("Bài 9: Viết chương trình tìm số nguyên tố thứ 200 trong hệ thống số tự nhiên.\r\n"
			+ "Tham khảo công thức: https://bit.ly/3oZDzNm");
	int result = 2;
	int queue = 200;
	while (queue > 0) {
		if (Ex8.isPrimeNumber(result++)==true) {
			queue--;
		}
	}
	System.out.println(result-1);
	}
}
