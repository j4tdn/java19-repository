package view;

public class Ex03StaticMethodDemo {
	public static void main(String[] args) {
		
		System.out.println("sum1 --> " + Ex03StaticMethodDemo.sum(10, 20));
		System.out.println("sum2 --> " + Ex03StaticMethodDemo.sum(15, 22));
		System.out.println("sum3 --> " + Ex03StaticMethodDemo.sum(15, 22));
		
		
		// sum --> e1, e2, e3 --> 3 vùng nhớ chứa 3 hàm sum riêng
		// Vấn đề
		// Hàm sum chỉ phụ thuộc vào tham số truyền vào
		// Nếu tạo ra 100 đối tượng, gọi hàm sum với cùng giá trị tham số truyền vào
		// --> để cho kết quả giống nhau --> tốn bộ nhớ
		
		// Khi hàm phụ thuộc đối tượng đang gọi  --> NON - STATIC 
		// Khi hàm không phụ thuộc đối tượng đang gọi --> STATIC
	}
	
	// [access modifier] [static] return_type method_name(variables) {}
	// Viết hàm tính tổng 2 số a và b dùng ở mọi nơi
	
	// Để gọi bên ngoài phụ thuộc vào access modifier
	// [non]static đều gọi được, cách gọi khác nhau
	// static --> class .
	// non    --> object .
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
}
