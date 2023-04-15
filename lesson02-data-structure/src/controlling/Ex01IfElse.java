package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex01IfElse {
      public static void main(String[] args) {
    	  //Cho (nhập từ bàn phím (scanner)|| tạo biến và gắn sẵn giá trị không càn nhập)
		 // cho  số nguyên dương N --> kiểm tra N chẵn hay lẻ
    	 // nếu như là số chẵn thì in ra
    	 // nếu là số lẻ thì ko làm gì cả
    	  Random rd = new Random();
    	  
    	  int n = rd.nextInt(12);
    	  System.out.println("Giá trị n --> " + n);
    	  boolean isEven = (n % 2 == 0 );
    	 
    	  if (isEven) {
    		  System.out.println("Bien n la so chan" );
    	  }

    	  //boolean isEven = (n % 2 == 0);
    	  // expression --> nhận vào 1 biến kiểu true|false
    	  // và cũng có thể nhận vào 1 biểu thức, hàm trả về true false
    	  
    	  // if (expression) -->  expression boolean
    	  // if (isEven == true) -->  if (isEven) --> if (expression)
    	  // if (isEven == true) -->  if (!isEven) --> if (!expression)
    	  // boolean isEven = (n % 2 == 0) va if (isEven)--> if (n % 2 == 0)
    	  // if (isEven)--> nhận biến
    	  // if (n % 2 == 0)--> nhận biểu thức
    	  // if (isEven(n))--> nhận hàm
	  
    			  
    	  // cho 1 chuỗi kí tự (mật khẩu)--> kiểm tra xem độ dài của mật khẩu đã thỏa mãn yêu cầu chưa
    	  // nếu độ dài mật khẩu >=8 --> mật khẩu hợp lệ
    	  // nếu độ dài <8 --> mật khẩu có ít nhất là 8 kí tự, vui lòng nhập lại
    	  String password = "cpky12";
    	  int length = password.length();
    	  System.out.println("Password length: " + length);
    	  if (length >= 8) {
    		  System.out.println("Mat khau hop le");
    	  } else {
    		  System.out.println("mật khẩu có ít nhất là 8 kí tự, vui lòng nhập lại");
    	  }
    	  System.out.println("\n===============\n");
    	  // cho đầu vào điểm trung bình của học sinh
    	  // nếu DTB < 5 --> học lực yếu
    	  // nếu DTB [5, 6.5) --> học lực trung bình
    	  // nếu DTB [6.5, 8.0) --> học lực khá
    	  // nếu DTB [8, 10] --> học lực giỏi
    	  
    	  
    	  //scale(1)
    	  //float avgPoint = rd.nextFloat() * 10;//[0.0, 10.0]
    	  BigDecimal avgPointBd = BigDecimal.valueOf(rd.nextFloat()).setScale(1, RoundingMode.HALF_UP);
    	  float avgPoint = avgPointBd.floatValue(); //chuyen doi gia tri tu bigdecimal ve float
    	  
    	  System.out.println("rounding point: " + avgPointBd);

    	  if (avgPoint >= 0 && avgPoint <5 ) {
    		  System.out.println("Hoc luc yeu");
    	  }else if (avgPoint >= 5 && avgPoint < 6.5 ) {
    		  System.out.println("Hoc luc trung binh");
    	  }else if (avgPoint >= 6.5 && avgPoint < 8.0 ) {
    		  System.out.println("Hoc luc kha");
    	  }else {
    		  System.out.println("Hoc luc gioi");
    	  }
    	  System.out.println("\n==========\n");
    	  // thay the if else... else ... if bang toan tu 3 ngoi
    	  // nên làm cho trường hợp đơn giản
    	  // (expression) ? statement_if_true : statement_if_false;
    	  String message = password.length() >= 8 ? "Mat khau hop le" : "mật khẩu có ít nhất là 8 kí tự, vui lòng nhập lại";
    	  System.out.println();
    	  
    	  
    	  
    	  
    	  System.out.println("ket thuc chuong trinh");	  

    	  //
    	  
    	  
    	  
    	  
	}
	  private static boolean isEven(int input){	  
         return input % 2 == 0;
	  }

}
