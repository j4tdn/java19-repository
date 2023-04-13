package polymorphism.method;

public class Child extends Parent {
	String text = "c1";
	
	String log() {
		return "child";
	}
	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println("p -->" +p.text +","+ p.log());
		
		//pc
		//compile:parent --> parent.text, parent.log()
		//runtime:child  --> parent.text, child.log()
		
		//cha bien = new con();
		Parent pc = new Child();
		System.out.println("pc -->" + pc.text+ ","+ pc.log());
		
		//xem variable luc runtime la ai
		System.out.println("pc runtime -->" + pc.getClass());
		
		//why lay cha new con, ko lay con new chinh no
	}
	

}
