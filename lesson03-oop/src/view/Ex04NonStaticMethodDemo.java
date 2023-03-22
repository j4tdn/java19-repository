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
		Ex04NonStaticMethodDemo e1 = new Ex04NonStaticMethodDemo(14, 10);
		Ex04NonStaticMethodDemo e2 = new Ex04NonStaticMethodDemo(7, 10);
		
		System.out.println("sum1: " + e1.sum());
		System.out.println("sum2: " + e2.sum());
	
	}
}

