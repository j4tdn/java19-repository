package polymorphism.method;

public class Ex02OverridingDemo {
	
	private int value = 99;
	
	
    public static void main(String[] args) {
		Ex01OverloadingDemo demo = new Ex01OverloadingDemo();
		System.out.println("demo --> " + demo);
	}
    @Override
    public String toString() {
    	return String.valueOf(value);
    }
    
}
