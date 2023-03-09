package datastructure.primitive;

public class Ex02PrimitiveUpdateValue {

	public static void main(String[] args) {
		// Khai báo và khởi tạo giá trị
		int a = 7;
		int b = 5;
		// Cập nhập lại giá trị của biến
		// Sử dụng toán tử(operator)=
		// VT=VP --> Gán giá trị(ở vùng nhớ STACK) của biến ở VP cho biến ở VT
		a = b;
		// Hoán vị giá trị của 2 biến
		a = 9;
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("Giá trị a: " + a);
		System.out.println("Giá trị b: " + b);
	}

}
