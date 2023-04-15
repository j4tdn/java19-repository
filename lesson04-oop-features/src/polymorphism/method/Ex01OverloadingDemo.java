package polymorphism.method;

public class Ex01OverloadingDemo {
    public static void main(String[] args) {
		double total = sum(2d, 4d);
		System.out.println("total: " + total);
	}
    /*/
     * 2 hay nhiêuf hàm được gọi là overloading nếu
     * - thuộc cùng 1 class
     * - cùng tên
     * - khác
     *  + KDL truyền vào của tham 
     *  + Số lượng tham số truyền 
     */
    // Tinh tong cho n so thuc lon
    // truyen 1 hoac nhiu tham so kieu double
    // ... 'variables' --> nhan vao 1 mang double
    // hoac nhan vao 0 hoac nhiu gia tri double cach nhau boi dau ,
    private static double sum(double... numbers) {
    	double result = 0d;
    	for (double number: numbers) {
    		result += number;
    	}
    	return result;
    }
    
    
    // Tinh tong 2 so nguyen
    private static int sum(int a, int b) {
    	return a + b;
    }
 // Tinh tong 3 so nguyen
    private static int sum(int a, int b, int c) {
    	return a + b + c;
    }
    
    // Tinh tong 2 so thuc
    private static float sum(float a, float b) {
    	return a + b;
    }
}
