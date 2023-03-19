package view;

public class Ex04NonStaticMethodDemo {
	//attribute
	private int a;
	private int b;
	
	
	
	public Ex04NonStaticMethodDemo(int a, int b) {
		//super();
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) {
		Ex04NonStaticMethodDemo e1 = new Ex04NonStaticMethodDemo(1, 2);
		System.out.println("sum1 --> " + e1.sum());

		Ex04NonStaticMethodDemo e2 = new Ex04NonStaticMethodDemo(4, 5);
		System.out.println("sum2 --> " + e2.sum());
	}
		
		public int sum() {
			return this.a + this.b;
		}

}
