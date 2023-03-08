package datastructure.object.available;

import javax.print.attribute.IntegerSyntax;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		//demo Integer
		int x = 10;
		System.out.println("X: "+ x);
		
		// Luu o HEAP
		// 1 lan new --> create new HEAP
		Integer iA = new Integer(22);//H6
		Integer iB = new Integer(44);//H7
		Integer iC = new Integer(44);//H8
		
		System.out.println("iA: "+ iA);
		System.out.println("iB: "+ iB);
		System.out.println("iC: "+ iC);
		
		// Luu o HEAP --> constant pool
		// 1 lan declare, create, set 
		//kiem tra vung nho constant pool 
		// da co gia tri do chua
		// + neu chua: create new in HEAP
		// + co roi: trỏ đến ô nhớ đã có giá trị đó rồi
		
		// Tiết kiệm vùng nhớ HEAP
		Integer oA = 66;//H9(66) -->oA.value = 66
		Integer oB = 88;//H10(88)
		Integer oC = 88;//H10
		Integer oD = 88;//H10
		oC = 12345;//H11
		
		System.out.println("oA: "+ oA);
		System.out.println("oB: "+ oB);
		System.out.println("oC: "+ oC);
		
		System.out.println("oA: "+ hash(oA));
		System.out.println("oB: "+ hash(oB));
		System.out.println("oC: "+ hash(oC));
		System.out.println("oD: "+ hash(oD));
		
		System.out.println("----------------");
		int N = 100000;
		long start =  System.currentTimeMillis();
		for (int i = 1; i <= N; i++) {//400000
			Integer i1 = new Integer(99);
			Integer i2 = new Integer(99);
		}
		System.out.println("duration x---->" + (System.currentTimeMillis()-start));
		
		start =  System.currentTimeMillis();
		for (int i = 1; i <= N; i++) {//200001
			Integer i1 = 99;
			Integer i2 = 99;
		}
		System.out.println("duration y---->" + (System.currentTimeMillis()-start));
	}
	
	private static int hash(Integer parameter) {
		return System.identityHashCode(parameter);
	}
	
	
}
