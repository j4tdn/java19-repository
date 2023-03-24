package view;

public class Ex04NonStaticMethodDemo {
	private int a;
	private int b;
	
	public Ex04NonStaticMethodDemo(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int sum() {
		return this.a  + this.b;
	}
	
	public static void main(String[] args) {
		Ex04NonStaticMethodDemo ex = new Ex04NonStaticMethodDemo(1, 2);
		System.out.println(ex.sum());
		
		Ex04NonStaticMethodDemo ex2 = new Ex04NonStaticMethodDemo(2, 3);
		System.out.println(ex2.sum());
		
		Ex04NonStaticMethodDemo ex3 = new Ex04NonStaticMethodDemo(4, 5);
		System.out.println(ex3.sum());
	}
}
