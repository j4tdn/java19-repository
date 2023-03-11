package datastructure.primitive;

public class Ex02PrimitiveDemo {
	public static void main(String[] args) {
		//Tất cả đang demo theo chung 1 phương thức
		
		//khai báo và khởi tạo giá trị
		
		int a = 7;
		int b = 5;
		
		//Cập nhập lại giúp giá trị của biến
		//Sử dụng toán tử(operator)
		// VT = VP --> Gán giá trị(ở vùng nhớ STACK) ở VP cho biến ở VT
		a = 9; //a = 9, b = 5;
		
		// hoán vị giá trị của 2 biến
		int tmp = a; // tmp = 9
		a = b; // a = 5, b = 5
		b = tmp; // a = 5, b = 9
		
		System.out.println("Giá trị a: " + a);
		System.out.println("Giá trị b: " + b);
	}

}
