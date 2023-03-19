package datastructure.object.available;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		// demo integer
		int x = 10;
		System.out.println("x: " + x);
		
		// Giá trị lưu trữ ở vùng nhớ HEAP
		Integer iA = new Integer(22); // H6
		Integer iB = new Integer(44); // H7
		Integer iC = new Integer(44); // H8
		Integer iD = new Integer(44); // H8
		// 1 lần new ra --> luôn tạo mới o nhớ
		
		System.out.println("itA: " + hash(iA));
		System.out.println("itB: " + hash(iB));
		System.out.println("itC: " + hash(iC));
		System.out.println("itD: " + hash(iD));
		
		// Giá trị lưu trữ ở vùng nhớ HEAP --> constant pool
		Integer oA = 66; // H9(66) --> oA.value = 66
		Integer oB = 88; // H10(88)
		Integer oC = 88; // H10
		Integer oD = 88; // H10
		oC = 12345; // H11 --> giá trị của oB, oC, oD
		// 1 lần khai báo, khởi tạo, gán giá trị mới
		// Kiểm tra trong vùng nhớ constant pool đã có giá trị
		// mới đó chưa
		// + nếu chưa --> tạo mới
		// + có rồi --> không tạo mới mà trỏ để ô nhớ đã có giá trị đó
		
		// Tiết kiệm vùng nhớ hơn 
		
		System.out.println("oA: " + hash(oA));
		System.out.println("oB: " + hash(oB));
		System.out.println("oC: " + hash(oC));
		System.out.println("oD: " + hash(oD));
		
		// block code {}
		
		System.out.println("-------------------");
		int N = 10000000;
		// System.currentTimeMillis(); 
		// --> số millis tính từ unix-time epoch time(gốc thời gian) 1.1.1970
		long start = System.currentTimeMillis();
		for (int i = 1; i <= N; i++) {
			Integer i1 = new Integer(99);
			Integer i2 = new Integer(99);
		}
		System.out.println("duration x --> " + (System.currentTimeMillis() - start) + "ms");
		
		start = System.currentTimeMillis();
		for (int i = 1; i <= N; i++) {
			Integer i1 = 99;
			Integer i2 = 99;
		}
		System.out.println("duration y --> " + (System.currentTimeMillis() - start) + "ms");
		
	}
	
	private static int hash(Integer parameter) {
		return System.identityHashCode(parameter);
	}
}
