package polymorphism.method;

public class Child extends Parent {
	String text = "c1";

	String log() {
		return "child";
	}

	public static void main(String[] args) {
		// Parent --> text(p1), log(parent)
		Parent p = new Parent();
		System.out.println("p --> " + p.text + "," + p.log());

		Child c = new Child();
		System.out.println("c --> " + c.text + "," + c.log());

		Parent pc = new Child();
		System.out.println("pc ---> " + pc.text + "," + pc.log());

		System.out.println("pc runtime ---> " + pc.getClass());
	}
}
