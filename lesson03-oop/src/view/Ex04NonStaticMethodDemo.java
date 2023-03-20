package view;

public class Ex04NonStaticMethodDemo {
	private int a;
	private int b;

	public Ex04NonStaticMethodDemo(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex04NonStaticMethodDemo r1 = new Ex04NonStaticMethodDemo(2, 3);
		System.out.println("r1 --> " + r1.sum());
		Ex04NonStaticMethodDemo r2 = new Ex04NonStaticMethodDemo(2, 5);
		System.out.println("r2 --> " + r2.sum());

	}

	private int sum() {
		return this.a + this.b;
	}

}
