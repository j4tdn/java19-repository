package polymorphism.method;

public class Ex02OverridingDemo {
	
	private int value = 99;
	
	public static void main(String[] args) {
		Ex02OverridingDemo ex = new Ex02OverridingDemo();
		System.out.println(ex.toString());
	}
	
	@Override
	public String toString() {
		return "" + value;
	}
}
