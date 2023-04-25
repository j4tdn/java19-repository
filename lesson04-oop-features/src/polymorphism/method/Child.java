package polymorphism.method;

public class Child extends Parent {
	String text = "t1";
	String log() {
		return "parent";
	}
	
	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println("p --> " + p.text + p.log());
		Child c = new Child();
		System.out.println("c --> " + c.text + c.log());
		
		Parent pc = new Child();

	
	}
	

}
