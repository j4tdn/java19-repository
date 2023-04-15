package datastructure.primitive;

public class Ex02PrimitiveUpdateValue {
     public static void main(String[] args) {
    	 // tất cả đang dùng chung 1 phương thức
    	 
		//khai báo và khởi tạo giá trị
    	 int a = 7;
    	 int b = 5;
    	 
    	//Cập nhật lại giá trị của biến
    	// Sử dụng toán tử (operator) =
    	//VT = VP --> gán giá trị (ở vùng nhớ stack) của biến ở VP cho biến ở VT
    	 a = 9; //a = 9, b = 5
    	 
    	 //Hoán vị giá trị của 2 biến
    	 int temp = a; //tmp = 9
    	 a = b; // a = 5, b = 5
    	 b = temp; // a = 5, b = 9
    	 
    	 
    	//Gọi và in ra
    	 System.out.println("Giá trị a: " + a);
    	 System.out.println("Giá trị b: " + b);
	}
}
