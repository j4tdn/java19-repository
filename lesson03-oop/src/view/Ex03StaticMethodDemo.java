package view;

public class Ex03StaticMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// viết hàm tính a + b dùng ở mọi nơi

		// Để gọi bên ngoài phụ thuộc vào access modifier:
		// non/ static đều gọi được với cách gọi khác nhau:
		// static: class.
		// nonstatic: object .
		
		//muốn gọi hàm non-static --> tạo đối tượng từ class chứa hàm đó
		//Ex03StaticMethodDemo e1 = new Ex03StaticMethodDemo();
		//System.out.println("sum1 --> " + e1.sum(14, 21));
		//System.out.println("sum1 --> " + e1.sum(10, 20));
		// cách trên tạo ra nhiều đối tượng, tốn tài nguyên
		// Kết quả trả về ko phụ thuộc vào đối tượng đang gọi
		// --> dùng static
		
		//non-static:	khi hàm phụ thuộc đối tượng đang gọi
		//static:		khi hàm không phụ thuộc đối tượng đang gọi
		
		System.out.println("sum1 --> " + sum(14, 21));
		System.out.println("sum1 --> " + Ex03StaticMethodDemo.sum(10, 20));
	}
		
		public static int sum(int a, int b) {
			return a + b;
		}

}
