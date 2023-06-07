package singleton;

public class SingletonDemo {
	public static void main(String[] args) {
		Clock c1 = Clock.getInstance();
		c1.setTime(0);
		System.out.println("c1 --->" + c1);
		
		Clock c2 = Clock.getInstance();
		System.out.println("c2 -->" + c2);
		
		hash("c1 hash", c1);
		hash("c2 hash", c2);
		
		
	}
	public static void hash(String prefix, Object o) {
		System.out.println(prefix + "; " + System.identityHashCode(0));
	}
}
