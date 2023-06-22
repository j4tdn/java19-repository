package string.mutable;

public class Ex01StringMutable {
public static void main(String[] args) {
	String s = "hello";
	hash("s before ", s);
	s = s.concat(" Viet Nam ");
	hash("s after " , s);
	System.out.println("\n==================\n");
	
	StringBuilder sbd = new StringBuilder("xin chao");
			hash("sbd before ", sbd);
			sbd.append("viet nam");
			hash("sbd after ", sbd);
			value("sbd ", sbd);
			
			System.out.println("\n=======================\n");
			
			StringBuffer sbf = new StringBuffer("bonjua");
			hash("sbf before ", sbf);
			sbf.append("viet nam");
			hash("sbf after", sbf);
			value("sbf ", sbf);
				
	
}
private static void hash(String text, Object o) {
	System.out.println(text + " -> " + System.identityHashCode(o));
}
private static void value(String text, Object o ) {
	System.out.println(text + "-> " + o);
}
}
