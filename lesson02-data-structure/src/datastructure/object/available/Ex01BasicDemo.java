package datastructure.object.available;

public class Ex01BasicDemo {
public static void main(String[] args) {
	int x = 10;
	// Lưu trữ ở vùng nhớ HEAP
	System.out.println("x " + x);
	Integer iA = new Integer(22);
	Integer iB = new Integer(44);
	Integer iC = new Integer(44);
	Integer iD = new Integer(44);
	System.out.println("itA: " + hash(iA));
	System.out.println("itB: " + hash(iB));
	System.out.println("itC: " + hash(iC));
	System.out.println("itD: " + hash(iD));
	// Lưu trữ ở vùng nhớ HEAP -> constant pool 
	Integer oA = 66;
	Integer oB = 88;
	Integer oC = 88;
	Integer oD = 88;
	oC = 12345;
	// Một lần khai báo, khởi tạo, gán giá trị mới
	// Kiểm tra trong vùng nhớ constant pool đã có giá trị mới đó chưa 
	// + nếu chưa -> tạo mới
	// + có rồi -> không tạo mới mà trỏ đến ô nhớ đã có giá trị đó
	
	System.out.println("oA: " + hash(oA));
	System.out.println("oB: " + hash(oB));
	System.out.println("oC: " + hash(oC));
	System.out.println("oD: " + hash(oD));
	
	
}
private static int hash(Integer parameter) {
	return System.identityHashCode(parameter);
}
}
