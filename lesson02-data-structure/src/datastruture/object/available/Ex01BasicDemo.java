package datastruture.object.available;

public class Ex01BasicDemo {

	public static void main(String[] args) {
		//demo Integer
		int x = 10;
		System.out.println("x: "+ x);
		
		Integer itA = new Integer(22); //H6
		Integer itB = new Integer(44); //H7
		Integer itC = new Integer(44); //H8
		
		System.out.println("itA: "+ itA);
		System.out.println("itB: "+ itB);
		System.out.println("itC: "+ itC);
		
		//giá trị lưu trữ ở HEAP constant pool 
		Integer oA = 66; // H9 (66) --> oA.value = 66
		Integer oB = 88; // H10 (88)
		Integer oC = 88; // H10 (88)
		Integer oD = 88; // H10 (88)
		oC = 12345; //oC -> H11 (12345)
		/*
		 * 1 lần khai báo, khởi tạo, gán giá trị mới
		 * kiểm tra trong constant pool đã có giá trị chưa?
		 * 		chưa: 	tạo mới
		 * 		rồi:	ko tạo mới mà trỏ đến ô nhớ đã có giá trị đó
		 */
		
		System.out.println("oA: "+ hash(oA));
		System.out.println("oB: "+ hash(oB));
		System.out.println("oC: "+ hash(oC));
		
		//block code {}
		System.out.println("---------");
		int N = 100000;
		//System.currentTimeMillis(); //số ms tính từ unix-time epoch time (gốc thời gian) 1.1.1970
		long start = System.currentTimeMillis();
		System.out.println("Duration: "+ (System.currentTimeMillis() - start) + "ms");
		
	}
		private static int hash(Integer parameter) {
			return System.identityHashCode(parameter);
		}

}
