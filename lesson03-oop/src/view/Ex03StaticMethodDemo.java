package view;

public class Ex03StaticMethodDemo {
	public static void main(String[] args) {
		// muốn gọi hàm non-static ---> tạo ra đối tượng rồi gọi nó
		Ex03StaticMethodDemo e1 = new Ex03StaticMethodDemo();
		System.out.println("Sum 1--->"+e1.sum(14, 12));
		
	}
	
	// access modifier [static] return_type method_name(variable) {}
	// viết hàm tính tổng 2 số a và b dùng ở mọi nơi
    // để gọi bên ngoài phụ thuộc vào access modifier
	// [non] static đều gọi được, cách gọi kahcs nhau
	// non ----> object
	public int sum(int a,int b) {
		return a + b;
	}
	
}
