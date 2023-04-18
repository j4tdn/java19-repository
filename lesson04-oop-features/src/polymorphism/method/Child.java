package polymorphism.method;

public class Child extends Parent {
	String text = "c1";

	String log() {
		return "child";
	}

	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.text + ", " + p.log());

		Child c = new Child();
		Parent pc = new Child();
		System.out.println("pc ->" + pc.text + ", " + pc.log());
		System.out.println("pc runtime --> " +pc.getClass());
	}
}
