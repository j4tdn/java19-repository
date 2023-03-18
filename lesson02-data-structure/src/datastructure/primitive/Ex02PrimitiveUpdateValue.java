package datastructure.primitive;

public class Ex02PrimitiveUpdateValue {
public static void main(String[] args) {
	int a = 7;
	int b = 5;
	// cập nhật lại giá trị của biến
	// sử dụng toán tử (operator) =
	a = 9;
	int tmp = a;
	a = b;
	b = tmp;
	System.out.println("giá trị của a: " + a);
	System.out.println("giá trị của b: " + b);
}
}
