package polymorphism.method;

public class Child extends Parent {
	String text = "c1";

	String log() {
		return "child";
	}

	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.text);

		Child c = new Child();
		System.out.println(c.text);

		Parent pc = new Child();
		System.out.println(pc.text);
		System.out.println(pc.log());
	}
}
