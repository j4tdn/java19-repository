package datastructure.object.available;

public class Ex01BasicDemo {
    public static void main(String[] args) {
    	//Demo
    	int x = 10;
    	System.out.println("x: " +x);
    	
    	// Giá trị lưu trong vùng nhớ HEAP
    	Integer iA = new Integer(22);//H66
    	Integer iB = new Integer(44);//H44
    	Integer iC = new Integer(44);//H44
    	Integer iD = new Integer(44);//H44
    	// 1 lần new -->luôn tạo mới ô nhớ
    	
    	
    	System.out.println("itA: " + hash(iA));
    	System.out.println("itB: " + hash(iB));
    	System.out.println("itC: " + hash(iC));
    	System.out.println("itD: " + hash(iD));
    	
    	// Giá trị lưu trong vùng nhớ HEAP--> constant pool
    	Integer oA = 66;//H9(66) --> oA.value=66;
    	Integer oB = 88;
    	Integer oC = 88;
    	Integer oD = 88;
    	oC = 12345;
    	//1 lần khai báo, khởi tạo, gán giá trị mới.
    	// kiểm tra trong vùng nhớ constant pool đã có giá trị
    	// mới đó chưa
    	// nếu chưa --> tạo mới
    	// có ròi --> không tạo mới mà trỏ đến ô nhớ có giá trị đó
    	// tiết kiệm vùng nhớ hơn
    	
    	System.out.println("oA : " + hash(oA));
    	System.out.println("oB : " + hash (oB));
    	System.out.println("oC : " + hash(oC));
    	System.out.println("oD : " + hash(oD));
	
}
    private static int hash(Integer parameter) {
    	return System.identityHashCode(parameter);
    }
}
