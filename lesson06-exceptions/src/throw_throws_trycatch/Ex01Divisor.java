package throw_throws_trycatch;

public class Ex01Divisor {
	public static void main(String[] args) {
			// System.out.println("4/2 -->" + (4/2));
			// System.out.println("6.0/0 -->" + (6.0 / 0));
			// System.out.println("6/0 -->" + (6 / 0));
			// System.out.println("5/2 -->" + (5/2));
			try {
				System.out.println("M, N -->" + divide(5, 0));

			} catch (ArithmeticException e) {
				System.out.println("AmE --> " + e.getMessage());
			}
			System.out.println("K, T -->" + divide(10, 2));
			// ở function --> ném ra ngoãi lệ
			//chỗ gọi function đó ko bắt buộc phải xử lí(try/catch) lỗi đó

		}

		// tương tự Integer.parseInt(text);
		private static int divide(int a, int b) {
			if (b == 0) {
				throw new ArithmeticException("b should not be zero");

			}
			return a / b;
			// int result = Integer.MAX_VALUE;

			// divide là hàm chức năng
			// gọi từ vị trí M, N, K
			// M, N cho truyền a, b thoải mái
			// K có nhập xuất số nguyên dương --> ko bao giờ có ngoại lệ

			// try-catch luôn thử và xử lí lỗi
			// --> throw ngoại lệ cho chỗ chưa bắt lỗi và xử lí tại đó
			// try {
			// return a/b;
			// } catch (ArithmeticException e) {
			// System.out.println("\nAmE --> " + e.getMessage());
			// return result;
			// }
			/*
			 * Exception in thread "main" java.lang.ArithmeticException: / by zero at
			 * throw_throws_trycatch.Ex01Divide.divide(Ex01Divide.java:18) at
			 * throw_throws_trycatch.Ex01Divide.main(Ex01Divide.java:14)
			 * 
			 * //--> validate: nhập b phải khác 0 --> try/catch: nếu lỗi thì quăng ra và
			 * tiếp tục -->
			 */
		}
	}
