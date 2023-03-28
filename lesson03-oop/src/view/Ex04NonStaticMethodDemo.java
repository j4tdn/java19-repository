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
		Ex04NonStaticMethodDemo e1 = new Ex04NonStaticMethodDemo(10, 20);
		System.out.println("e1 sum --> " + e1.sum());
		Ex04NonStaticMethodDemo e2 = new Ex04NonStaticMethodDemo(30, 40);
		System.out.println("e2 sum --> " + e2.sum());
		Ex04NonStaticMethodDemo e3 = new Ex04NonStaticMethodDemo(50, 60);
		System.out.println("e3 sum --> " + e3.sum());
	}

}
