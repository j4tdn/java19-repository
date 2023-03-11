package view;

public class Ex09 {
	public static void main(String[] args) {
		int n = 1000000; // giới hạn để tìm các số nguyên tố
        boolean[] isPrime = new boolean[n + 1]; // tạo một mảng để lưu trữ các số nguyên tố
        int count = 0; // biến đếm số lượng các số nguyên tố đã tìm thấy

        // ban đầu, giả định rằng tất cả các số đều là số nguyên tố
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // sàng các số nguyên tố bằng cách đánh dấu các bội số của từng số nguyên tố
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // tìm số nguyên tố thứ 200
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                count++;
                if (count == 200) {
                    System.out.println("Số nguyên tố thứ 200 là: " + i);
                    break;
                }
            }
        }
    }
}
