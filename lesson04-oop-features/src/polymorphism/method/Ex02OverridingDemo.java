package polymorphism.method;

public class Ex02OverridingDemo {
	// khi tao ra 1 object tu class
	//hien tai thi se co attribute value = 99
	private int value = 99;
	
	public static void main(String[] args) {
		Ex02OverridingDemo demo = new Ex02OverridingDemo();
		System.out.println("demo ---> " + demo);
	}
	@Override
	public String toString() {
		return "" + value;
	}
}
