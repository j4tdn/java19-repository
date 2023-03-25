package view;

public class Ex04NonStaticMethodDemo {
	
	private int a;
	private int b;
	
	public Ex04NonStaticMethodDemo(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int sum() {
		return this.a + this.b;
	}
	
	public static void main(String[] args) {
		
	}
}
