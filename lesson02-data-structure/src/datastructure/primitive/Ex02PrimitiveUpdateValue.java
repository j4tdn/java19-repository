package datastructure.primitive;

public class Ex02PrimitiveUpdateValue {
	public static void main(String[] args) {
		// Tất cả đang demo chung 1 phương thức
		
		// Khai báo và khởi tạo giá trị
		int a = 7;
		int b = 5;
		
		// Cập nhật lại giúp trị của biến
		// Sử dụng toán tử(operator) =
		// VT = VP --> Gán giá trị(ở vùng nhớ STACK) của biến ở VP cho biến ở VT
		a = 9; // a = 9, b = 5
		
		// Hoán vị giá trị của 2 biến
		int tmp = a; // tmp = 9
		a = b; // a = 5, b = 5
		b = tmp; // a = 5, b = 9
		
		// G�?i và in ra
		System.out.println("Giá trị a: " + a);
		System.out.println("Giá trị b: " + b);
		
	}
}
