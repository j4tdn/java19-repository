package datastructure.obiect.available;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		//demo integer
		int x = 10;
		System.out.println("x: " + x);
		
		Integer iA = new Integer(22);//H6
		Integer iB = new Integer(44);//H7
		Integer iC = new Integer(44);//H8
		//1 lần new ra --> luôn tạo mới ô nhớ
		
		System.out.println("iA: " + iA);
		System.out.println("iB: " + iB);
		System.out.println("iC: " + iC);
		
		//Giá trị lưu trữ ở vùng nhớ HEAP--> constant pool
		
		//1 lần khai báo, khởi tạo, gán giá trị mới
		//kiểm tra trong vùng nhớ constant pool đã có giá trị mới đó chưa
		// + nếu chưa --> tạo mới
		// + nếu có rồi --> không tạo mới mà trỏ đến ô nhớ đã có giá trị đó 
		//tiết kiệm vùng nhớ hơn
		
	}

}
