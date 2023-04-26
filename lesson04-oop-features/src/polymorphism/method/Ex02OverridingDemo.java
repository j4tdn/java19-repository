package polymorphism.method;

public class Ex02OverridingDemo {
	private int value = 99;
	public static void main(String[] args) {
		Ex02OverridingDemo ex2 = new Ex02OverridingDemo();
		System.out.println("demo ->> " + ex2);
	}
	@Override
	public String toString() {
		int x = Integer.valueOf(value);
		return "" + x;
	}
	
	

}
