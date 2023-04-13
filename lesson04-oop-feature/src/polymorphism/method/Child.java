package polymorphism.method;

public class Child extends Parent {
	String text = "c1";
	String playGame() {
		return "nope";
	}
	
	String log() {
		return "Child";
	}
	
	public static void main(String[] args) {
		//Parent --> text(p1), log(parent)
		//Child --> text(c1), log(child)
		//khi 2 class có quan hệ cha con
		
		Parent p = new Parent();
		System.out.println("p --> " + p.text + ", " + p.log());
		
		Child c = new Child();
		System.out.println("c --> " + c.text + ", " + c.log());
		
		//pc
		//Compile --> Parent --> parent.text parent.log
		//Runtime --> Child --> parent.text child.log
		
		//Cha bien = new Con();
		Parent pc = new Child();
		System.out.println("pc --> " + pc.text + ", " + pc.log());
		
		System.out.println("runtime --> " + pc.getClass());
		
		//Child cp = (Child) new Parent();
		//cp.playGame(); //-->runtime error
		
		//Vì sao ko lấy chính nó new chính nó?
		//mà phải lấy cha new con?
	}
}
