package string.immutable;

public class Ex03StringDemo01 {
	public static void main(String[] args) {
		
		String s = "hello, my name is teo";
		String s1 = ", nice to meet you all";
		System.out.println("Độ dài chuỗi: " + s.length());
		System.out.println("Nối chuỗi: " + s.concat(s1));
		System.out.println("Kí tự ở vị trí 3: " + s.charAt(3));

	}
	
	public static void loopWord(String s) {
		String[] tokens = s.split("[\\s,]+");
		for (String token: tokens) {
			System.out.println("|||" + token + "|||");
		}
	}
	
	private static void findFirstEnd(String s) {
		int first;
		int end;
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i) == 'a') first = i;
			
		}
	}
	
	
	
	
}
