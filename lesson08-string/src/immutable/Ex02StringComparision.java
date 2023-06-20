package immutable;

public class Ex02StringComparision {
	public static void main(String[] args) {
		String s1 = "thanks";
		String s2 = "cam on";
		String s3 = "thanks";
		
		String o1 = new String("cam on");
		String o2 = new String("thanks");
		String o3 = new String("thanks");
		
		//so sánh địa chỉ
		System.out.println("s1==s2: " + (s1==s2));
		System.out.println("02==03: " + (02==02));
		
		//mặc định nếu hàm equals từ class object --> dùng toán tử == --> so sánh địa chỉ
		//override lại thì so sánh giá trị của các thuộc tính --> so sánh giá trị
		System.out.println("s1.equals(s2): " + (s1.equals(s2)));
		System.out.println("o2.equals(o3): " + (o2.equals(o3)));
		
		//so sánh giá trị lớn bé --> compareTo
		//s1.compareTo(s2)
		//>0 --> s1 > s2
		//=0 --> s1 = s2
		//<0 --> s1 < s2
		
		System.out.println("s1.compareTo(s2): " + (s1.compareTo(s2)));
		
		System.out.println("o2.compareTo(o3): " + (o2.compareTo(o3)));
		
	}

}
