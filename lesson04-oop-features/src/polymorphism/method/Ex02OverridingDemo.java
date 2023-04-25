package polymorphism.method;


/*
 2 hay nhiều phương thức được gọi là overriding 
 nếu có phương thức ở lớp cha được override lại 
 trong 1 hoặc nhiều lớp con 
 */
public class Ex02OverridingDemo {
	private int value = 99;

	
	public static void main(String[] args) {
		Ex02OverridingDemo demo = new Ex02OverridingDemo();
		System.out.println("demo --> " + demo);
	
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "" + value;
	}
}
