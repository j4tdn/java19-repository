package string.immutable;

import java.util.Arrays;

/*/
 * 
• Tính chiều dài của chuỗi s
• Nối chuỗi s1 vào chuỗi s
• Lấy một ký tự tại vị trí index(3) trong chuỗi s
• Duyệt từng ky tu, tu trong chuỗi
• Tìm vị trí – chỉ số xuất hiện đầu tiên, cuối cùng của kí tự “a” trong chuỗi s
 */
public class Ex03StringDemo01 {
  public static void main(String[] args) {
	String s = "hello world, my name is teo";
	String s1 = ", nice to see you all";
	
	System.out.println("1.lenght of s --> " + s.length());
	System.out.println( "2. concat " +(s.concat(s1)));
	System.out.println("3. s chartAt: " + s.charAt(3));
	loopChars(s + s1);
	loopWords(s + s1);
   }
  private static void loopChars(String s) {
	  System.out.print("4.loop chars -->");
	  for(int i = 0; i < s.length(); i++) {
		  System.out.print(s.charAt(i) + "-");
	  }
	  System.out.println();
  }
  private static void loopWords(String s) {
	  System.out.println("4.loop words -->");
	  // \\s --> cat theo khoang trang
	  //, --> cat theo dau phay
	  // \\s, --> cat theo cum khoang trang va '
	  //,\\s --> cat theo cum , va khoang trang
	  //[\\s,] --> cat theo to hop tat ca cac ket qua co the xuat hien trong []
	  //+ <=> {1,} --> cat theo 1 hoac nhiu ki tu --> lay truong hop tot nhat
	  //[\\s,]+
	  String[] tokens = s.split("[\\s,]+");
	  for(String token: tokens) {
		  System.out.println("|||" + token + "|||");
	  }
	  System.out.println("tokens --> " + Arrays.toString(tokens));
  }
}
