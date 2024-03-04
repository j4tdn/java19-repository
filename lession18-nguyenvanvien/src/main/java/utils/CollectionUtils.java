package utils;

import java.util.Collection;

public class CollectionUtils {
	private CollectionUtils() {
		
	}
	
	public static <Element> void generate(String prefix, Collection<Element> element) {
		System.out.println(prefix + " --> {");
		element.forEach(e -> System.out.println("     " + e));
		
		System.out.println("}");
	}
	
	public static void generate(String prefix, Object object) {
		System.out.println(prefix + " --> {");
		System.out.println("     " + object);
		
		System.out.println("}");
	}
}
