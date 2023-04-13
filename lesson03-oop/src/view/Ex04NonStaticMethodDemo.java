package view;

public class Ex04NonStaticMethodDemo {
	private int a;
	private int b;

	public int sum() {
		return this.a + this.b;
	}

	public Ex04NonStaticMethodDemo(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) {
		Ex04NonStaticMethodDemo e1 = new Ex04NonStaticMethodDemo(1, 2);
		System.out.println(e1.sum());
		Ex04NonStaticMethodDemo e2 = new Ex04NonStaticMethodDemo(1, 3);
		System.out.println(e2.sum());
		Ex04NonStaticMethodDemo e3 = new Ex04NonStaticMethodDemo(1, 4);
		System.out.println(e3.sum());
	}
}
