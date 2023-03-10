package homework;

public class Ex03 {
     public static void main(String[] args) {
		/*/
 Bài 3: Viết chương trình tìm giai thừa của một số nguyên dương N
Biết rằng: N có thể được nhập từ bàn phím hoặc khai báo sẵn
Ví dụ: Nhập N = 1  1! = 1
Nhập N = 5  5! = 5.4.3.2.1 = 120
—--n! = n*(n-1)!
khai báo sẵn int = …
private int factorial (N)
return N*(N-1)!;
print….

		 */
    	 
    	 int N = 5;
    	 
    	 System.out.println("Giai thua cua N la: " + factorial(N));
	}
     private static int factorial(int N) {
    	 if(N <= 1) {
    		 return 1;
    	 }
    	 else {
    		 return N*factorial(N-1);
    	 }
    		 
     }
}
