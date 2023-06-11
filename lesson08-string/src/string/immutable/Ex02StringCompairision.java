package string.immutable;

public class Ex02StringCompairision {
	public static void main(String[] args) {
		String s1 = "susan";
		String s2 = "pepe";
		String s3 = "pepe";
		
		// so sánh địa chỉ
		System.out.println("s1==s1 --> " + s1==s2); 
		
//		String 
		
		//mặc định nếu dùng equals từ class Objects --> dùng toán tử == ở stack --> so sánh đại chỉ
		//override lại  thì so sánh giá trị của các thuộc tính  -> so sánh giá trị 
		System.out.println("s1.equals(s2) --> " + s1.equals(s2));
	}
}
