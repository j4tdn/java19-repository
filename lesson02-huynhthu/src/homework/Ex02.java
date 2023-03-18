package homework;

import java.util.Scanner;

public class Ex02 {
      public static void main(String[] args) {
		/*/
 Bài 2: Viết chương trình(hàm) kiểm tra số nguyên N có phải là lũy thừa của 2 hay không
Biết rằng N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N không hợp lệ
(tối đa 5 lần) hoặc khai báo biến có sẵn giá trị hợp lệ
VD: Nhập N = abc  báo lỗi, yêu cầu nhập lại

= 4  true
= 6  false
= 8  true
= 9  false
—------------------------------------
lũy thừa của 2: n^2 ⇒ if là lũy thừa của 2 thì in ra “ N là lũy thừa của 2” nếu ko nhập lại…
nhập từ bàn phím : scanner
nhập lại tối đa 5 lần: dùng vòng lặp (khai báo biến có sẵn giá trị hợp lệ)

		 */
		 //lũy thừa của 2 ⇒ n%2 && n = 1 (sau khi chia hết)

    	  Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			String str = scanner.nextLine();
			// System.out.println(str);
			if (isNumber(str)) {
				int num = Integer.parseInt(str);
				if (isPowerOfTwo(num)) {
					System.out.println("true");
				} else {
					System.out.println("false");
				}
				break;
			}
			System.out.println("Please input a number! ");
		}
		
	}

	public static boolean isPowerOfTwo(int number) {
		if(number == 0 ){
                          return false;
               }while(number != 1){
                 if (number % 2 ==0){
                   return false;         
}        
      }
        return true;
	}

	public static boolean isNumber(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) < '0' || s.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}
}

