package view;

public class Ex04NonStaticMethodDemo {
	int a;
	int b;
	
	public Ex04NonStaticMethodDemo(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) {
		Ex04NonStaticMethodDemo e1 = new Ex04NonStaticMethodDemo(3, 5);
		System.out.println("sum --> " + e1.sum());
	}
	
	public int sum() {
		return this.a + this.b;
	}
}
