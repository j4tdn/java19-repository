package string.multable;

public class Ex01StringMultable {
	public static void main(String[] args) {
		String s = "hello";
		s = s.concat(" viet nam");
		StringBuilder sbd = new StringBuilder("xin chao");
		System.out.println(System.identityHashCode(sbd));
		sbd.append(" viet nam");
		System.out.println(System.identityHashCode(sbd));
		
		StringBuffer sbf = new StringBuffer("bounjor");
		System.out.println(System.identityHashCode(sbf));
		sbf.append(" viet nam");
		
		System.out.println(System.identityHashCode(sbf));
	}
}
