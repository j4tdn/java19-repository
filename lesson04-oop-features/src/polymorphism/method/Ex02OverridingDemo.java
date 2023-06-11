package polymorphism.method;


// 2 hay N phuong thuc duoc goi la overriding neu
// co phuogn thuc o lop cha duoc override lai trong 1 hoac N lop con --> overriding
public class Ex02OverridingDemo {
	
	//khi tao ra mot doi tuong tu class hien tai thi se co gia tri mac dinh la 99
	private int value = 99;
	
	public static void main(String[] args) {
		Ex02OverridingDemo demo = new Ex02OverridingDemo();
		System.out.println("demo --> "+ demo);
	}
	
	@Override
	public String toString() {
		return String.valueOf(value);
	}
}
