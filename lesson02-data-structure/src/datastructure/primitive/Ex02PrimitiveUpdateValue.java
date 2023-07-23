package datastructure.primitive;

public class Ex02PrimitiveUpdateValue {
	public static void main(String[] args) {
		// tất cả đang demo chung 1 phương thức
		//khai báo và khởi tạo giá trị
		int a = 7;
		int b = 5;
		
		//Cập nhật lại giá trị của biến
		// Sử dụng toán tự (operator) =
		// VT = VP --> Gán giá trị(vùg nhớ STACK) của
		//             biến ở VP cho biến ở VT
		a = 9; // a = 9 ; b = 5;
		
		// hoán vị giá trị của 2 biến
		int tmp = a; // tmp 9
		a = b ; //a = 5 , b = 5
		b = tmp ; // a = 5 , b =9
		
		
		
		// gọi và in ra
		System.out.println("Giá trị a : " + a);
		System.out.println("Giá trị b : " + b);
	}
	
}
