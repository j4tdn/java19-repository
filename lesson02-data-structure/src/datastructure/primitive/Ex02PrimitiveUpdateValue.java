package datastructure.primitive;

public class Ex02PrimitiveUpdateValue {
	public static void main(String[] args) {
		int a = 7;
		int b = 5;
		int tmp = a; 
		a = 9; 
		a=b;
		b=tmp;
		// Cập nhật lại giá trị của biến
		// Sử dụng toán tử(operator) =
		//VT=VP -> Gán giá trị(ở vùng nhớ STACK) của biến ở VP cho biến ở VT
		System.out.println("Giá trị a: " + a);
		System.out.println("Giá trị b: " + b);
	}

}
