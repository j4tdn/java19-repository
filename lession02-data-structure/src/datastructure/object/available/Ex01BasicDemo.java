package datastructure.object.available;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		//demo integer
		
		int x = 10;
		
		Integer iA = new Integer(x);
		
		System.out.println(iA);
		
		
		Integer oA  = 66;
		Integer oB = 88;
		Integer oC = 88;
		
		// 1 lần khái báo, khởi tạo, gán gia strij mới
		// Kiểm tra trong vùng nhớ constant pool đã có giá trị mới đó chưa
		// Nếu chưa, tạo mới
		// Có rồi ->> không tạo mới mà trỏ để ô nhớ đã có giá trị đó
		
		//Tiết kiệm vùng nhớ hơn
		
		System.out.println("oA : "+ hash(oA));
		System.out.println("oB : "+ hash(oB));
		System.out.println("oC : "+ hash(oC));
	}
	
	static int hash(Integer x) {
		return System.identityHashCode(x);
	}
	
	
}
