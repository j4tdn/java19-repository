package polymorphism.method;

public class Child extends Parent{
	
	String text = "c1";
	
	void playGame() {
		System.out.println("Nope");
	}
	
	@Override
	String log() {
		return "child";
	}
	
	public static void main(String[] args) {
		// Parent --> text(p1), log(parent)
		// Child --> text(c1), log(child)
		// khi 2 class có quan hệ cha con
		
		Parent p = new Parent();
		System.out.println("p --> " + p.text + ", " + p.log());
		
		Child c = new Child();
		System.out.println("c --> " + c.text + ", " + c.log());
		
		// pc
		// Compile --> Parent --> parent.text parent.log
		// Runtime --> Child  --> parent.text child.log
		
		// Cha bien = new Con();
		Parent pc = new Child();
		System.out.println("pc --> " + pc.text + ", " + pc.log());
		
		// Child cp = (Child) new Parent();
		// cp.playGame();
		
		// Vì sao ko lấy chính nó new chính nó
		// mà lấy lấy cha new con
		
		// Xem biến lúc runtime là ai
		System.out.println("pc runtime --> " + pc.getClass());
	}
}
