package string.mutable;

public class Ex01StringMutable {
	public static void main(String[] args) {
		String s = "hello";
		s= s.concat(" Viet Nam");
		hash("s after", s);
		System.out.println("---------------------------");
		StringBuilder sbd = new StringBuilder("xin chao");
		hash("sbd before", sbd);
		sbd.append(" Viet nam");
		hash("sbd ofter", sbd);
		value("sbd", sbd);
		System.out.println("---------------------------");
		StringBuilder sbf = new StringBuilder("bongdua");
		hash("sbf before", sbd);
		sbf.append(" Viet Nam");
		hash("sbf ofter", sbf);
		value("sbf", sbf);
		
	}
	private static void hash(String text, Object o) {
		System.out.println(text + " --> " + System.identityHashCode(o));
	}
	private static void value(String text, Object o) {
		System.out.println(text + " --> "+ o);
	}

}
