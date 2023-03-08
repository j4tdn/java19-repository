package datastructure.primitive;

public class Ex02PrimitiveUpdateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Khai báo và khởi tạo giá trị
		int a = 7;
		int b = 5;

		// Cập nhật lại giá trị của biến
		// Sử dụng toán tử (operator)=
		// VT = VP --> GÁN GIÁ TRỊ(Ở VÙNG NHỚ STACK) CỦA VP CHO VT

		a = 9;

		// HOÁN VỊ GIÁ TRI CỦA 2 BIẾN
		int tmp = a;
		a = b;
		b = tmp;
		
		// Gọi và in ra
		System.out.println("Giá trị a: " + a);
		System.out.println("Giá trị b: " + b);

	}

}
