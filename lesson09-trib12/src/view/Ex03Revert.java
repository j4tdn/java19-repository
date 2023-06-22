package view;

public class Ex03Revert {
	public static void main(String[] args) {
		String s = "Welcome  to JAVA10    class";
		s = s.replaceAll(" {1,}", " ");
		StringBuilder sb = revert(s);
		System.out.println(sb);
	}
	
	private static StringBuilder revert(String s) {
		StringBuilder res = new StringBuilder();
		for(int i = s.length() - 1; i >= 0; i--) {
			res.append(s.charAt(i));
		}
		return res;
	}
	
}