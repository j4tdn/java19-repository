package datastructure.primitive;

public class Ex02PrimitiveUpdateValue {

	public static void main(String[] args) {
		// khai báo
		int a = 7;
		int b = 5;
		// cập nhật giá trị của biến
		// sử dụng toán tử (operator) =
		//VT=VP ----> gán giá trị(ở vùng nhớ STACK) của biến ở VP cho biến ở VT
		a=9;
		//hoán vị 2 giá trị của biến
		int temp =a;
		a=b;
		b=temp;
		// gọi và in ra
		System.out.println("Giá trị a:"+a);
		System.out.println("Giá trị b:"+b);

	}

}
