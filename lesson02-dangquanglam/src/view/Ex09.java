package view;

public class Ex09 {
	public static void main(String[] args) {
		int count = 0;   // Biến đếm số lượng số nguyên tố đã tìm
	    int num = 2;     // Bắt đầu kiểm tra từ số 2
	    while (count < 200) {
	        if (isPrime(num)) {
	            count++;  // Nếu số nguyên tố được tìm thấy, tăng biến đếm lên một
	            if (count == 200) {
	                System.out.println("Số nguyên tố thứ 200 là: " + num);
	                break;
	            }
	        }
	        num++;   // Kiểm tra số nguyên tố tiếp theo
	    }
	}

	public static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
