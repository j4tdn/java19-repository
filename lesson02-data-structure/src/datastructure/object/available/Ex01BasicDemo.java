package datastructure.object.available;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		//demo Integer
        int x = 10;
        
        System.out.println("X :" +x);
        
        //gIÁ TRỊ lưu trữ ở vùng HEAP
        Integer iA = new Integer(22);
        Integer iB = new Integer(23);
        Integer iC = new Integer(24);
        // 1 LẦN NEW RA --> LUÔN TẠO MỚI Ô NHỚ
        
        System.out.println("iA:" +hash(iA));
        System.out.println("iB:" +hash(iB));
        System.out.println("iC:" +hash(iC));
        
        //GIÁ TRỊ LƯU TRỮ Ở VÙNG NHỚ HEAP --> CONSTANT POOL
        Integer oA = 66; //H9(66) --> oA.value
        Integer oB = 88; //H10(88)
        Integer oC = 88; //H10
        
        //1 LẦN KHAI BÁO, KHỞ TẠO, GÁN GIÁ TRỊ MỚI
        //KIỂM TRA TRONG VÙNG NHỚ CONSTANT POOL ĐÃ CÓ GIÁ TRỊ
        //MỚI ĐÓ CHƯA
        //+ NẾU CHƯA --> TẠO MỚI
        //+ NẾU CÓ --> KHÔNG TẠO MỚI MÀ TRỎ ĐỂ Ô NHỚ ĐÃ CÓ GIÁ TRỊ ĐÓ
        
        //TIẾT KIỆM VÙNG NHỚ HƠN
        
        System.out.println("oA: " + hash(oA));
        System.out.println("oB: " + hash(oB));
        System.out.println("oC: " + hash(oC));
	
	}
	private static int hash(Integer paramater ) {
		return System.identityHashCode(paramater);
	}

}
