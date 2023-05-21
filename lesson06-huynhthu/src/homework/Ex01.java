package homework;

import java.util.Scanner;

public class Ex01 {
/*
  Bài 1: Giải phương trình bậc nhất ax + b = 0 . Các hệ số nhập vào từ bàn phím. Sử dụng try -
catch để bẫy các lỗi khi nhập sai kiểu dữ liệu, ví dụ nhập số nhưng nhập chữ. Bẫy lỗi chia 0,
trường hợp xảy ra lỗi phải thông báo cho người dùng biết và nhập lại đến khi a b hợp lệ thì in ra
kết qua x = -b/a
21:20 -- 21:54
 */
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("ax + b = 0");
		try {
					int result = inputAndDivide();
					System.out.println("result: x = " + result);
				} catch (NumberFormatException | ArithmeticException e) {
					System.out.println("exception --> " + e.getMessage());
				}
				
				System.out.println("*** ___ finished ___ ***");

				ip.close();



		}
		private static int inputAndDivide() {
				int a = input("Enter a");
				int b = input("Enter b");
		 System.out.println("Equation you have already input is : " + a + "x + " + b + " = 0.");
				return divide(a, b);
			}

			private static int input(String prefix) {
				System.out.print(prefix + ": ");
				return Integer.parseInt(ip.nextLine());
			}

			private static int divide(int a, int b) {
				if (a == 0) {
					throw new ArithmeticException("a should not be zero !!!");
				}
				return -b / a;
			}
      
	}
