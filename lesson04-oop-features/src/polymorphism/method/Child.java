package polymorphism.method;

public class Child extends Parent{
	//String text = "c1";
	String log() {
		return "child";
	}
	public static void main(String[] args) {
		Parent c1 = new Child();
		System.out.println(c1.text);
		System.out.println(c1.log());
	}
	
	
}
