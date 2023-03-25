package datastructure.primitive;

public class Ex02PrimitiveUpdateValue {
   public static void main(String[] args) {
	   //Tất cả đang đề mô chung 1 phương thức
	   // khai báo
	   int a = 7;
	   int b = 5;
	   
	   // Cập nhật lại giá trị của biến 
	   // Sử dụng toán tử(operator) = 
	   // VT = VP --> Giá giá trị (ở vùng nhớ STACK) của biến ở vp cho biến ở vt
	   a = 9;//a = 9 , b=5
	   
	   //hoán vị giá tị của 2 biến
	   int tmp = a; // tmp=9
	   a = b;//a = 5, b = 5
	   b = tmp;// a = 5 , b =9
	    
	   //Gọi và in ra
	   System.out.println("giá trị a: " +a);
	   System.out.println("giá trị b: " +b);
}
}
