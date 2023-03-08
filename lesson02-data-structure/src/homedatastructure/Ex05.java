package homedatastructure;

public class Ex05 {
public static void main(String[] args) {
	int i = 2;
	if (++i > 2 && i++ > 2) {
		i++;//4
	}
	if (i++ > 4 || ++i > 5) {
		System.out.println(i);
	}
	if (i++ < 4 || ++i > 5) {
		System.out.println(i);
	}
}
}

