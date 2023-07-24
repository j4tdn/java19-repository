package exercises;

import java.util.Arrays;

public class Ex04 {
public static void main(String[] args) {
	String[] st = {"-2", "-6", "10", null, "4", "8", null, "Special", "a", "c",
			"b", "xx"};
	
	Arrange(st, (s1,s2) -> {
		if(s1 == "Special" ) {
			return false;
		}
		
		if(s2 == "Special" || s2 == null) {
			return true;
		}
			return s1.compareTo(s2) > 0;
	});
	
	System.out.println("result by ASC-> " + Arrays.toString(st));
	
	Arrange(st, (s1,s2) -> {
		if(s1 == "Special" && s2 != "Special") {
			return true;
		}
		
		if(s1 == null && s2 == null) {
			return false;
		}
		
		return s1.compareTo(s2) < 0;
	});
	System.out.println("result by DESC-> " + Arrays.toString(st));
}
private static void Arrange(String[] st, StringComparator comparator) {
	for(int i = 0; i < st.length; i++) {
		for(int j = 0; j < st.length - i -1; j++) {
		
			if(comparator.compare(st[j], st[j + 1])) {
				ArrayFunctional.swap(st, j, j + 1);
			}
		}
	}
}
}
