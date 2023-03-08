package datastructure.object.custom;

public class Ex02UpdateValue {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		
		a = b;
		a = 15;
		
		System.out.println("a" + a);
		System.out.println("b" + b);
		
		Student stuA = new Student(1,"A",20,"a");
		Student stuB = new Student(2,"A",20,"b");
		
		System.out.println("stuA code BF:" + System.identityHashCode(stuA));
		System.out.println("stuB code BF:" + System.identityHashCode(stuB));
		
		stuA = new Student(3,"C",22,"c");
		System.out.println("stuA code AT:" + System.identityHashCode(stuA));
		System.out.println("stuB code AT:" + System.identityHashCode(stuB));
	}
}
