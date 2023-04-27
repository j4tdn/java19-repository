package polymorphism.method;

public class Child extends Parent {
	String text = "c1";
	
	String log() {
		return "child";
	}
	
	public static void main(String[] args) {
		//Parent --> text(p1), log(parent)
		//Child  --> text(c1), log(child)
		//khi 2 class có quan hệ cha con
		
		Parent p = new Parent();
		System.out.println("p --> " + p.text + ", " + p.log());
		
		Child c = new Child();
		System.out.println("c --> " + c.text + ", " + c.log());
		
		
		//pc
		//Compile --> Parent --> parent.text parent.log
		//Runtime --> Child --> child.text child.log
		
		//cha biến = new Con();
		Parent pc = new Child();
		System.out.println("pc --> " + pc.text + ", " + pc.log());
		
		
		//xem biến lúc runtime
		System.out.println("pc runtime --> " + pc.getClass());
		
	}

}
