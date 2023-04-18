package polymorphism.method;

// 2 hay n phương thức được gọi là overiding nếu có phương thức ở 
//lớp cha đucợ overide lại trong 1 hpặc N lớp con -> overiding

public class Ex02OverridingDemo {
	private int value = 99;

	public static void main(String[] args) {
		Ex02OverridingDemo demo = new Ex02OverridingDemo();
		System.out.println("demo -> " + demo);
	}

	@Override
	public String toString() {
		return "" + value;
	}
}
