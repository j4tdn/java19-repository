package view;

public class Ex04NonStaticMethodDemo2 {
	private int a;
	 private int b;
	 
	 public Ex04NonStaticMethodDemo2(int a, int b) {
			super();
			this.a = a;
			this.b = b;
		}
	 
	 public int sum() {
			return this.a+ this.b;
		}
	public static void main(String[] args) {
		Ex04NonStaticMethodDemo2 e1 = new Ex04NonStaticMethodDemo2(1, 2);
		System.out.println("e1 sum --> " + e1.sum());
	}
	
}
