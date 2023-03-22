package view;

public class Ex03StaticMethodDemo {
	public static void main(String[] args) {
		Ex03StaticMethodDemo e1 = new Ex03StaticMethodDemo();
		
//		System.out.println("sum1: " + e1.sum(14, 12) );
//		System.out.println("sum2: " + e1.sum(10, 22) );
		
		Ex03StaticMethodDemo.sum(14, 22);
		//chung class --> 
		sum(14, 22);
		
		System.out.println("sum1: " + sum(14, 12) );
		System.out.println("sum2: " + sum(10, 22) );
		
		//sum chi phu thuoc vao tham so truyen vao
		// tao ra 100 object chi de goi sum --> ton memory
		//--> static de tiet kiem memory
		
	}
	
	//[access] [static] return_type method_name(var_type var_name)
	//sum function use every where
	public static int sum(int a, int b) {
		return a + b;
	}
}

