package datastructure.object.available;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		//demo Integer
		int x = 10;
		System.out.println("x: " + x);
		
		//giá trị được lưu ở HEAP
		Integer iA = new Integer(22);
		Integer iB = new Integer(44);
		Integer iC = new Integer(44);
		//1 lần new ra --> luôn tạo mới ô nhớ
		
		System.out.println("itA: "+ iA);
		System.out.println("itB: "+ iB);
		System.out.println("itC: "+ iC);
		
		//Giá trị lưu trữ ở HEAP --> constant pool
		Integer oA = 66;
		Integer oB = 88;
		Integer oC = 88;
		//1 lần khai báo, khởi tạo, gán giá trị mới
		
		System.out.println("oA: " + hash(oA));
		System.out.println("oA: " + hash(oB));
		System.out.println("oA: " + hash(oC));

		
	}
	private static int hash(Integer parameter) {
		return System.identityHashCode(parameter);
	}
		
}
