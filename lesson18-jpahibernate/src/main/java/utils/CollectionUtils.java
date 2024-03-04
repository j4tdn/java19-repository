package utils;

import java.util.Collection;

public class CollectionUtils {
	
private CollectionUtils() {
}

public static void generate(String prefix, Object o) {
	System.out.println(prefix + " ---> {");
	System.out.println("   " + o);
	System.out.println("}\n ");
}



public static <Element> void generate(String prefix, Collection<Element> element) {
	System.out.println(prefix + " ---> {");
	element.forEach(e -> System.out.println(" " + e));
	System.out.println("}\n ");
}

}
