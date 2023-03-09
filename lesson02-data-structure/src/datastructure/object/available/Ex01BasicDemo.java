package datastructure.object.available;

public class Ex01BasicDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// gia tri luu tru o vung nho HEAP
		Integer a = new Integer(4); //h1
		Integer d = new Integer(5); //h2
		// 1 lan new ra --> luon tao moi o nho
		
		System.out.println(a);
		Integer b = 11;
		System.out.println(b);
		
		// van luu tru o HEAP --> constant pool
		Integer oA = 1; // h4 --> oA.value = 66
		Integer oB = 2;
		Integer oC = 2;
		hash(2);
		hash(oB);
		hash(oC);
		// 1 lan khai bao, khoi tao, gan gia tri moi
		// Kiem tra trong vung nho constant pool da co gia tri moi do chua
		// 	+ neu chua --> tao moi
		// 	+ co roi --> khong tao moi ma tro den o nho da co gia tri do
		
		System.out.println("--------------");
		int N = 1000000000;
		long start = System.currentTimeMillis();
		// --> số millis tính từ unix-time epoch time (mốc thời gian) 1.1.1970
		for(int i = 1; i <= N; i++) {
			Integer i1 = new Integer(11);
			Integer i2 = new Integer(11);
		}
		System.out.println("duration x -->: "+ (System.currentTimeMillis() - start) + " ms");
		
		start = System.currentTimeMillis();
		for(int i = 1; i <= N; i++) {
			Integer i1 = 11;
			Integer i2 = 11;
		}
		System.out.println("duration y -->: "+ (System.currentTimeMillis() - start) + " ms");
	}

	private static void hash(Integer parameter) {
		System.out.println(System.identityHashCode(parameter));
	}
}
