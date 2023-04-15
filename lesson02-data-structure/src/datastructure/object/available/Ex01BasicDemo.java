package datastructure.object.available;

public class Ex01BasicDemo {
     public static void main(String[] args) {
		// demo integer
    	 int x = 10;
    	 System.out.println("x: " + x);
    	 
    	 // Gía trị lưu trữ ở vùng nhớ HEAP
    	 Integer iA = new Integer(22);//H6
    	 Integer iB = new Integer(44);//H7
    	 Integer iC = new Integer(44);//H8
    	 // 1 lần new ra --> luôn tạo mới ô nhớ


    	 System.out.println("iA: " + iA);
    	 System.out.println("iB: " + iB);
    	 System.out.println("iC: " + iC);
    	 
    	 // Gía trị lưu trữ ở vùng nhớ HEAP --> constant pool
    	 Integer oA = 66; //H9(66) --> oA.value = 66
    	 Integer oB = 88; //H10(88)
    	 Integer oC = 88; //H10
    	 // 1 lần khai báo, khởi tạo, gán giá trị mới
    	 // Kiểm tra trong vùng nhớ constant pool đã có gia strij mới đó chưa
    	 //+nếu chưa: --> tạo mới
    	 //+ có rồi --> không tạo mà trở đến ô nhớ có giá trị đó
    	 //Tiết kiệm vùng nhớ hơn
    	 System.out.println("oA: " + hash(oA));
    	 System.out.println("oB: " + hash(oB));
    	 System.out.println("oC: " + hash(oC));
    	 
    	 

	}
     private static int hash(Integer parameter) {
    	return System.identityHashCode(parameter);
     }
}
