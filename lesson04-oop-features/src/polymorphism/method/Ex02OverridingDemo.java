package polymorphism.method;

public class Ex02OverridingDemo {
	//mặc định khi tạo ra 1 đối tượng từ class
	//hiện tại thì sẽ có thuộc tính value = 99
	private int value = 99;
	
	public static void main(String[] args) {
		Ex02OverridingDemo demo = new Ex02OverridingDemo();
		System.out.println("demo " + demo);
	}
	//demo.toString();  H1(value = 99)
	
	@Override
	public String toString() {
		return "" + value;
	}	
	
}
