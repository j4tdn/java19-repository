package polymorphism.method;

public class Child extends Parent{
	String text = "c1";
	
	String log() {
		return "child";
	}
	
	public static void main(String[] args) {
		Parent p =new Parent();
		System.out.println("p -- > " + p.text + ", " + p.log());
		Child p1 =new Child();
		System.out.println("p -- > " + p1.text + ", " + p1.log());
		Parent p2 =new Child(); // compile là ở lớp cha, runtime là ở lớp con
		System.out.println("p -- > " + p2.text + ", " + p2.log());
	}
}
